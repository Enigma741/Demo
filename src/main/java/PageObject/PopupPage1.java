package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PopupPage1 {

	public WebDriver driver;
	By popup =By.xpath("//*[@id=\'txtSender\']");
	By submit=By.id("btnSend1");
	
	
	public PopupPage1(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement hitpopup()
	{
		return driver.findElement(popup);
	}
	
	public WebElement hitsubmit()
	{
		return driver.findElement(submit);
	}

}
