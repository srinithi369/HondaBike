package testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.LoginPage;
import utilities.ReadExcel;
public class TC_VerifyLogin extends BaseClass 
{
	public String userid;
	public String pswd;
	public String city;

	@Test(priority=0)
	//To verify login 
	public void verifyLogin() throws InterruptedException, IOException
	{
		userid=ReadExcel.getCellData(0,1,"Valid details");
		pswd=ReadExcel.getCellData(1,1,"Valid details");
		city=ReadExcel.getCellData(2,1,"Valid details");
		LoginPage lp=new LoginPage(driver);
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        logger.info("Browser is opened");
		lp.clickLogin();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		lp.setuserId(userid);
		logger.info("Entered userid");
		lp.setuserPswd(pswd);
		logger.info("Entered password");
		lp.clickLogIn();
		logger.info("Login test is passed");
		
	}
	@Test(priority=1)
	//To verify home page title
	public void verifyHomePageTitle()
	{
		
		if(driver.getTitle().equals("New Bikes, New Scooters, Used Bikes, Buy a Bike - BikeWale"))
		{
			Assert.assertTrue(true);
			logger.info("Homepagetitle is verified");
		}
		else
		{
			snapshot("verifyHomePageTitle");
			Assert.assertTrue(false);
			logger.info("Homepagetitle is wrong");
			
		}
		
	}
	
	@Test(priority=2)
	//To select city 
	public void selectCity()
	{
		LoginPage lp =new LoginPage(driver);

		lp.selectCity();
		lp.typeCity(city);
		lp.confirmCity();
		logger.info("Entered cityname");
		
		
	}
	
	
	
	
}
