package com.DS1.TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.DS1.Pagelayer.DashBordPage;
import com.DS1.Pagelayer.ExchangePage;
import com.DS1.Pagelayer.LoginPage;
import com.DS1.Testbase.TestBase;
import com.DS1.Utility.UtilClass;

public class Buyfunctionality_shares extends TestBase {

	@Test
	public void VerifiedBuyFunctionalityofShares() throws InterruptedException
	{    
		String expected_result="Order Created successfully";
       
		//------------------------------
		
		dash_obj1.enter_Compary_name_search_box("wipro");
		dash_obj1.click_on_option();
		Thread.sleep(2000);
		//___________________
		exchange_obj1.clickOnBuyButton1();
		exchange_obj1.enterValueQuantitybox("1");
		util_obj1.Scrolling_down();
		//Thread.sleep(6000);
		exchange_obj1.clickOnBuyButton2();
		
		
		Thread.sleep(3000);
		String acttual_result=exchange_obj1.getBuyMessage1();
		Assert.assertEquals(acttual_result,expected_result);
	}
	
}
