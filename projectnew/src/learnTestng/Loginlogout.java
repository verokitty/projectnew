package learnTestng;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Loginlogout {
	WebDriver driver;
	@Before
	public void setup() throws Exception{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\veronica\\Downloads\\geckodriver.exe");//set the chrome driver
		driver=new FirefoxDriver();
	}
	
	@Test
	public void loginLogout() throws Exception{
		driver.get("http://www.wikipedia.org"); //open the application
		 driver.manage().window().maximize();
		WebElement Search_field =driver.findElement(By.id("searchInput")); 
		Search_field.sendKeys("Selenium");
		WebElement Search_button =driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button/i")); 
		Search_button.click();//firstHeading
		WebElement Heading_of_page =driver.findElement(By.id("firstHeading"));
		String Heading=Heading_of_page.getText();
		if(Heading.equals("Selenium"))
		System.out.println("Heading present");
	}
	
	@After
	public void cleanup() throws Exception{
		driver.close();//close the browser
	}
}
