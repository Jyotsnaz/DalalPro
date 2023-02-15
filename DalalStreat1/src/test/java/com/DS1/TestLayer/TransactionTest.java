package com.DS1.TestLayer;

import org.testng.annotations.Test;

import com.DS1.Pagelayer.DashBordPage;
import com.DS1.Pagelayer.LoginPage;
import com.DS1.Pagelayer.TrasationPage;
import com.DS1.Testbase.TestBase;
import com.DS1.Utility.UtilClass;

public class TransactionTest extends TestBase{

	@Test
	public void getDatafromTrastionPage() throws InterruptedException
	{
				       
		
		
		 
		dash_obj1.clickOnTrasatonlink();
		trans_obj1.getAllData();
	}
}
