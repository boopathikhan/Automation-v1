package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testbase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public Testbase()
	{
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\Boopathi k\\Desktop\\Automation_practice\\Automation-v1\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
			prop.load(ip);
		
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch (IOException e) {
		e.printStackTrace();
		
	}
		
	}
	
//	public static void initialization() {
//		String browserName = prop.getProperty("browser");
//		if(browserName.equals("chrome")){
//		System.setProperty("webdriver.chrome.driver", "\"C:\Users\Boopathi k\Downloads\chromedriver_win32"");
//	    driver = new ChromeDriver();
//	} 
//		
//		else if(browserName.equals("firefox")) {
//			
//			System.setProperty("webdriver.gecko.driver", "\"F:\\geckodriver-v0.33.0-win64\\geckodriver.exe\"");
//		    driver = new FirefoxDriver();
//}
	
	
	
	public static void initialization() {
	String browserName = prop.getProperty("browser");
	if(browserName.equals("firefox")){
	System.setProperty("webdriver.chrome.driver", "\"F:\\geckodriver-v0.33.0-win64\\geckodriver.exe\"");
    driver = new FirefoxDriver();
} 
	
	  
	else if(browserName.equals("firefox")) {
		
		System.setProperty("webdriver.gecko.driver", "\"F:\\geckodriver-v0.33.0-win64\\geckodriver.exe\"");
	    driver = new FirefoxDriver();
}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
}
}
