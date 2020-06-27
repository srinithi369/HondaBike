package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
	
	WebDriver ldriver;
	public MainPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath="//ul[@class='brand-collapsible-present']//h3[contains(text(),'Budget')]")
	WebElement budgetRange;
	
	@FindBy(xpath="//body[contains(@class,'bg-light-grey skin-background-black')]/section/div[contains(@class,'container section-bottom-margin')]/div[contains(@class,'grid-12 alpha omega')]/div[contains(@class,'bw-tabs-panel content-box-shadow brand-budget-mileage-style-wrapper browse-bikes')]/div[@id='discoverBudget']/ul[contains(@class,'block-button-list text-center discover-displacement__tab tab-list__wrapper')]/li[8]/a[1]/span[1]")
	WebElement apprxPrice;
	
	@FindBy(id="upDownArrow")
	WebElement brandclick;
	
	@FindBy(xpath="//div[@id='filter-select-brand']//ul[1]//li[3]")
	WebElement brandName;
	
	@FindBy(xpath="//div[@id='minMaxContainer']//span[@id='upDownArrow']")
	WebElement priceRange;
	
	@FindBy(xpath="//li[contains(text(),'80K')]")
	WebElement minPrice;
	
	@FindBy(xpath="//li[contains(text(),'3.5L')]")
	WebElement maxPrice;
	
		
	public void budgetRange()
	{
		budgetRange.click();
	}
	
	public void apprxPrice()
	{
		apprxPrice.click();
	}
	
	public void brandclick()
	{
		brandclick.click();
	}
	
	public void selectBrand()
	{
		brandName.click();
	}
	
	public void priceRange()
	{
		priceRange.click();
	}
	
	public void setminPrice()
	{
		
		minPrice.click();
	}
	
	public void setmaxPrice()
	{
		
		maxPrice.click();
	}

}
