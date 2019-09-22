package projectnew;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Properties;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class ObjRepoTest {
	 public String actionKeyword;
	    
	    public static methodClass ref ;
	  
  @Test(priority=0)
  public void f() throws Exception {
	 
	   // fetch from the class, all methods.
    //    System.out.println(method);
	  
      String sPath = costant.sheetpath;
      //Here we are passing the Excel path and SheetName to connect with the Excel file
      //This method was created in the last chapter of 'Set up Data Engine'       
      ReadWriteExcel.setExcelFile(sPath,"Sheet1");

      //This is the loop for reading the values of the column 1 and 2
     
      for (int iRow = 1;iRow < 7;iRow++){
          actionKeyword = ReadWriteExcel.getCellData(iRow, 0);
          //args1=costant.URL.toString();
         // args2=obj.getProperty("Titleobj");
          System.out.println(iRow+actionKeyword);
          execute_Actions(actionKeyword);  //use the concept of reflection to call the methods associated with the
          }
	  
	  
  }
  @BeforeTest
  public void beforeSuiteTest() {
	  System.out.println("Initiating according to actions in Excel");
  }

  @AfterTest
  public static void afterTest() {
	  System.out.println("closing browser..");
	  
  }
  
  //This method contains the code to perform some action
  private static void execute_Actions(String actionKeyword) throws Exception {
	  Properties obj1 = new Properties();
	    FileInputStream file=new FileInputStream("G://cpsatnewproject//projectnew//src//projectnew//obj1.properties");
	    obj1.load(file);
     if(actionKeyword.contentEquals("Open")) methodClass.open();
           methodClass.waitFor();
     if(actionKeyword.contentEquals("navigate")) methodClass.navigate(costant.URL);
     			methodClass.waitFor();
     if(actionKeyword.contentEquals("AssertTittleofpage")) methodClass.AssertTittleofpage(obj1.getProperty("Titleobj"));
     if(actionKeyword.contentEquals("PrintText")) methodClass.PrintText(obj1.getProperty("PrintTextobj"));
     if(actionKeyword.contentEquals("Tothemenu")) methodClass.Tothemenu(obj1.getProperty("Tothemenuobj"));//close
     if(actionKeyword.contentEquals("close")) afterTest();
    //method variable contain all the method and mIfethod.length returns the total number of methods
	 
	  
}



}
