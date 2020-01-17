package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {

public WebDriver driver;
	
	By selectuser=By.xpath("//*[@for='checkbox2_2']");
    By Name= By.xpath("//input[@id='Name']");
    By Age = By.id("Age");
    By gender=By.xpath("//*[@class='form-group form-md-radios']/input[2]");
    By Dr = By.id("RefDoctor");
    By date=By.id("AppointmentDate");
    By day=By.className("day"); 
    By time=By.id("TimeSlotID");
    By branch=By.id("BranchID");
    By number=By.cssSelector("[id='MobileNumber']");
    By test=By.xpath("//*[@id=\"form_sample_567\"]/div/div[1]/div[3]/div/div/div[5]/div/span[2]/div/button");
    By test1=By.xpath("\r\n" + 
    		"//*[@id=\"form_sample_567\"]/div/div[1]/div[3]/div/div/div[5]/div/span[2]/div/ul/li[5]/a/label/input");
    By address=By.xpath("//*[@id=\"Address\"]");
   // By amount=By.id("PriceAmount");
    By Book=By.id("btnBook");
    
   
   
	
	
	
	public RegistrationPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}




	public WebElement hitselectuser()
	{
		return driver.findElement(selectuser);
	}
	
	public WebElement enterName()
	{
		return driver.findElement(Name);
	}
	
	public WebElement enterAge()
	{
		return driver.findElement(Age);
	}
	
	public WebElement hitgenderbutton()
	{
		return driver.findElement(gender);
	}
    
	public WebElement enterdrname()
	{
		return driver.findElement(Dr);
	}
	
	public WebElement getdate()
	{
		return driver.findElement(date);
	}
	
	public WebElement date1;
	
	public WebElement getday()
	{
		
		
		
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("March"))
		{
		driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}

		List<WebElement> dates= driver.findElements(day);
		//Grab common attribute//Put into list and iterate
		int count=driver.findElements(day).size();

		for(int i=0;i<count;i++)
		{
		String text=driver.findElements(day).get(i).getText();
		if(text.equalsIgnoreCase("21"))
		{
		date1 = driver.findElements(day).get(i);
		break;
		}

		}
		return date1;
		
	}
	
	public WebElement gettime()
	{
		return driver.findElement(time);
	}
	
	public void selecttime()
	{
		Select s=new Select(driver.findElement(time));
		s.selectByValue("24");
	}
	
	public WebElement getbranch()
	{
		return driver.findElement(branch);
	}
	
	public void selectbranch()
	{
		Select s=new Select(driver.findElement(branch));
		s.selectByValue("1");
	}
	
	public WebElement getnumber()
	{
		return driver.findElement(number);
	}
	
	public WebElement gettest()
	{
		return driver.findElement(test);
	}
	
	public WebElement selecttest()
	{
		return driver.findElement(test1);
	}
	
	public WebElement getaddress()
	{
		return driver.findElement(address);
	}
	
	/*public WebElement getamount()
	{
		return driver.findElement(amount);
	}*/
	
	public WebElement hitBook()
	{
		return driver.findElement(Book);
	}
	
	
		
		

	
	
	
	
	
		
	
	
}
