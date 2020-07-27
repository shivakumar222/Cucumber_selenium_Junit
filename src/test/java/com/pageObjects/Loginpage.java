package com.pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
	public WebDriver ldriver;
	 public Loginpage(WebDriver rdriver)
	 {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver, this);
	 }
	 
	 @FindBy(id="InputEmail")
	 WebElement txtEmail;
	 
	 @FindBy(id="InputPassword")
	 WebElement txtpassword;
	 @FindBy(xpath="//a[text()='Login']")
	 WebElement loginbutton;


	public void setUserName(String uname)
	{
		
		txtEmail.sendKeys(uname);
	}
	public void setPassword(String pwd)
	{

		txtpassword.sendKeys(pwd);
	}
	public void clicklogin()
	{
		loginbutton.click();	
	}
}

