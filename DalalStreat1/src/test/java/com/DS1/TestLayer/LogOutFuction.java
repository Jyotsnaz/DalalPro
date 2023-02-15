package com.DS1.TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.DS1.Pagelayer.DashBordPage;
import com.DS1.Pagelayer.LoginPage;
import com.DS1.Testbase.TestBase;
import com.DS1.Utility.UtilClass;

public class LogOutFuction extends TestBase{

	
	@Test
	public void verifyLogoutFuctionality() throws InterruptedException
	{
		String expexted_url="https://www.apps.dalalstreet.ai/logout";
		
		dash_obj1.clickOnProfileDropdown();
		dash_obj1.clickOnPoweroff();
		
		String actualUral=util_obj1.getWebPageUrl();
		Assert.assertEquals(actualUral, expexted_url);
	}
}
