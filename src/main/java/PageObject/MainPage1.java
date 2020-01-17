package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage1 {
	
public WebDriver driver;
	
	By RegistrationButton=By.xpath("//*[@id=\"liRegistration\"]/a");

	By NavBar=By.cssSelector("[class='nav navbar-nav1']");
	
	
	public MainPage1(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}




	public WebElement hitregistrationbutton()
	{
		return driver.findElement(RegistrationButton);
	}
	
	public WebElement getNavigationBar()
	{
		return driver.findElement(NavBar);
	}
	

	
	

}
