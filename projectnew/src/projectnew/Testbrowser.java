package projectnew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   System.setProperty("webdriver.chrome.driver","G:\\cpsatnewproject\\projectnew\\Drivers\\chromedriver.exe");		
	       WebDriver driver = new ChromeDriver();    	
	       String baseUrl = "http:\\www.flipkart.com";
	       driver.get(baseUrl);
	       driver.manage().window().maximize();
	       WebElement my_element3= driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button"));
	       my_element3.click();//
	       WebElement my_element= driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
	       my_element.sendKeys("kitvernkit@gmail.com");
	}

}
