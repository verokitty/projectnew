package projectnew;


	import java.util.concurrent.TimeUnit;
	import org.junit.*;
	import org.openqa.selenium.*;
	import org.openqa.selenium.chrome.*;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class Webdriworwait {

		  private WebDriver driver;
		  private String baseUrl;

		  @Before
		  public void setUp() throws Exception {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\veronica\\Downloads\\Training downloads\\chromedriver.exe");//set the chrome driver
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //global timeout
		  }

		  @Test
		  public void testRecordedLogin() throws Exception {
		    driver.get("http://5elementslearning.com/demosite");
		    driver.findElement(By.linkText("My Account")).click();
		    driver.findElement(By.name("email_address")).clear();
			driver.findElement(By.name("email_address")).sendKeys("abc@demo.com");
			driver.findElement(By.name("password")).clear();
			
	driver.findElement(By.name("password")).sendKeys("demo@123");
			driver.findElement(By.id("tdb5")).click();
			
			//Introduce Explicit Wait
			driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
			
		    WebDriverWait wait = new WebDriverWait(driver, 20);  
		    wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("JUNK"))); //explicit wait- dynamic wait/ 
		    
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		    driver.findElement(By.linkText("Log Off")).click();
		    driver.findElement(By.linkText("Continue")).click();
		  }

		  @After
		  public void tearDown() throws Exception {
		    driver.close();
		     }
		  }


