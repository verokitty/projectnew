package projectnew;


	import java.util.List;

	import org.junit.After;
	import org.junit.Before;
	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class Q1 {
		WebDriver driver;
		
		
		
	@Before 
	public void InitiateBrowser() {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\veronica\\Downloads\\Training downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void TestQuestion1() throws InterruptedException {
		driver.get("https://www.pepperfry.com/");
		//driver.findElement(By.className("popup-close")).click();
		Thread.sleep(3000);
		WebElement searchfield=driver.findElement(By.id("search"));
		searchfield.sendKeys("Beadsheet");
		searchfield.sendKeys(Keys.ENTER);
		 WebDriverWait wait = new WebDriverWait(driver, 20);  
		    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("curSortType")));
		    
		    WebElement sortfield1=driver.findElement(By.id("curSortType"));
		    sortfield1.click();
		    WebElement sortfield=driver.findElement(By.xpath("//*[@id='sortBY']/li[2][@data-sort='price-asc']"));
		    sortfield.click();// WebElement sortfieldc=driver.findElement(By.linkText("Price: Low to High"));
		  /* Actions action=new Actions(driver);
		    action.moveToElement(sortfield1).clickAndHold().moveToElement(sortfield).click().build();
		    action.perform();
		Select select=new Select(sortfield);
		select.*/
	    List <WebElement> pricelist=driver.findElements(By.className("clip-offr-price"));
	    for(WebElement price:pricelist) {
	    	String a =  price.getText();
	    	//a.substring(3);
	    	System.out.println("price"+a.substring(3));
	    	
	    }
	   
		
	}

	@After
	public void closethedriver() {
		driver.close();
	}
	}


