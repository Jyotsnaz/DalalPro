package com.DS1.Pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBordPage {

	public  DashBordPage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
		
	}
	//------obj repo------
	
	@FindBy(xpath="//input[@class='form-control']")
	private WebElement search_TextBox;
	
	@FindBy(xpath="(//div[@class='m-4 card'])[2]")
	private WebElement select_option;
	
	@FindBy(xpath="//button[@id='page-header-user-dropdown']")
	private WebElement profile_dropdown;
	
	@FindBy(xpath="//span[contains(text(),'Power Off')]")
	private WebElement power_off;
	
	@FindBy(xpath="//a[text()='Transactions']")
	private WebElement transation_link;

	//=============action methods=============
	public void enter_Compary_name_search_box(String comopany_name)
	{
		search_TextBox.sendKeys(comopany_name);
	}
	
	public void click_on_option()
	{
		select_option.click();
	}
	
	public void clickOnProfileDropdown()
	{
		profile_dropdown.click();
	}
	
	public void clickOnPoweroff()
	{
		power_off.click();	
	}
	
	public void clickOnTrasatonlink()
	{
		transation_link.click();
	}
}
