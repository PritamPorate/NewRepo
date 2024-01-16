package com.objRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DownloadsObjRepo {

	@FindBy(xpath="//*[@href='downloads.html']")
	public WebElement downloadLink;
}
