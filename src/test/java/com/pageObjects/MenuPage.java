package com.pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage
{
	public WebDriver ldriver;
	 public MenuPage(WebDriver rdriver)
	 {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver, this);
	 }
	 @FindBy(xpath="//div[text()='Cities']")
	 WebElement citiesmodulelink;
	
	 
	 public void clickOnCitiesModule()
	 {
		 citiesmodulelink.click();
	 }
	
}

