package testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.LoginPage;
import utilities.ReadExcel;

public class TC_VerifyInvalidLogin extends BaseClass{
	
	public String userId;
	public String password;
	public String ErrorMessage;
	
	@Test(dataProvider="LoginData")
	//To test the invalid login 
	public void invalidLogin(String userid,String password)
	{
		LoginPage lp=new LoginPage(driver);
		logger.info("Browser is opened");
		lp.clickLogin();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		lp.setuserId(userid);
		logger.info("Entered userid");
		lp.setuserPswd(password);
		logger.info("Entered password");
        lp.clickLogIn();
        logger.info("clicked on login");
        
        ErrorMessage=lp.errorMessage();
        
        if(ErrorMessage.equals("Invalid Email or Password"))
        {
        	Assert.assertTrue(true);
        	logger.info("Invalid login test is passed");
        	
        	
        }
        else
        {
        	snapshot("invalidLogin");
        	Assert.assertTrue(false);
        	logger.info("Invalid login test is failed");
        }
        
	
		
		
	}
	
	@DataProvider(name="LoginData")
	public String[][] getTestData() throws IOException
	{
		int rowcount=ReadExcel.getRowCount("Invalid details");
		int cellcount=ReadExcel.getCellCount(rowcount,"Invalid details");
		String logindata[][]=new String [rowcount][cellcount];
		for(int i=1;i<=rowcount;i++)
		{
			for(int j=0;j<cellcount;j++)
			{
				logindata[i-1][j]=ReadExcel.getCellData(i,j,"Invalid details");
			}
		}  
		return logindata;
		
	  }
	
}
