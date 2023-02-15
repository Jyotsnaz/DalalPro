package com.DS1.TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.DS1.Pagelayer.DashBordPage;
import com.DS1.Pagelayer.ExchangeBuyIntradayCustomLimit;
import com.DS1.Pagelayer.LoginPage;
import com.DS1.Testbase.TestBase;

public class BuyFunctionality_intraday_limit extends TestBase{

	
	@Test
	
	public void verify_Buy_fun_intraday_limit() throws InterruptedException
	{
		
		String expected_String_limit_msg="Limit Order Created Successfully";  //Providing expected String
				 
		 dash_obj1.enter_Compary_name_search_box("Wipro");
		 dash_obj1.click_on_option();
		 Thread.sleep(2000);
		 
		 
		 cust_limit_obj1.clickOnBuyButton1();       //buy share with limit order
		 cust_limit_obj1.clickOnIntraDayButton();
		 cust_limit_obj1.clickCustomerLimitButton();
		 cust_limit_obj1.enterValueQuantitybox("3");
		 util_obj1.Scrolling_down();            // Scroll down
		 cust_limit_obj1.clickOnBuyButton2();
		 
		 Thread.sleep(5000);
		 String acual_limit_msg=cust_limit_obj1.getBuyMsgIntradayLimit(); //comparing limit order msg
		 Assert.assertEquals(acual_limit_msg, expected_String_limit_msg);
		 
		
	}
	
	
	
}
