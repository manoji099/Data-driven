package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {
	
	@Test
	public void facebok() throws InterruptedException{
		String url = "https://www.facebook.com/";
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\MANOJI\\workspace\\TestNG\\Driver\\IEDriverServer.exe");
		WebDriver driver =  new InternetExplorerDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		String ass= driver.getTitle();
		Assert.assertEquals(ass, "Facebook – log in or sign up");
		Thread.sleep(4000);
		
		driver.close();
		
		
	}

}
