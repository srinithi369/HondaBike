package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpcomingbikePage {
	WebDriver ldriver;
	public UpcomingbikePage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath="//section[@id='upcomingBikesSection']//li[1]")
	WebElement bike1Click;
	
	@FindBy(xpath="//h1[contains(@class,'inline-block margin-right15')]")
	WebElement bike1Name;
	
	@FindBy(xpath="//div[contains(@class,'modelExpectedPrice margin-bottom15')]")
	WebElement bike1Price;
	
	@FindBy(xpath="//p[contains(@class,'modelLaunchDate text-bold font18 margin-bottom10')]")
	WebElement bike1Date;
	
	@FindBy(xpath="//section[@id='upcomingBikesSection']//li[2]")
	WebElement bike2Click;
	
	@FindBy(xpath="//h1[contains(@class,'inline-block margin-right15')]")
	WebElement bike2Name;
	
	@FindBy(xpath="//div[contains(@class,'modelExpectedPrice margin-bottom15')]")
	WebElement bike2Price;
	
	@FindBy(xpath="//p[contains(@class,'modelLaunchDate text-bold font18 margin-bottom10')]")
	WebElement bike2Date;
	
	public void bike1Click()
	{
		bike1Click.click();
	}
	
	public String bike1Name()
	{
		return bike1Name.getText();
	}
	
	public String bike1Price()
	{
		return bike1Price.getText();
	}
	
	public String bike1Date()
	{
		return bike1Date.getText();
	}
	
	public void bike2Click()
	{
		bike2Click.click();
	}
	
	public String bike2Name()
	{
		return bike2Name.getText();
	}
	
	public String bike2Price()
	{
		return bike2Price.getText();
	}
	
	public String bike2Date()
	{
		return bike2Date.getText();
	}
	
	
	
	
	
	
	
	
	
	

}
