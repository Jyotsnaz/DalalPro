package com.DS1.Pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExchangeSell_IntradayCustomerLimit {
	
	public ExchangeSell_IntradayCustomerLimit(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	
	@FindBy(xpath="//a[contains(text(),'Sell')]")
	private WebElement sell_btn;
	
	@FindBy(xpath="(//label[text()='Intraday'])[2]")
	private WebElement intraday_btn;
	
	@FindBy(xpath="(//label[text()='Custom Limit'])[2]")
	private WebElement customerLimit_btn;
	
	@FindBy(xpath="//input[@id='quantity']")
	private WebElement quantity_text_box;
	
	@FindBy(xpath="//button[contains(text(),'Sell')]")
	private WebElement  sell2_btn;
	
	@FindBy(xpath="(//div[text()='Limit Order Created Successfully'])[1]")
	private WebElement sell_msg_limit;
	
	public void clickOnSell_Button1()
	{
		sell_btn.click();
	}
	public void clickOnIntraDayButton()
	{
		intraday_btn.click();
	}
	public void clickOnCustomerLimitButton()
	{
		customerLimit_btn.click();
	}
	public void enterTheNOofQuantity(String count)
	{
		quantity_text_box.click();
		quantity_text_box.sendKeys(count);
	}
	public String getmsg()
	{
		String msg3=sell_msg_limit.getText();
		return msg3;
	}
	public void clickOnSell_Button2()
	{
		sell2_btn.click();
	}
	
	//div[text()='Limit Order Created Successfully']
	
	
}
