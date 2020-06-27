package utilities;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import testcases.TC_UpcomingBikes;
public class WriteExcel 
{
   public void writeOutput()
   {
	   File file= new File("C:\\Users\\v.sridharan\\eclipse-workspace\\HondaBike\\Excel\\Testoutput.xlsx");
	   XSSFWorkbook wb =new XSSFWorkbook();
	   XSSFSheet sh=wb.createSheet("Upcoming bikes");
	   sh.createRow(0).createCell(0).setCellValue("Name");
	   sh.getRow(0).createCell(1).setCellValue("Price");
	   sh.getRow(0).createCell(2).setCellValue("Launch date");
	   sh.createRow(1).createCell(0).setCellValue(TC_UpcomingBikes.bike1Name);
	   sh.getRow(1).createCell(1).setCellValue(TC_UpcomingBikes.bike1Price);
	   sh.getRow(1).createCell(2).setCellValue(TC_UpcomingBikes.bike1Date);
	   sh.createRow(2).createCell(0).setCellValue(TC_UpcomingBikes.bike2Name);
	   sh.getRow(2).createCell(1).setCellValue(TC_UpcomingBikes.bike2Price);
	   sh.getRow(2).createCell(2).setCellValue(TC_UpcomingBikes.bike2Date);
	   try
	   {
	   FileOutputStream fos = new FileOutputStream(file);
	   wb.write(fos);
	   wb.close();
	   }
	   catch(Exception e)
	   {
	   e.printStackTrace();
	   } 


   }
   
	 
	 
	 


}
