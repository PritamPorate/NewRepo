package com.test;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.LoginPage;
import com.pages.OperatorPage;
import com.utitlities.UtitlityMethod;

public class OperatorTest extends UtitlityMethod{

	WebDriver driver;
	LoginPage lp;
	OperatorPage op;
	public static Logger Log =Logger.getLogger(OperatorTest.class);
	//LoginTest lt;
	@BeforeMethod
	public void openBrowser() throws IOException
	{
		Log.info("open Browser...........");
		driver=initialization();
		op= new OperatorPage(driver);
		lp = new LoginPage(driver);
	}
	@Test
	public void verifyTitleOfOperatorPage()
	{
		lp.verifyCorrectCred();
		op.openOperatorPage(driver);
		Assert.assertEquals("JavaByKiran | Operators", driver.getTitle());
		
		
	}
}
