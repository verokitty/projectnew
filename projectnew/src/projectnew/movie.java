package projectnew;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class movie {

	
	WebDriver driver;
	
	
	@Before
	 public void setup() throws Exception{
				//System.setProperty("webdriver.gecko.driver","G:\\cpsatnewproject\\projectnew\\Drivers\\geckodriver.exe");//set the chrome driver
				//driver=new FirefoxDriver();
			System.setProperty("webdriver.chrome.driver","C:\\Users\\veronica\\Downloads\\Training downloads\\chromedriver.exe");//set the chrome driver
			driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); 
	  }
	  
	 @Test
	 public void movies() throws InterruptedException{
		 driver.get("http://www.allmovie.com/");
		 WebDriverWait wait=new WebDriverWait(driver, 30);
		 WebElement Search_field=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search']")));
		 Search_field.sendKeys("GODFATHER");
		  Search_field.sendKeys(Keys.ENTER); 
		  
		Thread.sleep(5000);
		  List <WebElement> abc1=driver.findElements(By.xpath("//div[@id='cmn_wrap']//div[@class='content']//div[@class='results']//ul[@class='search-results']/li"));
		  for(WebElement abc:abc1) {
			  System.out.println("********");
			 System.out.println(abc.getText());
			 System.out.println("********");
			 if((( abc.findElement(By.tagName("a"))).getText().contains("1972")));
			 { abc.findElement(By.tagName("a")).click();
			 break;}
		  }
			  
		//  /html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/header[1]/hgroup[2]/span[1]
		  
				  WebElement genere_field=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='overflow-container movie']//div[@id='cmn_wrap']/div[@class='content-container']//div[@class='content'/header[1]/hgroup[2]/span[@class='header-movie-genres']/a")));
		  if(genere_field.getText().contains("Crime")) {
			  System.out.println("verified its crime");
		  }
		  else System.out.println("verified its NOT crime");
			  
		  WebElement MAA_field=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/header[1]/hgroup[2]/span[6]/span[1]")));
		  if(MAA_field.getText().contains("A")) {
			  System.out.println("MAA RATE is A");
		  }
		  else System.out.println("verified its NOT A");
		  WebElement CREW_field=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Cast & Crew')]")));
		  CREW_field.click();
		  WebElement CREWd_field=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//section[@class='cast-and-crew']//div[@class='director_container']//a[contains(text(),'Francis Ford Coppola')]")));

		  if(CREWd_field.getText().contains("Francis Ford Coppola")) {
			  System.out.println("Francis Ford Coppola is true");
		  }
		  else System.out.println("Francis Ford Coppola is NOT true");
		  
	
	  WebElement CREWac_field=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='cast_info']//a[contains(text(),'Al Pacino')]")));

	  if(CREWac_field.getText().contains("Al Pacino")) {
		  System.out.println("Al Pacino is true");
		
		  WebElement CREWchar_field=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		  	if(CREWchar_field.getText().contains("Michael Corleone")) {
			  System.out.println("Michael Corleone is true");
			//div[@class='cast_info']//div[@class='cast_role'][contains(text(),'Michael Corleone')]
		  } 
		  	}
	  else System.out.println("Al Pacino is NOT true");
}


	 
	  
	
	   @After
	  public void f() {
		  //driver.close();
	  }
	  
}
