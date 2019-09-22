package projectnew;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
  @AfterTest
  public void f() {
	  driver.close();
  }
  @BeforeTest
  
	  public void setup() throws Exception{
			System.setProperty("webdriver.gecko.driver","G:\\cpsatnewproject\\projectnew\\Drivers\\geckodriver.exe");//set the chrome driver
			driver=new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\veronica\\Downloads\\Training downloads\\chromedriver.exe");//set the chrome driver
		//driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); 
  }

  @Test
  public void afterTest() throws Exception {
	  driver.get("https://www.meripustak.com");
	  ReadWriteExcel.setExcelFile("G://cpsatnewproject//projectnew//Drivers//Test1.xlsx","Sheet2");
	 for(int i=0;i<3;i++) 
	 {Thread.sleep(2000);
		 String textfromexcel=ReadWriteExcel.getCellData(i,0);
		 Thread.sleep(2000);
		 WebDriverWait wait=new WebDriverWait(driver, 30);
	 
	  WebElement Search_field=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txtsearch']")));
		 //HClink.click();
	  System.out.println("************Book="+textfromexcel);
	  Search_field.sendKeys(textfromexcel);
	  Search_field.sendKeys(Keys.ENTER); 
	  int j=1;
	 // List<WebElement> abc1 = new List <WebElement>(10);/html/body/form/div[5]/div[2]/div[3]/ul/li[2]/div[5]/span[2]
	  List <WebElement> abc1=driver.findElements(By.xpath("/html/body/form/div[5]/div[2]/div[@id='book_list']/ul/li"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	  for(WebElement abc:abc1) {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
						  WebElement books=  driver.findElement(By.xpath("/html/body/form/div[5]/div[2]/div[@id='book_list']/ul/li"+j+"/div[2]/span[2]"));
						  System.out.println("offer--->"+books.getText().toString());
						  if(books.getText().contains("OFF")) {
							  
							  	WebElement booksoff=  driver.findElement(By.xpath("/html/body/form/div[5]/div[2]/div[@id='book_list']/ul/li"+j+"/div[@class='book_list_name']"));
						  
							  	System.out.println("bookname"+booksoff.getText().toString());
							  	System.out.println("bookname->"+booksoff.getAttribute("name"));
						  }		 
						  j++;
						  if(j>10) break;
		  	}
		  	
		  }
  }
	 }


