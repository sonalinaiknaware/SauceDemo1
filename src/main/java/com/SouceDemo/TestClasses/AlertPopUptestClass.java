package com.SouceDemo.TestClasses;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.SouceDemo.POMClasses.AlertPopUpPOMClass;

public class AlertPopUptestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yogesh\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		AlertPopUpPOMClass al=new AlertPopUpPOMClass(driver);
		
		al.clickClickme();
		Alert alt=driver.switchTo().alert();
		alt.accept();
		
		
		
	}

}
