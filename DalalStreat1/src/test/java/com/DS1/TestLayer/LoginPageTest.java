package com.DS1.TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.DS1.Pagelayer.LoginPage;
import com.DS1.Testbase.TestBase;
import com.DS1.Utility.UtilClass;

public class LoginPageTest extends TestBase{

	@Test
	public void verifyLoginwithCorrectCred() throws InterruptedException
	{
		String expected_url="https://www.apps.dalalstreet.ai/dashboard";
		
		
		util_obj1.Scrolling_down();
		Thread.sleep(5000);
		
		
		Thread.sleep(5000);
		System.out.println(util_obj1.getWebPageUrl());
		
		String actual_output_url=util_obj1.getWebPageUrl();
		
		Assert.assertEquals(actual_output_url, expected_url);
	}
}
