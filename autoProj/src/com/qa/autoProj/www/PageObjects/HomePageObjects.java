package com.qa.autoProj.www.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObjects 
{
	@FindBy(xpath="//a[contains(text(),\"Mobile\")]")
	WebElement txtMobile;
}
