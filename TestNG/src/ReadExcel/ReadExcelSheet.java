package ReadExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelSheet {
	
	@Test
	public void data() throws Exception{
		
		File fs = new File("C:\\Users\\MANOJI\\Desktop\\Test Data_demo.xlsx");
		FileInputStream ws = new FileInputStream(fs);
		
		XSSFWorkbook work = new XSSFWorkbook(ws);
		XSSFSheet sheet= work.getSheetAt(1);
		
		String a= sheet.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(a);
		
		
	}

}
