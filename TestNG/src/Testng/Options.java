package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Options {
	
	@Test
	public void BrowserOption(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANOJI\\workspace\\Java_Selenium\\Driver\\chromedriver.exe");
		ChromeOptions od = new ChromeOptions();
		od.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(od);
		driver.manage().window().maximize();
		
		driver.get("https://cacert.org");
		System.out.println("the title is >......."+driver.getTitle());
	}

}
