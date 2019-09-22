package projectnew;

import java.lang.reflect.Method;

public class Reflection1 {
	 //This is a class object, declared as 'public static'
    //So that it can be used outside the scope of main[] method
    public static String actionKeyword;
    public static String args1;
    public static String args2;
    public static Method method[];
    public static KeywordLibrary ref ;
  
    public static void main(String[] args) throws Exception {
        ref= new KeywordLibrary();
        method = ref.getClass().getMethods(); // fetch from the class, all methods.
      //    System.out.println(method);
        String sPath = "G:\\cpsatnewproject\\projectnew\\Drivers\\Test2.xlsx";
        //Here we are passing the Excel path and SheetName to connect with the Excel file
        //This method was created in the last chapter of 'Set up Data Engine'       
        ReadWriteExcel.setExcelFile(sPath, "Sheet1");
  
        //This is the loop for reading the values of the column 1 and 2
        for (int iRow = 1;iRow < 9;iRow++){
            actionKeyword = ReadWriteExcel.getCellData(iRow, 0);
            args1=ReadWriteExcel.getCellData(iRow, 1);
            args2=ReadWriteExcel.getCellData(iRow, 2);
            System.out.println(iRow+actionKeyword+args1+args2);
            execute_Actions();  //use the concept of reflection to call the methods associated with the
            }
        }
         
    //This method contains the code to perform some action
      private static void execute_Actions() throws Exception {
         
        //method variable contain all the method and method.length returns the total number of methods
        for(int i = 0;i < method.length;i++){
            //This is now comparing the method name with the Keyword value got from excel
            if(method[i].getName().equals(actionKeyword)){
                Class[] parameterTypes = method[i].getParameterTypes(); // how many parameteres this method takes
                if(parameterTypes.length==0){
                    method[i].invoke(ref, null); //calling the method with parameter
                }else if(parameterTypes.length==1){
                    method[i].invoke(ref, args1);
                }else if(parameterTypes.length==2){
                    method[i].invoke(ref, args1, args2);
                }
                break;
            }
        }
    }
}
