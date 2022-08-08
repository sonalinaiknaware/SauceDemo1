package com.SouceDemo.TestClasses;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.SouceDemo.POMClasses.HomePagePOMClassSauceDemo;
import com.SouceDemo.POMClasses.LoginPOMClassSauceDemo;

public class TC03VerifySingleProductSelect extends TestBase_Class {
     @Test
	
		public void singleProductSelect() {
		HomePagePOMClassSauceDemo addToCart=new HomePagePOMClassSauceDemo(driver);
		addToCart.clickAddToCart();
		
		String expectedText="1";
		String toCart=addToCart.clickCart();
		if(expectedText.equals(toCart)) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}
	}

}
