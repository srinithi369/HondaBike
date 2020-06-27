package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport extends TestListenerAdapter 
{
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest logger;
	
	//To create extent report	
	public void onStart(ITestContext testContext)
	{
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String reportName="Test-Report-"+timeStamp+".html";
	    htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+ "/test-output/"+reportName);
	    
		extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Host name","localhost");
		extent.setSystemInfo("Tester name","Team 5");
		
		htmlReporter.config().setDocumentTitle("HondaBike Test Project"); 
		htmlReporter.config().setReportName("HondaBike Test Automation Report");
		htmlReporter.config().setTheme(Theme.DARK);
	}
	
	//To create report for successful test cases
	public void onTestSuccess(ITestResult tr)
	{
		logger=extent.createTest(tr.getName()); 
		logger.log(Status.PASS,MarkupHelper.createLabel(tr.getName(),ExtentColor.GREEN)); 
	}
	
	//To create report for failure test cases
	public void onTestFailure(ITestResult tr)
	{
		logger=extent.createTest(tr.getName()); 
		logger.log(Status.FAIL,MarkupHelper.createLabel(tr.getName(),ExtentColor.RED)); 
		logger.log(Status.FAIL,"Test case failed is "+tr.getName());
		logger.log(Status.FAIL,"Error is "+tr.getThrowable());
		
		String screenshotPath=System.getProperty("user.dir")+"\\Screenshots\\"+tr.getName()+".png";
		
		File f = new File(screenshotPath); 
		
		if(f.exists())
		{
		  try 
		   {
			logger.fail("Screenshot is below:" + logger.addScreenCaptureFromPath(screenshotPath));
		   }
		  catch (IOException e) 
		   {
				e.printStackTrace();
		   }
		}
		
	}
	
	//To create report for skipped test cases
	public void onTestSkipped(ITestResult tr)
	{
		logger=extent.createTest(tr.getName()); 
		logger.log(Status.SKIP,MarkupHelper.createLabel(tr.getName(),ExtentColor.ORANGE));
	}
	
	//To finish extent report
	public void onFinish(ITestContext testContext)
	{
		extent.flush();
	}
	
}
	

