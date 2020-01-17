package Ahs;



import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import PageObject.AppointmentDetailsPage;
import PageObject.LoginPage;
import PageObject.MainPage;
import PageObject.PopupPage;
import PageObject.RegistrationPage;
import Ahs.base;
import Ahs.TestData;

public class HomePage extends base {
	public static Logger log =LogManager.getLogger(base.class.getName());
   @BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();
		 
		 log.info("Driver is initialized");

	}
	
	 @Test(dataProvider="InputData",dataProviderClass=TestData.class)
	
	public void LoginPageNavigation(String username, String password, String Name, String Age, String drname, String number, String address ) throws IOException, InterruptedException
	{

		//one is inheritance

		// creating object to that class and invoke methods of it
		driver.get(prop.getProperty("url"));
		log.info("Navigated to Login page");
		
		LoginPage l=new LoginPage(driver);
		l.getusername().sendKeys(username);
		l.getPassword().sendKeys(password);
		l.hitsignin().click();
		
		MainPage r=new MainPage(driver);
	        Assert.assertTrue(r.getNavigationBar().isDisplayed());
		    log.info("Navigation Bar is displayed");
			 System.out.println("Test completed");
			r.hitregistrationbutton().click();
			
		RegistrationPage r1=new RegistrationPage(driver);
		      r1.hitselectuser().click();
		       r1.enterName().click();
		      r1.enterName().sendKeys(Name);
		      
		      r1.enterAge().click();
		      r1.enterAge().sendKeys(Age);
		      
		      r1.hitgenderbutton().click();
		      
		      r1.enterdrname().click();
		      r1.enterdrname().sendKeys(drname);
		      
		      r1.getdate().click();
		      r1.getday().click();
		      
		      r1.gettime().click();
		     
              r1.selecttime();
              
              r1.getbranch().click();
              r1.selectbranch();
              
              r1.getnumber().click();
              r1.getnumber().sendKeys(number);
              
              r1.gettest().click();
              r1.selecttest().click();
              
              r1.getaddress().click();
              r1.getaddress().sendKeys(address);
              r1.gettest().click();
              r1.hitBook().click();
              
              
              AppointmentDetailsPage a=new AppointmentDetailsPage(driver);
              a.hitsearch().click();
              a.hitsearch().sendKeys(Name);
              a.hitsearch().sendKeys(Keys.ENTER);
        
         
            System.out.println(a.getstatus().getText());
            Assert.assertTrue(a.getstatus().getText().contains("Pending"),"Passed");
            
            a.hitcancel().click();
              
              PopupPage p =new PopupPage(driver);
              p.hitpopup().click();
              p.hitpopup().sendKeys("submitt");
              p.hitsubmit().click();
             
              Thread.sleep(4000);
              System.out.println(a.getstatus().getText());
              Assert.assertTrue(a.getstatus().getText().contains("Canceled"));
              
	}
	 
	



}
