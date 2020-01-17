package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AppointmentDetailsPage {
	
public WebDriver driver;
	
	By search=By.xpath("//*[@id=\"sample_123_filter\"]/label/input");
	By status =By.xpath("//*[@id='sample_123']/tbody/tr[1]/td[10]");
	By cancel=By.xpath("//td[13]//a[1]");
	
	
	
	
	public AppointmentDetailsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}




	public WebElement hitsearch()
	{
		return driver.findElement(search);
	}
	
	public WebElement getstatus()
	{
		return driver.findElement(status);
	}
	
	public WebElement hitcancel()
	{
		return driver.findElement(cancel);
	}
	

	
	
	
	

	

}
