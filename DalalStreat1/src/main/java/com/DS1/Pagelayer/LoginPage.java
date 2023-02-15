package com.DS1.Pagelayer;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
   public WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//----------------obj repo___
	@FindBy(xpath="//input[@name='email']")
	private WebElement email_txt_box;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password_txt_box;
	
	@FindBy(xpath="//button[text()='Log In']")
	private WebElement login_btn;  
	
	
	
	
	@FindBy(xpath="//a[text()='Signup now']") //clk a signup 
	private WebElement signup_link;

	
	//___________Action method_______
	
	public void clickEmail_textbox(String email )
	{
		email_txt_box.sendKeys(email);
	}
	
	public void clickpassword_textbox(String password )
	{
		password_txt_box.sendKeys(password);
	} 
	
	public void clickLogibbutton()
	{
		login_btn.click(); 
	}
	
	public void clickSign_link()
	{
		signup_link.click();
	}
}
