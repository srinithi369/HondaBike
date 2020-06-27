package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig
{
	
	Properties pro;
	
	public ReadConfig()
	{
		File src = new File("C:\\Users\\v.sridharan\\eclipse-workspace\\HondaBike\\Configuration\\config.properties");
		
		try
		{
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
			
		}
		catch(Exception e)
		{
			System.out.println("Exception is "+ e.getMessage());
		}
	}
	
	//To get URL from configure property file
	public String getApplicationURL()
	{
		String url=pro.getProperty("baseURL");
		return url;
		
	}
	
	//To get browser name from configure property file
	public String getBrowser()
	{
		String browser = pro.getProperty("browser");
		return browser;
	}

}
