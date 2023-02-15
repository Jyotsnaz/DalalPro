package com.DS1.Pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExchangeBuyIntradayCustomLimit {

	
	
	public ExchangeBuyIntradayCustomLimit(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Buy')]")
	private WebElement Buy_button;
	
	@FindBy(xpath="(//label[@class='btn btn-outline-secondary'])[2]")
	private WebElement intraday_button;
	
	@FindBy(xpath="(//label[@class='btn btn-outline-secondary'])[4]")
	private WebElement cutomer_limit_button;
	
	@FindBy(xpath="//input[@name='input-Qunatity']")
	private WebElement quantity_txt_box;
	
	@FindBy(xpath="//button[@class='w-md btn btn-success']")
	private WebElement buy_btn2;
	
	@FindBy(xpath="//div[text()='Limit Order Created Successfully']")
	private WebElement msgLimit;
	
	
	public void clickOnBuyButton1()
	{
		Buy_button.click();
	}
	public void clickOnIntraDayButton()
	{
		intraday_button.click();
	}
	public void clickCustomerLimitButton()
	{
		cutomer_limit_button.click();
		
	}
	public void enterValueQuantitybox(String count)
	{
		quantity_txt_box.click();
		quantity_txt_box.sendKeys(count);
	}
	public void clickOnBuyButton2()
	{
		buy_btn2.click();
	}
	public String getBuyMsgIntradayLimit()
	{
		String msg2=msgLimit.getText();
		return msg2;
	}
		
	}
	

