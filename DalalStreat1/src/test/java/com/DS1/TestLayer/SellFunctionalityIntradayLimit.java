package com.DS1.TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.DS1.Pagelayer.DashBordPage;
import com.DS1.Pagelayer.ExchangeSell_IntradayCustomerLimit;
import com.DS1.Pagelayer.LoginPage;
import com.DS1.Testbase.TestBase;
import com.DS1.Utility.UtilClass;

public class SellFunctionalityIntradayLimit extends TestBase {

@Test	
	public void verify_Sell_OnLimitOrder () throws InterruptedException
	{
	String expected_string="Limit Order Created Successfully";
	
	 dash_obj1.enter_Compary_name_search_box("Wipro");
	 dash_obj1.click_on_option();
	 Thread.sleep(2000);
	 
	 
	 Sell_custlimit_obj1.clickOnSell_Button1();
	 Sell_custlimit_obj1.clickOnIntraDayButton();
	 Sell_custlimit_obj1.clickOnCustomerLimitButton();
	 Sell_custlimit_obj1.enterTheNOofQuantity("1");
	 util_obj1.Scrolling_down();
	 Sell_custlimit_obj1.clickOnSell_Button2();
	Thread.sleep(2000);
	
	String actual_string=Sell_custlimit_obj1.getmsg();
	Assert.assertEquals(actual_string, expected_string);
	}
	
	
}
