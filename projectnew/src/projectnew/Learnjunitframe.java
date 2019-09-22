package projectnew;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Learnjunitframe {
WebDriver driver;
	
	@Before
	public void setup() throws Exception{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\veronica\\Downloads\\Training downloads\\chromedriver.exe");//set the chrome driver
		driver=new ChromeDriver();
	}
	
	@Test
	public void loginLogout() throws Exception{
		driver.get("http://5elementslearning.com/demosite"); //open the application
		Thread.sleep(2000);
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.name("email_address")).sendKeys("abc@demo.com");
		driver.findElement(By.name("password")).sendKeys("demo@123");
		driver.findElement(By.id("tdb5")).click();
		driver.findElement(By.linkText("Log Off")).click();
		driver.findElement(By.linkText("Continue")).click();
	}
	
	@After
	public void cleanup() throws Exception{
		driver.close();//close the browser
	}
}



