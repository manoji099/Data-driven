package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AbsoluteXpath {

	@Test
	public void Elements() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANOJI\\workspace\\Java_Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.rediff.com/");
		
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div/div/div/div/div")).click();
		Thread.sleep(3000);
		
		driver.quit();
	}
}
