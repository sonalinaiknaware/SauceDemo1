package com.SouceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.SouceDemo.POMClasses.LoginPOMClassFlipCart;
import com.SouceDemo.UtilityClasses.ScreenShot_ScrollingConcept;
import com.SouceDemo.UtilityClasses.ScreenShot_ScrollingConcept;

public class T1LoginTestClassFlipCart {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yogesh\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//Thread.sleep(5000);
		
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		
		driver.get("https://www.flipkart.com/");
		//Thread.sleep(5000);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		LoginPOMClassFlipCart un=new LoginPOMClassFlipCart(driver);
				un.sendUserName();
				ScreenShot_ScrollingConcept.screenShot(driver);
				un.sendPassword();
				un.clickLoginBtn();
	}

}
