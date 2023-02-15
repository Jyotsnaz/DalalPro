package com.DS1.Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import com.DS1.Testbase.TestBase;



public class UtilClass extends TestBase{
	
	public UtilClass()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public String getWebPageUrl()
	{
		String url=driver.getCurrentUrl();
		return url;
	}
	
	public void Scrolling_down()
	{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,600)");
	}
		
	public static void takeSS(String filename) 
	{
		String path="C:\\Users\\Lenovo\\eclipse-workspace\\dalastreet1\\ScreenShorts\\";
		
		
		try {
			
			TakesScreenshot ts=(TakesScreenshot)driver;
			
			File src=ts.getScreenshotAs(OutputType.FILE);
			File des=new File(path+filename+".png");
		FileHandler.copy(src, des);
		}catch(IOException e)
		{
		e.printStackTrace();
	}
}
}