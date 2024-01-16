package com.test;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.pages.LoginPage;
import com.utitlities.UtitlityMethod;

public class LoginTest extends UtitlityMethod {

	WebDriver driver;
	LoginPage lp;
	public static Logger Log = Logger.getLogger(LoginTest.class);
	@BeforeMethod
	public void openBrowser() throws IOException
	{
		Log.info("Browser open........");
		driver =initialization();
		driver.manage().window().maximize();
		lp=new LoginPage(driver);
		//lp=navigateToLoginPage().navigateToDashboard(driver);
	}
	@Test
	public void validateTitleOfDash()
	{
		lp.verifyCorrectCred();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}
}
