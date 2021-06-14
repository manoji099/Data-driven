package testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class mainprojecttesting {
	static Object[][] data;

	public static int rowCount,colCount;
	@Test
	public static Object[][] readexceldata(String sheetName){
		
		
		try {
			File fs = new File(System.getProperty("E:\\workspace\\INTQAE21QE007_Team1_WorkPackages\\src\\test\\resources\\com\\workpackages\\excel\\MAIN_PROJECT_TEAM1_DATA.xlsx"));
			FileInputStream ws = new FileInputStream(fs);
			
			XSSFWorkbook work = new XSSFWorkbook(ws);
			XSSFSheet sheet= work.getSheetAt(0);
			
			 rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
			
			 colCount=sheet.getRow(0).getLastCellNum();
		
			 data= new Object[rowCount][colCount];
			 
			for(int i=1;i<rowCount;i++)
			{
				XSSFRow row = sheet.getRow(i);
					for(int j=1;j<colCount;i++){
						
						data[i][j]=String.valueOf(row.getCell(j));	
						
				}
			}
			work.close();
			
		}
			catch (Exception e) {
		System.out.println(e.getMessage());
	}
		
		return data;
	
	
	}

	

}

