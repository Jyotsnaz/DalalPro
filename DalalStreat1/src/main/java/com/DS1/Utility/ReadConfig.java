package com.DS1.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
	public ReadConfig()
	{
		String path="C:\\Users\\Lenovo\\eclipse-workspace\\dalastreet1\\src\\test\\resources\\configration\\configrat.properties";
		
		try
		{
			File file=new File(path);
			FileInputStream fis= new FileInputStream(file);	
		 pro=new Properties();
		pro.load(fis);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public String  getApplicationUrl()
	{
		String url=pro.getProperty("url");
		return url;
	}
	
	public String getEmailAddress()
	{
		return pro.getProperty("email");
	}
	
	public String getPassword()
	{
		return pro.getProperty("password");
	}
}
