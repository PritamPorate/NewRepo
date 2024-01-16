package com.objRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjRepo {

	@FindBy(id="email")
	public WebElement username;
	
	@FindBy(id="password")
	public WebElement pass;

	@FindBy(xpath="//button")
	public WebElement loginBtn;

}
// Object repository is a centralized location of webelements 
// we can that webelements from everywhere but make sure webelements should be public