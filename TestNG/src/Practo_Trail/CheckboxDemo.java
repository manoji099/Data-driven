package Practo_Trail;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckboxDemo {
	String url = "https://www.practo.com/search?results_type=hospital&q=%5B%7B%22word%22%3A%22hospital%22%2C%22autocompleted%22%3Atrue%2C%22category%22%3A%22type%22%7D%5D&city=Coimbatore";
	WebDriver driver=null;
	String i;
	

	@BeforeMethod
	public void CheckBox(){
		System.out.println("enter the browser:" );
		Scanner scan = new Scanner(i);
		
		if(i == "1"){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANOJI\\workspace\\Java_Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(url);
	
	}
		else if(i=="2"){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\MANOJI\\workspace\\TestNG\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
		}
	}
	@AfterMethod
	public void CloseBrowser(){
		driver.quit();
	}
	
	@Test
	public void Cbox(){
		
		driver.findElement(By.xpath("//div[@class='c-filter__select--checkbox u-d-inlineblock u-valign--middle u-pos-rel' and @data-qa-id='Open_24X7_checkbox']")).click();
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='c-filter__select--checkbox u-d-inlineblock u-valign--middle u-pos-rel' and @data-qa-id='Open_24X7_checkbox']"))));

	}
	
	
	
	
}
