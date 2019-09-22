package projectnew;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalculateEQ {
WebDriver driver;
String A,B,C,D;
@Before
public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\veronica\\Downloads\\Training downloads\\chromedriver.exe");//set the chrome driver
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
}

@Test
public void recordupdate() throws Exception {
	driver.get("http://ata123456789123456789.appspot.com/");
	WebDriverWait wait = new WebDriverWait(driver, 20);
	  WebElement Euclidradiobtn=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("tbody:nth-child(1) tr:nth-child(3) td:nth-child(1) span.gwt-RadioButton:nth-child(7) > label:nth-child(2)")));
	  Euclidradiobtn.click();
	
	  String Eq="(a*a)–2*(a*b)+(b*b)";
	
	  		if(Eq.contains("2*(a*b)"))
	  			{  System.out.println("C-B=1");
				  WebElement fieldA=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ID_nameField1']")));
				  fieldA.clear();
				  
				  fieldA.sendKeys("1");//input[@id='ID_nameField1']
				  WebElement fieldB=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ID_nameField2']")));
				  fieldB.clear();
				  fieldB.sendKeys("1");//input[@id='ID_nameField2']
				  WebElement Muldradiobtn=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("tbody:nth-child(1) tr:nth-child(3) td:nth-child(1) span.gwt-RadioButton:nth-child(2) > label:nth-child(2)")));
				  Muldradiobtn.click();
				  WebElement calcubtn=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='ID_calculator']")));
				  calcubtn.click();
				  WebElement fieldC=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ID_nameField2']")));
				   String c1=fieldC.getText().toString();
				   fieldA.sendKeys(c1);//input[@id='ID_nameField1']
					 // WebElement fieldB=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ID_nameField2']")));
					  fieldB.clear();
					  fieldB.sendKeys("2");//input[@id='ID_nameField2']
					  //WebElement Muldradiobtn=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("tbody:nth-child(1) tr:nth-child(3) td:nth-child(1) span.gwt-RadioButton:nth-child(2) > label:nth-child(2)")));
					  Muldradiobtn.click();
					  calcubtn.click();
					 // WebElement fieldC=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ID_nameField2']")));
					   C=fieldC.getText().toString();
				   //fieldB.clear();
				//button[@id='ID_calculator']
	  			}
				if(Eq.contains("(a*a)"))
					 System.out.println("C-B=2");
				{ 
				  WebElement fieldA=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ID_nameField1']")));
				  fieldA.clear();
				  
				  
				  fieldA.sendKeys("1");//input[@id='ID_nameField1']
				  WebElement fieldB=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ID_nameField2']")));
				  fieldB.clear();
				  fieldB.sendKeys("1");
				  //fieldB.clear();
				  WebElement Muldradiobtn=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("tbody:nth-child(1) tr:nth-child(3) td:nth-child(1) span.gwt-RadioButton:nth-child(2) > label:nth-child(2)")));
				  Muldradiobtn.click();
				  WebElement calcubtn=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='ID_calculator']")));
				  calcubtn.click();
				  WebElement fieldC=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ID_nameField2']")));
				  B=fieldC.getText().toString();
				//button[@id='ID_calculator']
				 // fieldAfieldB.sendKeys("0");
				}

				if(Eq.contains("(b*b)"))
				{  System.out.println("C-B=2");
				//input[@id='ID_nameField1']
					 WebElement fieldA=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ID_nameField1']")));
					  fieldA.clear();
					  
					  fieldA.sendKeys("1");//input[@id='ID_nameField1']
					  WebElement fieldB=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ID_nameField2']")));
					  fieldB.clear();
					  fieldB.sendKeys("1");//input[@id='ID_nameField2']
				WebElement Muldradiobtn=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("tbody:nth-child(1) tr:nth-child(3) td:nth-child(1) span.gwt-RadioButton:nth-child(2) > label:nth-child(2)")));
				Muldradiobtn.click();
				WebElement calcubtn=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='ID_calculator']")));
				calcubtn.click();
				WebElement fieldC=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ID_nameField2']")));
				A=fieldC.getText().toString();
				//button[@id='ID_calculator']
				//input[@id='ID_nameField3']
				//fieldB.sendKeys("0");
				}

				System.out.println("C-B=");
				//input[@id='ID_nameField1']
				
					  WebElement fieldA=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ID_nameField1']")));
					  fieldA.clear();
					  
					  fieldA.sendKeys(B);//input[@id='ID_nameField1']
					  WebElement fieldB=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ID_nameField2']")));
					  fieldB.clear();
					  fieldB.sendKeys(C);//input[@id='ID_nameField2']
				WebElement addradiobtn=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("tbody:nth-child(1) tr:nth-child(3) td:nth-child(1) span.gwt-RadioButton:nth-child(6) > label:nth-child(2)")));
				Euclidradiobtn.click();
				WebElement calcubtn=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='ID_calculator']")));
				calcubtn.click();
				WebElement fieldC=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ID_nameField2']")));
				D=fieldC.getText().toString();
				//button[@id='ID_calculator']
				//input[@id='ID_nameField3']
				

				 System.out.println("C-B=F"+D);
				//input[@id='ID_nameField1']
				
					  //WebElement fieldA=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ID_nameField1']")));
					  fieldA.clear();
					  
					  fieldA.sendKeys(D);//input[@id='ID_nameField1']
					  //WebElement fieldB=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ID_nameField2']")));
					  fieldB.clear();
					  fieldB.sendKeys(A);//input[@id='ID_nameField2']
				//WebElement addradiobtn=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("tbody:nth-child(1) tr:nth-child(3) td:nth-child(1) span.gwt-RadioButton:nth-child(1) > label:nth-child(2)")));
				addradiobtn.click();
				//WebElement calcubtn=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='ID_calculator']")));
				calcubtn.click();
				//WebElement fieldC=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ID_nameField2']")));
				String Res=fieldC.getText().toString();
				System.out.println("Result="+Res);
				//button[@id='ID_calculator']
				//input[@id='ID_nameField3']
				

}

@After
public void tearDown() throws Exception {
//  driver.close();
   }
}

