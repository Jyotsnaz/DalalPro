package com.DS1.TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.DS1.Pagelayer.DashBordPage;
import com.DS1.Pagelayer.Exchange_Sell_Page;
import com.DS1.Pagelayer.LoginPage;
import com.DS1.Testbase.TestBase;
import com.DS1.Utility.UtilClass;

public class SellFunctionality extends TestBase{

	
	@Test
	public void verifiedSellFunctionalityofShare() throws InterruptedException
	{     
		String expected_Str="Order Created successfully"; //expected string
				
		dash_obj1.enter_Compary_name_search_box("Wipro");
		dash_obj1.click_on_option();
		Thread.sleep(3000);
			
		exc_sell_obj1.clickOnSellButton();
		exc_sell_obj1.eneterValueQuantitybox("2");
		util_obj1.Scrolling_down();
		exc_sell_obj1.clickOnSellbutton2();
		Thread.sleep(3000);
		
		String actual_result_string=exc_sell_obj1.getSellMessage2(); //geting string throug function
		Assert.assertEquals(actual_result_string, expected_Str); //comparing actual string & expected str 
		
		
		
		
				
		
	}
	
	
	
	
}

