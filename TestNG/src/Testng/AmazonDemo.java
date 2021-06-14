package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonDemo {

	@Test
	public void Signup() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANOJI\\workspace\\Java_Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26action%3Dsign-out%26path%3D%252Fgp%252Fyourstore%252Fhome%26ref_%3Dnav_AccountFlyout_signout%26signIn%3D1%26useRedirectOnSuccess%3D1&prevRID=HRVXD1JQ2MEY06ZY9X1R&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		driver.findElement(By.cssSelector("input[id^=ap_cus]")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='tel']")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("");
		Thread.sleep(2000);
		
		//String ad =driver.getTitle();
		//Assert.assertEquals("Amazon Registration", ad);
		
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
	}
}
