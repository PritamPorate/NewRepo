package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.objRepo.DownloadsObjRepo;

public class DownloadPage extends DownloadsObjRepo{

	public DownloadPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void openDownloadPage()
	{
		downloadLink.click();
	
	}
}
