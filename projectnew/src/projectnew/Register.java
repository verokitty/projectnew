package projectnew;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*PQ1. Go to the register user page, find out how many text boxes are 
 * available. Print the data associated with the "name" property of every 
 * text box.  * 
 * */
public class Register {
	WebDriver driver;
	@Before
	public void setup() throws Exception{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\veronica\\Downloads\\Training downloads\\chromedriver.exe");//set the chrome driver
		driver=new ChromeDriver();
		

		List <WebElement> textboxes=driver.findElements(By.xpath("//input[@type='text']")); 
					    System.out.println("Total text boxes on registration page are =  "+textboxes.size());
					    
					    //iterate through the list elements
					    for(WebElement ele: textboxes){
					    	System.out.print(ele.getText()); //display text with every link element
					    	System.out.print("\t");
					    	//returns the runtime value associated with a property of html element
					    	System.out.println(ele.getAttribute("name"));
					    }

	}
	
	@Test
	public void loginLogout() throws Exception{
		driver.get("http://5elementslearning.com/demosite"); //open the application
		Thread.sleep(2000);
	}
}
