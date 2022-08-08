package com.SouceDemo.TestClasses;

import org.apache.http.util.Asserts;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SouceDemo.POMClasses.HomePagePOMClassSauceDemo;

public class AssertionConcept extends TestBase_Class {
	@Test
	public void loginValidation() throws InterruptedException {
		String expectedText = "Swag Labs";
		String actualText = driver.getTitle();
		Asserts.assertEquals(actualText, expectedText);
		//Thread.sleep(5000);
	}
	@Test
	public void singleProductSelect() {
		HomePagePOMClassSauceDemo addToCart=new HomePagePOMClassSauceDemo(driver);
		addToCart.clickAddToCart();
		
		String expectedText="1";
		String actualText=addToCart.clickCart();
		Assert.assertEquals(actualText, expectedText);
	
	}
	@Test
	public void allProductSelect() {
		HomePagePOMClassSauceDemo selectAllElement=new HomePagePOMClassSauceDemo(driver);
		selectAllElement.clickAllElement();
		
		String expectedText1="6";
		String actualTest=selectAllElement.clickCart();
		Assert.assertEquals(actualTest, expectedText1);
	}
	
	@Test
	public void logoutFunctionality() {
		HomePagePOMClassSauceDemo setting=new HomePagePOMClassSauceDemo(driver);
		setting.clickSettingBtn();
		
		HomePagePOMClassSauceDemo logout=new HomePagePOMClassSauceDemo(driver);
		logout.clickLogoutBtn();
		
		String expectedText="Swag Labs";
		String actualText=driver.getTitle();
		Assert.assertEquals(actualText, expectedText);
}
}
