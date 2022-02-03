package SwagLab.SwagDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Base {
	WebDriver driver;
	
	@Test
	public void InvokeDriver() {
		
		System.setProperty("webdriver.chrome.driver","F:\\selenium driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");
		
		
		LoginPage obj = new LoginPage(driver);
		obj.login();
	About a = new About(driver);
		
		a.set();
		Select s = new Select(driver);
		s.get();
		
		
	}
}
