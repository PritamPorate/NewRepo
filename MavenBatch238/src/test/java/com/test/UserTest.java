package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.LoginPage;
import com.pages.UsersPage;

public class UserTest{

	WebDriver driver;
	UsersPage up;
	LoginPage lp;
	
	@BeforeMethod
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("E:/Selenium/Selenium Software all/Selenium Softwares/Offline Website/index.html");
		driver.manage().window().maximize();
		up=new UsersPage(driver);
		lp=new LoginPage(driver);
	}
	@Test
	public void validateTitleOfUserPage()
	{
		lp.verifyCorrectCred();
	   up.verifyTitle(driver);
		Assert.assertEquals("JavaByKiran | User",driver.getTitle());
	}
}
