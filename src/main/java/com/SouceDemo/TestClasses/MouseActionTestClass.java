package com.SouceDemo.TestClasses;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.SouceDemo.POMClasses.MouseActionPOMClass;

public class MouseActionTestClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yogesh\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/buttons");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		MouseActionPOMClass ap=new MouseActionPOMClass(driver);
		Thread.sleep(2000);
		ap.clickDoubleClick();
		
		
	}

}
