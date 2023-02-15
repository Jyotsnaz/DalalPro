package com.DS1.Pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Exchange_Sell_Page {

	public Exchange_Sell_Page(WebDriver driver)
	{
	PageFactory.initElements(driver,this);
	}

@FindBy(xpath="//a[contains(text(),'Sell')]")
private WebElement sell_button;

@FindBy(xpath="//input[@id='quantity']")
private WebElement quantity_text_box;

@FindBy(xpath="//button[contains(text(),'Sell')]")
private WebElement sell_button2;

@FindBy(xpath="//div[text()='Order Created successfully']")
private WebElement sell_msg;
 

public void clickOnSellButton()
{
	sell_button.click();
}
 public void eneterValueQuantitybox(String count)
 {
	 quantity_text_box.click();
	 quantity_text_box.sendKeys(count);
 
 }
 public void clickOnSellbutton2()
 {
	 sell_button2.click();
 }
 
 public String getSellMessage2()
 {
	 String msg2=sell_msg.getText();
	 return msg2;
 }
 
 
 
 }



