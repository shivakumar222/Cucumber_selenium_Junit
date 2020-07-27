package com.stepdefinitions;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pageObjects.CitiesCreationPage;
import com.pageObjects.CitiesListscreen;
import com.pageObjects.Loginpage;
import com.pageObjects.MenuPage;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class StepDefinitions extends FinalClass
{
	WebDriverWait w1;
/*	@Before//hook annotation belongs to cucumber class
	public void setUp()
	{
		
	}*/
	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() 
	{
		
	   System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Executors/chromedriver.exe");
	    driver=new ChromeDriver();	
	}

	@When("user opens URL {string}")
	public void user_opens_url(String url)
	{
	    driver.get(url);
	}

	@When("user enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String email, String pwsd) 
	{
	  lp=new Loginpage(driver);
	  lp.setUserName(email);
	  lp.setPassword(pwsd);
	}
	@And("click on login")
	public void click_on_login() 
	{
	   lp.clicklogin();
	   driver.manage().window().maximize();
	}
	@Given("user click on Cities module link")
	public void user_click_on_cities_module_link() 
	{
		mp=new MenuPage(driver);
		 w1=new WebDriverWait(driver,30);
		w1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='Cities']")));
		mp.clickOnCitiesModule();
	}

	@And("user click on add button")
	public void user_click_on_add_button() 
	{
		cl=new CitiesListscreen(driver);
	  cl.clickOnAddButton();
	}

	@When("user give cityname as {string}")
	public void user_give_cityname_as(String cityname) 
	{
		cp=new CitiesCreationPage(driver);
	  w1.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt_CityName")));
	  cp.enterCityname(cityname);
	 
	}
	@When("user give  citycode as {string}")
	public void user_give_citycode_as(String code)
	{
	  cp.enterCitycode(code);
	}

	@And("select district")
	public void select_district() throws InterruptedException
	{
	  cp.clickonDistrict();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//li[text()='Agra']")).click();
	}
	
	@Then("click on save")
	public void click_on_save() 
	{
	 cp.clickonsavebutton();
	}
	@And("Retrive successMsg")
	public void Retrive_successMsg() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println(cl.retriveSuccessmsg());
	}

@And("Retrive Errormsg")
public void retrive_Errormsg()
{
   String msg= cp.retriveErrorMessage();
   System.out.println(msg);
}
	@Then("close browser")
	public void close_browser()
	{
	 driver.quit();
	}

}

