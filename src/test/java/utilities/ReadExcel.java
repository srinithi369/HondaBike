package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	  
	  public static FileInputStream file;
	  public static XSSFWorkbook workbook;
	  public static XSSFSheet sheet;
      public static XSSFRow row;
    //To get total number of rows in excel sheet 
	public static int getRowCount(String sheetname) throws IOException
	{
		file = new FileInputStream("C:\\Users\\v.sridharan\\eclipse-workspace\\HondaBike\\Excel\\Testdata.xlsx");
		workbook = new XSSFWorkbook(file);
	    sheet= workbook.getSheet(sheetname);
	    int rowcount=sheet.getLastRowNum();
	    workbook.close();
	    file.close();
	    return rowcount;
		
	}
	
	//To get total number of columns in excel sheet 
	public static int getCellCount(int rownum,String sheetname) throws IOException
	{
		file = new FileInputStream("C:\\Users\\v.sridharan\\eclipse-workspace\\HondaBike\\Excel\\Testdata.xlsx");
		workbook = new XSSFWorkbook(file);
	    sheet= workbook.getSheet(sheetname);
	    row=sheet.getRow(rownum);
	    int cellcount=row.getLastCellNum();
	    workbook.close();
	    file.close();
	    return cellcount;
		
	}
	
	//To get data from excel sheet 
	public static String getCellData(int rownum,int colnum,String sheetname) throws IOException
	{
		 file = new FileInputStream("C:\\Users\\v.sridharan\\eclipse-workspace\\HondaBike\\Excel\\Testdata.xlsx");
		 workbook = new XSSFWorkbook(file);
	     sheet= workbook.getSheet(sheetname);
		 String data = sheet.getRow(rownum).getCell(colnum).getStringCellValue();
		 workbook.close();
		 file.close();
		 return data;
		
		
	}

}
