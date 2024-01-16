package com.objRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OperatorsObjRepo {

	@FindBy(xpath="//*[@href='operators.html']")
	public WebElement operatorLink;
}
