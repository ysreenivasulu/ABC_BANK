package Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flipkart_obj {
	
public WebDriver driver;
	
	@FindBy(xpath="//header/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]") public WebElement serchbar;
	@FindBy(xpath="//button[@aria-label='Search for Products, Brands and More']")public WebElement icon;
	@FindBy(xpath="//a[@id='ui-id-15']")public WebElement Shorts;

	
	
	public flipkart_obj(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);    
	}
	
	

	public void clickLogout() throws Throwable {
		serchbar.sendKeys("men towel");
		Thread.sleep(3000);
		icon.click();
		
		
		Thread.sleep(3000);
	}
	
}
