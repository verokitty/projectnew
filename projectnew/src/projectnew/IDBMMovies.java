package projectnew;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDBMMovies {
	WebDriver driver;
	@Before
	public void setup() throws Exception{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\veronica\\Downloads\\Training downloads\\chromedriver.exe");//set the chrome driver
		driver=new ChromeDriver();
	}
	
	/**
	 * @throws Exception
	 */
	@Test
	public void IDBM() throws Exception{
		driver.get("https://www.imdb.com/?ref_=login"); //open the application
		 driver.manage().window().maximize();
		WebElement Search_field =driver.findElement(By.linkText("Movies")); 
		Search_field.click();
		int flag=0;
		if (flag==0) {
		List <WebElement> Tables=driver.findElements(By.tagName("table"));
		for (WebElement Table:Tables)
		{
			List <WebElement> rows=Table.findElements(By.tagName("tr"));   
			int roesize=rows.size();
			int i=1;
			try {
					for (int row=1;row<=roesize&& flag==0;row++) {
				
							List <WebElement> cols=Table.findElements(By.tagName("td"));
							int colsize=cols.size();
				for (WebElement colele:cols) {
								for(int col=1;col<=colsize && flag==0;col++)  
									{ System.out.println("Cell Value of row number " + row + " and column number " + col + " Is " +cols.get(col).getText());

										if(cols.get(col).getText().contains("Yesterday (2019)")) {
												System.out.println("FOUND***********"); 
												WebElement title= cols.get(col).findElement(By.tagName("a"));
												title.click();
												//col
												/*WebElement title= cols.get(col).findElement(By.linkText(" Yesterday (2019)"));
													title.click();*/
												 flag=1;
												break;
											}
				
									}
				}
					}
				}catch(IndexOutOfBoundsException e) {continue; }                   
			}
		}
		WebElement rating = driver.findElement(By.xpath("//*[@id='title-overview-widget']/div[1]/div[2]/div/div[1]/div[1]/div[1]/strong/span"));
		String ratingval=rating.getText();
		System.out.println("val***"+ratingval);
		driver.close();//break;
			
		}
}
	
	

