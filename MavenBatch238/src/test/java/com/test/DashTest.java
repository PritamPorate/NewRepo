package com.test;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.LoginPage;
import com.utitlities.UtitlityMethod;

public class DashTest extends UtitlityMethod{

	WebDriver driver;
	LoginPage lp;
	DashboardPage dbp;
	public static Logger Log=Logger.getLogger(DashTest.class);
	@BeforeMethod
	public void openBrowser() throws IOException
	{
		Log.info("Open browser.....");
		driver = initialization();
		driver.manage().window().maximize();
		lp=new LoginPage(driver);
		dbp=new DashboardPage(driver);
		dbp=navigateToLoginPage().navigateToDashboard(driver);
	}
	@Test
	public void validateNameOfCourse()
	{ Log.info("Verify Title.....");
		//lp.verifyCorrectCred();
	//	Assert.assertTrue(dbp.vrifyCourses());
	}

}
