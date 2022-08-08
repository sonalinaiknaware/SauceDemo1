package com.SouceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SouceDemo.POMClasses.HomePagePOMClassSauceDemo;
import com.SouceDemo.POMClasses.LoginPOMClassSauceDemo;
import com.SouceDemo.UtilityClasses.ScreenShot_ScrollingConcept;

public class TC07VerifyAbout extends TestBase_Class {
	
		@Test
		public void test() {
		
		HomePagePOMClassSauceDemo hp=new HomePagePOMClassSauceDemo(driver);
		hp.clickSettingBtn();
		hp.clickAboutFunctionality();
		
		ScreenShot_ScrollingConcept.scrolling(driver);
		 System.out.println("Scrolling Done");
		}
	}


