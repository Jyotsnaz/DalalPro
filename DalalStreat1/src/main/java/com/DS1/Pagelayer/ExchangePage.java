package com.DS1.Pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExchangePage {

	public ExchangePage(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Buy')]")
	private WebElement buy_button1;
	
	@FindBy(xpath="//input[@name='input-Qunatity']")
	private WebElement quantity_txt_box;
	
	@FindBy(xpath="//button[@class='w-md btn btn-success']")
	private WebElement buy_button2;
	
	@FindBy(xpath="//div[text()='Order Created successfully']")
	private WebElement Buy_message1;
	
	
	public void clickOnBuyButton1()
	{
		buy_button1.click();
	}
	public void enterValueQuantitybox(String count)
	{
		quantity_txt_box.click();
		quantity_txt_box.sendKeys(count);
	}
	public void clickOnBuyButton2()
	{
		buy_button2.click();
	}
	public String getBuyMessage1()
	{
		String msg1=Buy_message1.getText();
		return msg1;
	}
}
