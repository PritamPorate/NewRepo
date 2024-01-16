package com.objRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsefulLinksObjRepo {

	@FindBy(xpath="//*[@href='links.html']")
	public WebElement usefulLink;
}
