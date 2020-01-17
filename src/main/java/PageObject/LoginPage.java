package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

public WebDriver driver;
	
	By username=By.cssSelector("[id='MobileNumber']");
	By password=By.cssSelector("[type='password']");
	By signin=By.cssSelector("[class='chic-button']");
	
	
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}




	public WebElement getusername()
	{
		return driver.findElement(username);
	}
	

	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement hitsignin()
	{
		return driver.findElement(signin);
	}
	
	
	

}
