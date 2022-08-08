package com.SouceDemo.TestClasses;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.SouceDemo.POMClasses.HomePagePOMClassSauceDemo;
import com.SouceDemo.TestClasses.TestBase_Class;

public class AllKeywordCombine extends TestBase_Class {
	
	@Test(priority=1)
	public void loginValidation() throws InterruptedException {
		String expectedText = "Swag Labs";
		String actualText = driver.getTitle();
		if (expectedText.equals(actualText)) {
			System.out.println("Passed");

		} else {
			System.out.println("Failed");
		}
		System.out.println("Login validation Done");
		//Thread.sleep(5000);
	}
	@Test(priority=0)
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
		System.out.println("Single product validation is done");
	}
	@Test(priority=2)
	public void allProductSelect() {
		HomePagePOMClassSauceDemo selectAllElement=new HomePagePOMClassSauceDemo(driver);
		selectAllElement.clickAllElement();
		
		String expectedText1="6";
		String actualTest=selectAllElement.clickCart();
		if(expectedText1.equals(actualTest)) {
			System.out.println("passed");
		}
		else {
			System.out.println("Failed");
		}
	}
	
	@Test(priority=1)
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
