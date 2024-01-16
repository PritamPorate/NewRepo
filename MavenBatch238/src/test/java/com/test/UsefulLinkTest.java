package com.test;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.LoginPage;
import com.pages.UsefulLinkPage;
import com.utitlities.UtitlityMethod;

public class UsefulLinkTest extends UtitlityMethod{

	WebDriver driver;
	LoginPage lp;
	UsefulLinkPage ulp;
	public static Logger Log=Logger.getLogger(UsefulLinkTest.class);
	@BeforeMethod
	public void openBrowser() throws IOException
	{
/*		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("E:/Selenium/Selenium Software all/Selenium Softwares/Offline Website/index.html");
		*/
		Log.info("Open Broweser............");
		driver=initialization();
		lp= new LoginPage(driver);
		ulp=new UsefulLinkPage(driver);
		
	}
	@Test
	public void verifyUsefulLinkPageTilte()
	{
		lp.verifyCorrectCred();
		ulp.openUsefulLinkPAge(driver);
		Assert.assertEquals("JavaByKiran | Useful Links", driver.getTitle());
	}
}
