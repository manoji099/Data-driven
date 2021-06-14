package tekstac;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public static XSSFSheet worksheet;
	public static XSSFWorkbook workbook;
	public static FileInputStream work_file;
	public static String file_path= "C:\\Users\\MANOJI\\workspace\\TestNG\\src\\com\\datasource\\Test Data_demo.xlsx";

	public static String[] readExcelData(String sheetName) throws Exception {
	    
	    File  file = new File("Test Data_Demo.xlsx");
	    file_path = file.getAbsolutePath();
	    FileInputStream work_file = new FileInputStream("Test Data_Demo.xlsx");
	    workbook = new XSSFWorkbook(work_file);
	    worksheet = workbook.getSheet(sheetName);
	    String[] data = new String[6];
	    for(int i= 0;i<6;i++){
	    data[i] = String.valueOf(worksheet.getRow(0).getCell(i));
	    }
	    return data;

}
}
