package com.test;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.DownloadPage;
import com.pages.LoginPage;
import com.utitlities.UtitlityMethod;

public class DownloadTest extends UtitlityMethod{

	WebDriver driver;
	LoginPage lp;
	DownloadPage dop;
	public static Logger Log = Logger.getLogger(DownloadTest.class);
	
	@BeforeMethod
	public void openBrowser() throws IOException
	{
		Log.info("open Browser........");
		driver=initialization();
		lp=new LoginPage(driver);
		dop= new DownloadPage(driver);
		
	}
	@Test
	public void verifyTitleOfDownloadPage()
	{
	    	lp.verifyCorrectCred();
	    	dop.openDownloadPage();
	    	Assert.assertEquals("JavaByKiran | Downloads", driver.getTitle());
	}
}
