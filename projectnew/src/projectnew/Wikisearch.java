package projectnew;

import java.io.FileInputStream;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Wikisearch {
	/*PQ2. Open wikipedia.org - search Selenium. verify title of the
	page returns Selenium*/
	WebDriver driver;
	@Before
	public void setup() throws Exception{
		System.setProperty("webdriver.chrome.driver", "G:\\cpsatnewproject\\PracticeCPSAT\\Resource\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
	}
	
	@Test
	public void loginLogout() throws Exception{
		Properties obj = new Properties(); 
		FileInputStream file=new FileInputStream("G://cpsatnewproject//projectnew//src//projectnew//obj.properties");
		obj.load(file);
		driver.get("http://www.wikipedia.org"); //open the application
		 driver.manage().window().maximize();
		WebElement Search_field =driver.findElement(By.id(obj.getProperty("searchInputval"))); 
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
