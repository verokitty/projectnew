package projectnew;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeywordLibrary {

	
	public static WebDriver driver;
    
    public static void open(){      
        System.setProperty("webdriver.gecko.driver","G:\\cpsatnewproject\\projectnew\\Drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
         }

    public static void navigate(String url){    
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
        }
  
    public static void click(String objInfo) throws Exception{
        By object=fetchObject(objInfo);
        //driver.findElement(object).sendKeys(Keys.ESCAPE);
        driver.findElement(object).click();
        Thread.sleep(3000);
    //  driver.findElement(By.linkText("My Account")).click();
        }
  
    public static void type(String objInfo, String data){
        By object=fetchObject(objInfo);
        driver.findElement(object).sendKeys(data); 
        }

    public static void waitFor() throws Exception{
        Thread.sleep(5000);
        }
  
    public static void closeBrowser(){
            driver.close();
        }
  
    //the data passed with the format - linkText=My Account
    public static By fetchObject(String args){ //locatortype=value
        By obj=null;
        String[] objData=args.split("=");
        if(objData[0].equals("linkText")){
            obj=By.linkText(objData[1]);
        }else if(objData[0].equals("name")){
            obj=By.name(objData[1]);
        }else if(objData[0].equals("id")){
            obj=By.id(objData[1]);
        }
        return obj;
    }
	
}
