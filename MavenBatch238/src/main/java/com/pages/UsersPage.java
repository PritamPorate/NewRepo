package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.objRepo.UserPageObjRepo;

public class UsersPage extends UserPageObjRepo{

	public UsersPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyTitle(WebDriver driver)
	{
		usersLink.click();
		String exp_title=driver.getTitle();
		System.out.println(exp_title);
	}
}
