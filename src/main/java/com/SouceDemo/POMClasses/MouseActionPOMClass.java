package com.SouceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MouseActionPOMClass {

	WebDriver driver;
	 Actions act;
	@FindBy(xpath = "//button[@id='doubleClickBtn']")
	WebElement doubleclickMe;
	
	public void clickDoubleClick() {
		 act.doubleClick(doubleclickMe).perform();
		
	}
		 
		 public MouseActionPOMClass(WebDriver driver) {
			 this.driver=driver;
			 PageFactory.initElements(driver, this);
			 act=new Actions(driver);
		 }
	 
}
