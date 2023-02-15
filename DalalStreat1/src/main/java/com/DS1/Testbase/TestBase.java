package com.DS1.Testbase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


import com.DS1.Pagelayer.DashBordPage;
import com.DS1.Pagelayer.ExchangeBuyIntradayCustomLimit;
import com.DS1.Pagelayer.ExchangePage;
import com.DS1.Pagelayer.ExchangeSell_IntradayCustomerLimit;
import com.DS1.Pagelayer.Exchange_Sell_Page;
import com.DS1.Pagelayer.LoginPage;
import com.DS1.Pagelayer.TrasationPage;
import com.DS1.Utility.ReadConfig;
import com.DS1.Utility.UtilClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
 public static WebDriver driver;
 
 public static Logger logger;
 public LoginPage log_obj1;
 public UtilClass util_obj1;  
 public DashBordPage  dash_obj1; 
 public ExchangeBuyIntradayCustomLimit cust_limit_obj1;
 public ExchangePage exchange_obj1;
 public Exchange_Sell_Page exc_sell_obj1;
 public ExchangeSell_IntradayCustomerLimit Sell_custlimit_obj1;
 public TrasationPage trans_obj1;	 
 
 	@BeforeTest
 	public void start()
 	{
 		 logger=Logger.getLogger("DalalStreet Automation framework");
 		PropertyConfigurator.configure("Log4jFile.properties");
 		logger.info("Framework execution START");
 	}
 	@AfterTest
 	public void end()
 	{
 		logger.info("Framework execution STOP");
 		
 	}
 
 	@Parameters("browser")
	@BeforeMethod
	public void setUp(String browser) throws InterruptedException
	{
		
		if (browser.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) 
		{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) 
		{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		}
		else
		{
			System.out.println("Plz provide currect browser name");
		}
		
		
		
		
		ReadConfig config=new ReadConfig();
		
		driver.get(config.getApplicationUrl());
		driver.manage().deleteAllCookies();
		driver.manage().window().fullscreen();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		logger.info("Browser launches,url hit,browser maximize");
		
		
		//-----------Copy all object creation --------------------
		
		  log_obj1=new LoginPage(driver);
		  util_obj1=new UtilClass();  
		   dash_obj1=new DashBordPage(driver); 
		  cust_limit_obj1=new  ExchangeBuyIntradayCustomLimit(driver);
		  exchange_obj1=new ExchangePage(driver);
		  
		  exc_sell_obj1=new Exchange_Sell_Page(driver);
		  Sell_custlimit_obj1=new ExchangeSell_IntradayCustomerLimit(driver);
		  trans_obj1=new TrasationPage(driver);	 
		  
		  logger.info("object creation.....");
		  //------------------------copy all login steps here-------------
		  
		   log_obj1.clickEmail_textbox(config.getEmailAddress());
			log_obj1.clickpassword_textbox(config.getPassword());
			log_obj1.clickLogibbutton();
			Thread.sleep(5000);
		  
			logger.info("login in to Application");
		 
	}
	
	
	@AfterMethod
	 
	public void shoutDown()
	 {
		driver.quit();
	 }
	
	
	 
	 
	 
	 
	 
	 
	 
	 
}
