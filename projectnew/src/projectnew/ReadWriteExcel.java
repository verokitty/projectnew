package projectnew;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteExcel {
    private static XSSFWorkbook ExcelWBook;
    private static XSSFSheet ExcelWSheet;
    private static XSSFCell Cell;

//This method is to set the File path and to open the Excel file
//Pass Excel Path and SheetName as Arguments to this method
public static void setExcelFile(String Path,String SheetName) throws Exception {
        FileInputStream ExcelFile = new FileInputStream(Path);
        ExcelWBook = new XSSFWorkbook(ExcelFile);
        ExcelWSheet = ExcelWBook.getSheet(SheetName);
       }
 //This method is to read the test data from the Excel cell
//In this we are passing parameters/arguments as Row Num and Col Num
public static String getCellData(int RowNum, int ColNum) throws Exception{
      Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
      String CellData="";
      //Cell.get
      if (Cell == null) { //cell was never written to
           
      }else {
      CellData= Cell.getStringCellValue();
      
     }
   //   System.out.println("Price"+CellData);
      return CellData;
    }

//writing to the cell object
public static void setCellData(String data,  int RowNum, int ColNum) throws Exception    {
    try{
       XSSFRow Row = ExcelWSheet.getRow(RowNum);
       Cell = Row.getCell(ColNum);
      if (Cell == null) { // Cell was never used
         Cell = Row.createCell(ColNum);
         Cell.setCellValue(data);
         } else {
             Cell.setCellValue(data);
         }
         }catch(Exception e){
             throw (e);
     }
 }

public static void saveFile(String Path) throws IOException{
     try {
         FileOutputStream fileOut = new FileOutputStream(Path);
         ExcelWBook.write(fileOut);
         fileOut.close();
    } catch (IOException e) {
        throw(e);
    }
}
}
