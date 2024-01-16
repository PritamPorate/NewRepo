package com.utitlities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.pages.LoginPage;

public class UtitlityMethod {
 
	public static WebDriver driver=null;
	FileInputStream fis = null;
	public String readProperty(String key) throws IOException
	{ // this method we are used for calling to the config.properties file and take url and browser 
		Properties prop=new Properties();
		try {
			fis=new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/Config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop.getProperty(key);
	}
	
	public void launchApplication() throws IOException
	{
		driver.get(readProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}
	public WebDriver initialization() throws IOException
	{
		if(readProperty("browser").equals("chrome"))
	    {
			System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
			driver=new ChromeDriver();
			launchApplication();
		}
		else
		{ //  cross browsing
			
			//if(readProperty("browser").equals("firefox"))
			System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
			driver=new FirefoxDriver();
		launchApplication();
		}
		return driver;	
	}
	public LoginPage navigateToLoginPage()
	{
		LoginPage lp =new LoginPage(driver);
		return lp;
		
	}
}
