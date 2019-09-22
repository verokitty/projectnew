package learnTestng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest2 {
	WebDriver driver;
  @Test
  public void f() {
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
  @BeforeTest
  public void beforeTest() {
	  
		System.setProperty("webdriver.chrome.driver","C:\\Users\\veronica\\Downloads\\Training downloads\\chromedriver.exe");//set the chrome driver
		driver=new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }
  }


