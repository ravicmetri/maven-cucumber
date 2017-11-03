package BrowserUtility;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowseFactory {
	
	
	 static WebDriver driver;
	  
	public static WebDriver StartBrowser(String browsername,String url)
	{		
		if(browsername.equalsIgnoreCase("firefox")) 
		{   System.setProperty("webdriver.firefox.marionette","E:\\RAVIRAJ AUTOMATION\\Automation\\geckodriver-v0.11.1-win64\\geckodriver.exe");
			driver= new FirefoxDriver();
			
		}
		else if (browsername.equalsIgnoreCase("chrome"))
	    {
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
	    return driver;
	}
		
}



