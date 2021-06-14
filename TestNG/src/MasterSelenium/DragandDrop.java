package MasterSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragandDrop {

	WebDriver driver;
	
	@BeforeMethod
	public void Browser(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANOJI\\workspace\\Java_Selenium\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void CLoseBrowser(){
		driver.quit();
	}
	
	@Test
	public void Drag(){
		
		driver.get("https://demoqa.com/ ");
		WebElement ss = driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div/div[3]/div"));
		ss.click();
		WebDriverWait wa =new WebDriverWait(driver, 10);
		wa.until(ExpectedConditions.elementToBeClickable(ss));
		
		driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div[1]/div/div/div[5]/span/div/div[1]")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("the line 47"+e);
		}
		driver.findElement(By.xpath("//*[@id='item-3']")).click();
		
		WebElement drag =driver.findElement(By.id("draggable"));
		
		WebElement drop= driver.findElement(By.id("droppable"));
		
		WebDriverWait wait =new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(drag));
		Actions ac = new Actions(driver);
		ac.dragAndDrop(drag, drop).build().perform();
		
		
		
	}
	
}
