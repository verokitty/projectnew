package projectnew;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*PQ3. Open the page - http://the-internet.herokuapp.com/javascript_alerts. Click on JS Confirm. Click on Cancel
Verify the message on screen.*/

public class Alertcheck {
	WebDriver driver;
	  @Before
	  public void setUp() throws Exception {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\veronica\\Downloads\\Training downloads\\chromedriver.exe");//set the chrome driver
		driver=new ChromeDriver();
		
	}
	  @Test
		public void test() throws InterruptedException, IOException {
		  driver.get("http://the-internet.herokuapp.com/javascript_alerts");//Click for JS Confirm
		

		  driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
		//  driver.findElement(By.linkText("Click for JS Confirm")).click();
		  Alert alert = driver.switchTo().alert();
		  
		  Thread.sleep(2000);
		  
		    String text=alert.getText();
		    System.out.println(text);
		    
		    alert.dismiss();

			  File photo=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(photo, (new File("G:\\cpsatnewproject\\projectnew\\Screenshots\\Screenshot1.png")));
				
		   
		    System.out.println("Alert Closed---PASSED");
	}

	
	  

	  @After
	  public void tearDown() throws Exception {
	  //  driver.close();
	     }
}
