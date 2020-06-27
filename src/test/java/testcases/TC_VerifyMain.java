package testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import pageobjects.MainPage;

public class TC_VerifyMain extends BaseClass {

    @Test(priority=0)
    //To click budget
    public void sortbyBudget()
    {
        MainPage mp = new MainPage(driver);
        logger.info("Browser is opened");
        mp.budgetRange();
    }

    @Test(priority=1)
    //To select approximate price
    public void sortbyapprxPrice()
    {
        MainPage mp = new MainPage(driver);
        mp.apprxPrice();
        logger.info("Approximate price is selected");
    }

    @Test(priority=2)
    //To select brand name
    public void sortbyBrandName()
    {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        MainPage mp = new MainPage(driver);
        mp.brandclick();
        mp.selectBrand();
        logger.info("Brand name is selected");
    }
   
    @Test(priority=3)
    //To select price range
    public void sortbyPriceRange() throws InterruptedException
    {
        MainPage mp = new MainPage(driver);
        mp.priceRange();
        mp.setminPrice();
        mp.setmaxPrice();
        mp.priceRange();
        Thread.sleep(1000);
        logger.info("Price range is selected");
    }
   
    @Test(priority=4)
    //To get first upcoming bike name 
    public void upcomingbikeName1() throws InterruptedException, IOException
    {
        logger.info("Upcoming first bike name ");
        TC_UpcomingBikes ub = new TC_UpcomingBikes();
        ub.getBikeName1();
    }
   
    @Test(priority=5)
    //To get first upcoming bike price 
    public void upcomingbikePrice1() throws InterruptedException, IOException
    {
        logger.info("Upcoming first bike price ");
        TC_UpcomingBikes ub = new TC_UpcomingBikes();
        ub.getBikePrice1();
    }
   
    @Test(priority=6)
    //To get first upcoming bike launch date
    public void upcomingbikeDate1() throws InterruptedException, IOException
    {
        logger.info("Upcoming first bike release date ");
        TC_UpcomingBikes ub = new TC_UpcomingBikes();
        ub.getBikeDate1();
    }  
   
    @Test(priority=7)
    //To get second upcoming bike name 
    public void upcomingbikeName2() throws IOException
    {
        logger.info("Upcoming second bike name ");
        TC_UpcomingBikes ub = new TC_UpcomingBikes();
        ub.getBikeName2();
    }
   
    @Test(priority=8)
    //To get second upcoming bike price
    public void upcomingbikePrice2() throws IOException
    {
        logger.info("Upcoming second bike price ");
        TC_UpcomingBikes ub = new TC_UpcomingBikes();
        ub.getBikePrice2();
    }
   
    @Test(priority=9)
    //To get second upcoming bike name 
    public void upcomingbikeDate2() throws IOException
    {
        logger.info("Upcoming second bike release date ");
        TC_UpcomingBikes ub = new TC_UpcomingBikes();
        ub.getBikeDate2();
    }
    
}
