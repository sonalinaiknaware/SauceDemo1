package com.SouceDemo.TestClasses;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.SouceDemo.POMClasses.IFrameConceptPOMClass;
import com.SouceDemo.UtilityClasses.ScreenShot_ScrollingConcept;
import com.SouceDemo.UtilityClasses.ScreenShot_ScrollingConcept;

public class IFrameTESTClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yogesh\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		IFrameConceptPOMClass hp=new IFrameConceptPOMClass(driver);
        driver.switchTo().frame(hp.switchToiFrame1());
        ScreenShot_ScrollingConcept.scrolling(driver);
//		driver.switchTo().frame(hp.switchToiFrame3());
//		Thread.sleep(1000);
//		hp.clickCheckBox();
//		driver.switchTo().parentFrame();
//		
//		driver.switchTo().frame(hp.switchToIframe2());
//		Thread.sleep(1000);
//		hp.selectDropDown();
		
		
	}

}
