package projectnew;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdateGender {
	WebDriver driver;
	  @Before
	  public void setUp() throws Exception {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\veronica\\Downloads\\Training downloads\\chromedriver.exe");//set the chrome driver
		driver=new ChromeDriver();
		
	}

	  @Test
	  public void recordupdate() throws Exception {
	    driver.get("http://5elementslearning.com/demosite");
	    
	    driver.findElement(By.linkText("My Account")).click();
	    driver.findElement(By.name("email_address")).clear();
		driver.findElement(By.name("email_address")).sendKeys("abc@demo.com");
		driver.findElement(By.name("password")).clear();
		
driver.findElement(By.name("password")).sendKeys("demo@123");
		driver.findElement(By.id("tdb5")).click();
		
	  /*  WebDriverWait wait = new WebDriverWait(driver, 20);  
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("JUNK"))); *///explicit wait- dynamic wait/ 
	    WebElement Updaterecordlink=driver.findElement(By.linkText("View or change my account information."));//.click();
	   
	    Updaterecordlink.click();
	    WebElement Gender=driver.findElement(By.xpath("//input[@name='gender'][1]"));
	    WebElement NewGender=driver.findElement(By.xpath("//input[@name='gender'][2]"));
	    if(Gender.isSelected()) {
	    	NewGender.click();
	    }
	    else Gender.click();
	    
	    		 
	    WebElement Phonenumber=driver.findElement(By.name("telephone"));
	    Phonenumber.clear();
	    Phonenumber.sendKeys("987678");
	    driver.findElement(By.linkText("Continue")).click();
}
}/*Select drpdwnskill = new Select(driver.findElement(By.name("skills")));

 i = drpdwnskill.getOptions().size();
// printing the size
System.out.print("number of options = " + i + "\n");
assertEquals(240, i);

// selecting option in Drop-down using Visible Text
drpdwnCountry.selectByVisibleText("India");
assertEquals("India", drpdwnCountry.getFirstSelectedOption().getText());
\\\
Alert alert = driver.switchTo().alert();//shift the focus from the main window to the alert window
	    String text=alert.getText();
	    System.out.println(text);
	    alert.accept(); //clicking on Ok button
*/
