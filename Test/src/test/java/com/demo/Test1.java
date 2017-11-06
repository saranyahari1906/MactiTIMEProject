package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;



public class Test1 {
	WebDriver driver;
	@Parameters("sBrowser")
@BeforeMethod
public void Launch(String sBrowser)
{
		if(sBrowser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.firefox.driver", "./driver/geckodriver.exe");
			driver=new ChromeDriver();
		}
		else if(sBrowser.equalsIgnoreCase("chrome")){
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	driver=new ChromeDriver();}
	driver.get("https://www.google.co.in");
	}
@AfterMethod
public void testClose()
{
	driver.quit();
	}
}
