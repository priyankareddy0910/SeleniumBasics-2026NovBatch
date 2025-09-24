package ReadingExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		FileInputStream file=new FileInputStream("C:\\Users\\ankus\\Documents\\Prathyusha\\Introduction\\Testdata\\data.xlsx");
		
XSSFWorkbook workbook = new XSSFWorkbook(file);
			
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		

		  int totalrows = sheet.getLastRowNum(); //Number of rows
		  
		 int totalcells =  sheet.getRow(0).getLastCellNum(); //Read the cells in the inner for loop 
		 
		 
		 System.out.println(totalrows);
		 
		 System.out.println(totalcells);
		 
	
		 
		 for(int r=0;r<=totalrows;r++) {//outerforloopRows
			 
			 XSSFRow  currentrow =  sheet.getRow(r);
			 
			 for(int c=0;c<totalcells;c++) {
				 
				 String value = currentrow.getCell(c).toString();
				 
				 System.out.print(value+"        ");
				 
			 }
			 
			 System.out.println();
			 
			 
			 
		 }
		 
		 workbook.close();
		 file.close();
		 
		 
		 
		 
		 
		  
		  
		
		
		
		
		
		
		
	}

		
	
	

}


