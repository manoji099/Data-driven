package Practo_Trail;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Trail {

	@Test
	public void Practo() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANOJI\\workspace\\Java_Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.practo.com/");
		
		
		driver.findElement(By.xpath("//div[@class='product-tab']/a/div[text()='Diagnostics']")).click();
		
		List<WebElement> lists=driver.findElements(By.xpath("//div[@class='u-d__inline city-selector__city u-marginb--std-half u-pointer']"));
		for(WebElement list : lists)
		{
			System.out.println("The cities are: "+list.getText());
		}
		//System.out.println(lists.get(5));
		
		//driver.quit();
		
		//div[@class='product-tab']/a/div[text()='Diagnostics']
		
	}
}
