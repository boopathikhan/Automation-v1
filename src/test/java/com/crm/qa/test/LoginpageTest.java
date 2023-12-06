package com.crm.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.Testbase;
import com.crm.qa.pages.Loginpage;

public class LoginpageTest extends Testbase {
	
	Loginpage loginpage;
	
	
	public LoginpageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginpage = new Loginpage();
	}
	
//	@Test(priority=1)
//	public void loginpagetitleTest() {
//		String title = loginpage.validateloginpagetitle();
//		Assert.assertEquals(title, "GTPL Bank Home Page");
//		
//	}
	
	@Test(priority=1)
	public void LOGIN() {
		 loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	
	
	
	@AfterMethod
	public void Teardown() {
		driver.quit();
	}
	
	

}
