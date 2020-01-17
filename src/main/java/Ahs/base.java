package Ahs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	public static WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException
	{
		prop=new Properties();
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Ahs\\global.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		System.out.println(browserName);

		if(browserName.equals("chrome"))
		{
	     System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
				//execute in chrome driver
			
		}
		else if (browserName.equals("firefox"))
		{
			 System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
			 driver= new FirefoxDriver();
			//firefox code
		}
		else if (browserName.equals("IE"))
		{
			 System.setProperty("webdriver.IE.driver", "C://MicrosoftWebDriver.exe");
			 driver= new InternetExplorerDriver();
//			IE code
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}
	
	

	public static void getScreenshot(String name) throws IOException {
		File scrfile=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrfile,new File(System.getProperty("user.dir")+"\\"+name+ ".png"));
		
	}

	
	
	
 
 
			
   

}
