package com.SouceDemo.TestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.SouceDemo.POMClasses.HomePagePOMClassSauceDemo;
import com.SouceDemo.POMClasses.LoginPOMClassSauceDemo;

public class TC04VerifyMultiProductSelect extends TestBase_Class {
     @Test
	public void allProductSelect() {
		HomePagePOMClassSauceDemo selectAllElement=new HomePagePOMClassSauceDemo(driver);
		selectAllElement.clickAllElement();
		
		String expectedText1="6";
		String actualTest=selectAllElement.clickCart();
		Assert.assertEquals(actualTest, expectedText1);
	}

	}


