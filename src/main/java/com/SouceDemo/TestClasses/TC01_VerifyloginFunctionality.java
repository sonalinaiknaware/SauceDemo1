package com.SouceDemo.TestClasses;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.SouceDemo.POMClasses.LoginPOMClassSauceDemo;

public class TC01_VerifyloginFunctionality extends TestBase_Class {

	@Test
	public void login_Test(){
		String expectedText = "Swag Labs";
		String actualText = driver.getTitle();
		if (expectedText.equals(actualText)) {
			System.out.println("Passed");

		} else {
			System.out.println("Failed");
		}

	}

}
