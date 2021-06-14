package Testng;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestngDemo {

	@DataProvider(name = "student") 

	public Object[][] dataSupplier(){ 

	Object[][] data = {{1, "Two"}, {3, "Four"}, {5, "six"}}; 

	return data; 

	 

	} 

	 

	@AfterMethod 

	public void createReport(){ 

	System.out.println("Report generated for all testing"); 

	} 

	 

	@BeforeMethod 

	public void prepareTestData(){ 

	System.out.println("Prepare Test data for testing"); 

	} 

	 

//		@Test(priority = 2) 

//		public void testcase1(){ 

//			System.out.println("This is test case 1"); 

//		} 

	 

	@Test(priority = 1, dataProvider = "student") 

	public void testcase2(int a, String b){ 

	System.out.println("This is test case 2"); 

	System.out.println(a + "-----" + b); 

	} 

	 
		
	
	
}
