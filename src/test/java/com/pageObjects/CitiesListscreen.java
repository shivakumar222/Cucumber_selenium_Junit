package com.pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CitiesListscreen
{
	public WebDriver ldriver;
	 public CitiesListscreen(WebDriver rdriver)
	 {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver, this);
	 }
	 @FindBy(id="btnCreateNew")
	 WebElement addbutton;
	 @FindBy(xpath="//*[@id='bizgaze_body']/div[8]/div")
	 WebElement successMsg;
	
	@FindBy(xpath="//strong[text()='vs383']")
	WebElement listscreenRecord;
	 public void clickOnAddButton()
	 {
		 addbutton.click();
	 }
	 public String retriveSuccessmsg()
	 {
		 return successMsg.getText();
	 }
	
	public void clickonlistscreenRecord()
	{
             listscreenRecord.click();
	}
}
