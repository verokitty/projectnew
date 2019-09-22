package projectnew;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
/*PQ2. Go to the page - https://semantic-ui.com/modules/dropdown.html. Go to the Skills Dropdown. 
a.Find it if it allows multiple selection? 
b. Select three options based on text, value and index- Python, Ruby, React. 
c. Print all selected options.
*/
public class Checkselect {
	WebDriver driver;
	  
	/*Write down a junit test script with assertions and synchronization 
	for the change profile scenario, where you update the
	telephone number. */

	  @Before
	  public void setUp() throws Exception {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\veronica\\Downloads\\Training downloads\\chromedriver.exe");//set the chrome driver
		driver=new ChromeDriver();
		
	}
	  @Test
		public void test() throws InterruptedException {
			driver.get("http://5elementslearning.com/demosite");
			WebElement Webtable=driver.findElement(By.tagName("table"));
			//rows in the table
	 		List<WebElement> Rows=Webtable.findElements(By.xpath("//*/tbody/tr"));  
			//Iterate through the row to find table cell. 
			int RowIndex=1;
			for(WebElement rowElement:Rows){  // iterate through the Rows List. 
			      List<WebElement> Cols=rowElement.findElements(By.xpath("td")); //fetch the td elements for each row.
			      int ColumnIndex=1;
			      for(WebElement colElement:Cols){  //iterate through the Cols list
			           System.out.println("Row "+RowIndex+" Column "+ColumnIndex+" Data- "+colElement.getText());
			           ColumnIndex=ColumnIndex+1;
			      }
			      RowIndex=RowIndex+1;
			}
	}

	 /* @Test
	  public void recordupdate() throws Exception {
	    driver.get("https://semantic-ui.com/modules/dropdown.html");
	    Select drpdwnskill = new Select(driver.findElement(By.name("skills")));
	    if(drpdwnskill.isMultiple())
	    	System.out.println("Multi selection allowed");
	    drpdwnskill.selectByVisibleText("Python");	    
	    drpdwnskill.selectByValue("ruby");	    
	    drpdwnskill.selectByIndex(14);
	    List<WebElement> skill=drpdwnskill.getOptions();
	    System.out.println(skill);*/
	   
	  

	  @After
	  public void tearDown() throws Exception {
	  //  driver.close();
	     }
}
