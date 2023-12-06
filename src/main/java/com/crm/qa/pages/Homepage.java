package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.Testbase;

public class Homepage extends Testbase {
	
	@FindBy(xpath=("//a[text()='Demo Site']"))
	WebElement DemoSite;
	
	// initialize the page objects
	
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickdemotext() {
		DemoSite.click();
	}
	
}
