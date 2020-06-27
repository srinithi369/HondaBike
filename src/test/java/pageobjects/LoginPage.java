package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	@FindBy(xpath="//div[@class='login-box firstLogin']")
	WebElement clickLogin;
	
	@FindBy(id="txtLoginid")
	WebElement userId;
	
	@FindBy(id="txtPasswd")
	WebElement userPswd;
	
	@FindBy(id="btnLogin")
	WebElement clickLogIn;
	
	@FindBy(id="cityName")
	WebElement selectCity;
	
	@FindBy(id="globalCityPopUp")
	WebElement typeCity;
	
	@FindBy(id="btnGlobalCityPopup")
	WebElement confirmCity;
	
	@FindBy(xpath="//div[@class='bw-blackbg-tooltip']")
	WebElement errorMessage;
	
	public void clickLogin()
	{
		clickLogin.click();
		
	}
	
	public void setuserId(String uid)
	{
		userId.sendKeys(uid);
	}
	
	public void setuserPswd(String pswd)
	{
		userPswd.sendKeys(pswd);
	}
	
	public void clickLogIn()
	{
		clickLogIn.click();
	}
	
	public void selectCity()
	{
		selectCity.click();
	}
	
	public void typeCity(String city )
	{
		typeCity.sendKeys(city);
	}
	public void confirmCity()
	{
		confirmCity.click();
	}
	public String errorMessage()
	{
		return errorMessage.getText();
		
	}
	

	
}
