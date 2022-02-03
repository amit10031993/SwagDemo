package SwagLab.SwagDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class About {
	WebDriver driver;
	
	By AB = By.id("react-burger-menu-btn");
	By AC = By.id("about_sidebar_link");
	By AD = By.id("onetrust-accept-btn-handler");
	
	
	public About(WebDriver driver) {
		this.driver=driver;
	}
	
	public void set() {
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		 
		driver.findElement(AB).click();
		driver.findElement(AC).click();
		driver.findElement(AD).click();
		driver.navigate().back();
	}
	
		
		
	}
	


