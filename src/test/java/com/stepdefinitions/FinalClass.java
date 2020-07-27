package com.stepdefinitions;
import org.openqa.selenium.WebDriver;

import com.pageObjects.CitiesCreationPage;
import com.pageObjects.CitiesListscreen;
import com.pageObjects.Loginpage;
import com.pageObjects.MenuPage;

import io.cucumber.core.logging.Logger;

public class FinalClass 
{
// this is the base class common properties we will specify here and we will extends this base class and we will use 
	public WebDriver driver;
	public Loginpage lp;
	public MenuPage mp;
	public CitiesListscreen cl;
	public CitiesCreationPage cp;
	public static Logger logger;
	
	
	
	/*public static String randomString()
	{
		String generatedString1=RandomStringUtils.randomAlphabetic(5);
		return (generatedString1);
	}*/
}

