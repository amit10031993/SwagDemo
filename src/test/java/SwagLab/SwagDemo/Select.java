package SwagLab.SwagDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Select {
	WebDriver driver;
	
	By Text = By.xpath("//div[@class='inventory_item_label']");
	
	By Add = By.id("add-to-cart-sauce-labs-fleece-jacket");
	By Click = By.xpath("//a[@class='shopping_cart_link']");
	By Click1 = By.id("checkout");
	By Name = By.id("first-name");
	By Last = By.id("last-name");
	By Code = By.id("postal-code");
	By Next = By.id("continue");
	By Finish = By.id("finish");
	By Back = By.id("back-to-products");
	
	public Select(WebDriver driver) {
		this.driver= driver;
		
	}
	public void get() {
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		driver.findElement(Text).getText();
		System.out.println(driver.findElement(By.xpath("//div[@class='inventory_item_label']")).getText());
	
		driver.findElement(Add).click();
		driver.findElement(Click).click();
		driver.findElement(Click1).click();
		driver.findElement(Name).sendKeys("Sumit");
		driver.findElement(Last).sendKeys("Sahu");
		driver.findElement(Code).sendKeys("442107");
		driver.findElement(Next).click();
		driver.findElement(Finish).click();
		driver.findElement(Back).click();
	}
	

}
