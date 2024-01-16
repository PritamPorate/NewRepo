package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.objRepo.OperatorsObjRepo;

public class OperatorPage extends OperatorsObjRepo{

	public OperatorPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void openOperatorPage(WebDriver driver)
	{
		operatorLink.click();
		String opTitle = driver.getTitle();
		System.out.println(opTitle);
	}
}
