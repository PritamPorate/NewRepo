package com.objRepo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashPageObjRepo {

	@FindBy(xpath="//h3")
	public List<WebElement> listOfCourses;
}
