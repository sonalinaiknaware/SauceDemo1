package com.SouceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.SouceDemo.POMClasses.HomePagePOMClassSauceDemo;
import com.SouceDemo.POMClasses.LoginPOMClassSauceDemo;

public class TC05VerifyAbleToBuyProduct extends TestBase_Class {
	
	@Test
public void buyProduct() throws InterruptedException {
	HomePagePOMClassSauceDemo hp=new HomePagePOMClassSauceDemo(driver);
	hp.clickAddToCart();
	System.out.println("Add to cart btn is clicked");
	
	hp.clickCartBtnToBuy();
	System.out.println("Add to bucket symbol is clicked");
//Thread.sleep(2000);
	//hp.clickContinueShopping();
	Thread.sleep(1000);
	hp.clickcheckoutBtn();
	System.out.println("Add to checkoutBtn is clicked");
	
	Thread.sleep(1000);
	hp.sendFirstName();
	System.out.println("First name is entered");
	
	Thread.sleep(1000);
	hp.sendLastName();
	System.out.println("Last name is entered");
	
	Thread.sleep(1000);
	hp.sendPostalCode();
	System.out.println("PostalCode is entered");
	
	Thread.sleep(1000);
	hp.clickContinueBtn();
	System.out.println("ContinueBtn is clicked");
	
	
	Thread.sleep(1000);
	hp.clickFinishBtn();
	System.out.println("FinishBtn is clicked");
}
}
