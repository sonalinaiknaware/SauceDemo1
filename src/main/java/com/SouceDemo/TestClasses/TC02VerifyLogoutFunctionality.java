package com.SouceDemo.TestClasses;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.SouceDemo.POMClasses.HomePagePOMClassSauceDemo;
import com.SouceDemo.POMClasses.LoginPOMClassSauceDemo;

public class TC02VerifyLogoutFunctionality extends TestBase_Class {
@Test
	public void logoutFunctionality() {
		HomePagePOMClassSauceDemo setting=new HomePagePOMClassSauceDemo(driver);
		setting.clickSettingBtn();
		
		HomePagePOMClassSauceDemo logout=new HomePagePOMClassSauceDemo(driver);
		logout.clickLogoutBtn();
		
		String expectedText="Swag Labs";
		String actualText=driver.getTitle();
		if(expectedText.equals(actualText)) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}
	}

}
