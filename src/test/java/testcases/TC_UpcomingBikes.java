package testcases;


import pageobjects.UpcomingbikePage;
import utilities.WriteExcel;

public class TC_UpcomingBikes extends BaseClass
{
	public static String bike1Name;
	public static String bike1Price;
	public static String bike1Date;
	public static String bike2Name;
	public static String bike2Price;
	public static String bike2Date;
	
	
   //To get the name of first upcoming bike
   public void getBikeName1() throws InterruptedException
   {
      UpcomingbikePage up=new UpcomingbikePage(driver);
      up.bike1Click();
      Thread.sleep(1000);
      bike1Name = up.bike1Name();
      System.out.println(bike1Name);
   }
   
   //To get the price of first upcoming bike
   public void getBikePrice1() throws InterruptedException
   {
      UpcomingbikePage up=new UpcomingbikePage(driver);
      Thread.sleep(1000);
      bike1Price = up.bike1Price();
      System.out.println(bike1Price);
   }

   //To get the launch date of first upcoming bike
   public void getBikeDate1() throws InterruptedException
   {
      UpcomingbikePage up=new UpcomingbikePage(driver);
      Thread.sleep(1000);
      bike1Date = up.bike1Date();
      System.out.println(bike1Date);
      driver.navigate().back();
      Thread.sleep(1000);
   }
   
   //To get the name of second upcoming bike
   public void getBikeName2() 
   {
      UpcomingbikePage up=new UpcomingbikePage(driver);
      up.bike2Click();
      bike2Name = up.bike2Name();
      System.out.println(bike2Name);
   }

   //To get the price of second upcoming bike
   public void getBikePrice2() 
   {
      UpcomingbikePage up=new UpcomingbikePage(driver);
      bike2Price = up.bike2Price();
      System.out.println(bike2Price);
   }  

   //To get the launch date of second upcoming bike
   public void getBikeDate2() 
   {
      UpcomingbikePage up=new UpcomingbikePage(driver);
      bike2Date = up.bike2Date();
      System.out.println(bike2Date);
      WriteExcel we = new WriteExcel();
      we.writeOutput();
   }
      
}
