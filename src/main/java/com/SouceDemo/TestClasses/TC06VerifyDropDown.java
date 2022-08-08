package com.SouceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.SouceDemo.POMClasses.HomePagePOMClassSauceDemo;
import com.SouceDemo.POMClasses.LoginPOMClassSauceDemo;

public class TC06VerifyDropDown extends TestBase_Class {
@Test
	public void verifyDropDown() {
		
		
		HomePagePOMClassSauceDemo hp=new HomePagePOMClassSauceDemo(driver);
		hp.clickDropDown();
	}

}
