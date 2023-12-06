package com.crm.qa.pages;

import org.eclipse.jetty.util.security.Password;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.Testbase;

public class Loginpage extends Testbase {
	
	@FindBy(name="uid")
	WebElement uid;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="btnLogin")
	WebElement btnLogin;
	
	
	
//	@FindBy(xpath="//input [@type='LOGIN']")
//	WebElement LOGIN; btnLogin
	
	public  Loginpage() {
	
		PageFactory.initElements(driver, this);
	}
	
	public String  validateloginpagetitle() {
		return driver.getTitle();
	}
	
	public Homepage login(String un, String pwd) {
		uid.sendKeys(un);
		password.sendKeys(pwd);
		btnLogin.click();
		
		return Homepage();
		
	
	}

	private Homepage Homepage() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

