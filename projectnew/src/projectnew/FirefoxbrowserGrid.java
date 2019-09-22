package projectnew;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class FirefoxbrowserGrid {
    private WebDriver driver;
    private String baseUrl;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
    	  DesiredCapabilities capability = DesiredCapabilities.firefox();
   	   driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
   	   baseUrl = "http://www.5elementslearning.com";
   	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testRecordedLogin() throws Exception {
      driver.get(baseUrl + "/demosite/");
      driver.findElement(By.cssSelector("#tdb3 > span.ui-button-text")).click();
      driver.findElement(By.name("email_address")).clear();
      
  driver.findElement(By.name("email_address")).sendKeys("abc@demo.com");
      driver.findElement(By.name("password")).clear();
      driver.findElement(By.name("password")).sendKeys("demo@123");
      driver.findElement(By.id("tdb5")).click();
      driver.findElement(By.linkText("Log Off")).click();
      driver.findElement(By.linkText("Continue")).click();
    }

    @After
    public void tearDown() throws Exception {
      driver.quit();
      String verificationErrorString = verificationErrors.toString();
      if (!"".equals(verificationErrorString)) {
        fail(verificationErrorString);
      }
    }

    private boolean isElementPresent(By by) {
      try {
        driver.findElement(by);
        return true;
      } catch (NoSuchElementException e) {
        return false;
      }
    }

  }
