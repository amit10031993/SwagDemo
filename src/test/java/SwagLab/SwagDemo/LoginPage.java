package SwagLab.SwagDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	By UserName = By.id("user-name");
	By Password = By.id("password");
	
	By Button = By.id("login-button");
	public LoginPage(WebDriver driver) {
		
		this.driver= driver;
	}
	
	public void login() {
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.findElement(UserName).sendKeys("standard_user");
		driver.findElement(Password).sendKeys("secret_sauce");
		driver.findElement(Button).click();
	}
 
}
