package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CitiesCreationPage
{
	public WebDriver ldriver;
	 public CitiesCreationPage(WebDriver rdriver)
	 {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver, this);
	 }
	 
	 @FindBy(id="txt_CityName")
	 WebElement cityname;
	 
	 @FindBy(id="txt_CityCode")
	 WebElement citycode;
	 
	 @FindBy(id="select2-txtAutoComplete_110144181002819_DistrictId-container")
	 WebElement districtname;
	 
	 @FindBy(xpath="//button[text()='Save']")
	 WebElement savebutton;
	 
	 @FindBy(id="Bizgaze-messageInfo")
	 WebElement errormsg;
	 
	 public void  enterCityname(String city)
	 {
		 cityname.sendKeys(city);
	 }
	 public void  enterCitycode(String code)
	 {
		 citycode.sendKeys(code);
	 }
	 public void  clickonDistrict()
	 {
		 districtname.click();
	 }
	 public void clickonsavebutton()
	 {
		 savebutton.click();
	 }
	 public String  retriveErrorMessage()
	 {
		return errormsg.getText();
       
	 }	
	 }
