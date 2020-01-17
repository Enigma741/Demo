package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
	
public WebDriver driver;
	
	By RegistrationButton=By.xpath("//*[@id=\"liRegistration\"]/a");

	By NavBar=By.cssSelector("[class='nav navbar-nav']");
	
	
	public MainPage(WebDriver driver) {
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
