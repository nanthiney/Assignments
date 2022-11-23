package week4day4.testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadData {
@Test
	public String[][] readData(String ExcelFileName) throws IOException {
		
          XSSFWorkbook wb=new XSSFWorkbook("data/"+ExcelFileName+".xlsx");
          XSSFSheet sheet=wb.getSheetAt(0);//read the first sheet
          int rowCount=sheet.getLastRowNum();//total row count
          short columnCount=sheet.getRow(0).getLastCellNum();//to find total columns
          System.out.println("Total number of rows:"+rowCount);
          System.out.println("Total number of coulmns:"+columnCount);
          
        //  XSSFRow row=sheet.getRow(1);
     //     XSSFCell cell=row.getCell(1);
          //System.out.println(cell.getStringCellValue());
          
          String [][] data=new String [rowCount][columnCount];
          for(int i=1;i<=rowCount;i++) {
        	  XSSFRow row=sheet.getRow(i);
        	  
        	  
        	  for(int j=0;j<columnCount;j++) {
        		  XSSFCell column=row.getCell(j);
        		  System.out.println(column.getStringCellValue());
        		  data[i-1][j]=column.getStringCellValue();
        	  }
        	  
          }
          wb.close();
          return data;
	}

}
