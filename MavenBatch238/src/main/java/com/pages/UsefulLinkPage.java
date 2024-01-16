package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.objRepo.UsefulLinksObjRepo;

public class UsefulLinkPage extends UsefulLinksObjRepo{
	
	public UsefulLinkPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void openUsefulLinkPAge(WebDriver driver)
	{
		usefulLink.click();
		String act_title= driver.getTitle();
		System.out.println(act_title);
	}
	
}
