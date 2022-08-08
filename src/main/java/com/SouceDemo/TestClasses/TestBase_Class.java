package com.SouceDemo.TestClasses;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.SouceDemo.POMClasses.LoginPOMClassSauceDemo;

public class TestBase_Class {
	WebDriver driver;
@BeforeMethod

		public void beforeMethod() {
	
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Yogesh\\Downloads\\chromedriver_win32\\chromedriver.exe");

			driver = new ChromeDriver();
	
	
			
			driver.manage().window().maximize();
		
			driver.get("https://www.saucedemo.com/");
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			LoginPOMClassSauceDemo lp = new LoginPOMClassSauceDemo(driver);
			lp.sendUsername();
            System.out.println("UserName is entered");
			lp.sendPassWord();
			 System.out.println("Password is entered");
			lp.clickLoginBtn();
			 System.out.println("loginbutton is clicked");
	}


@AfterMethod
public void afterMethod() {
	driver.quit();
}
}
