package com.SouceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertPopUpPOMClass {

	WebDriver driver;
@FindBy(xpath="//button[@id='alertButton']")
WebElement ClickMe;
	public void clickClickme() {
		ClickMe.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public AlertPopUpPOMClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
}
