package com.objRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPageObjRepo {

	@FindBy(xpath="//*[@href='users.html']")
	public WebElement usersLink;
}
