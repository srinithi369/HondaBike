package testcases;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readconfig = new ReadConfig();
	public String baseURL=readconfig.getApplicationURL();
	public String browser=readconfig.getBrowser();
	public static WebDriver driver;
	public static Logger logger ;
	
	@BeforeClass
	//To invoke browser
	public void setup()
	{
		logger = Logger.getLogger("BaseClass");
		PropertyConfigurator.configure("Log4j.properties");
		
		if(browser.equals("chrome"))
		{
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\v.sridharan\\eclipse-workspace\\HondaBike\\Driver\\chromedriver.exe");
		   driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\v.sridharan\\eclipse-workspace\\HondaBike\\Driver\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browser.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver","C:\\Users\\v.sridharan\\eclipse-workspace\\HondaBike\\Driver\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		
		driver.get(baseURL);

			
	}
	
	@AfterClass
	//To close browser
	public void close()  
	{
		driver.quit();
	}
	
	//To take screenshot of failed test cases
	public void snapshot(String name) 
	{

		TakesScreenshot scrShot = ((TakesScreenshot)driver);
		File src = scrShot.getScreenshotAs(OutputType.FILE);
		File des = new File("./Screenshots/" + name + ".png");
		try {
		FileUtils.copyFile(src, des);

		} 
		catch (IOException e) 
		{
		e.printStackTrace();
		}
	 }

	
	
	

	
}
