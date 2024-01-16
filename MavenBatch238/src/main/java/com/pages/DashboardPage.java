package com.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.objRepo.DashPageObjRepo;

public class DashboardPage extends DashPageObjRepo {

	DashPageObjRepo dp;
	public DashboardPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		dp=new DashPageObjRepo();
	}
	public boolean vrifyCourses()
	{
		ArrayList<String> expCourses = new ArrayList();
		expCourses.add("Selenium");
		expCourses.add("Java / J2EE");
		expCourses.add("Python");
		expCourses.add("Php");
		
		ArrayList<String> actCourse = new ArrayList<String>(); 

		for (WebElement verifyCourses : listOfCourses) {
			
			String realCourses=verifyCourses.getText();
			actCourse.add(realCourses);
			System.out.println(realCourses);
		}
		System.out.println("print actual list of course name..."+actCourse);
		if(actCourse.equals(expCourses))
		{
			return true;
		}
		else
		{
			return false;
		}
			
	}
}
