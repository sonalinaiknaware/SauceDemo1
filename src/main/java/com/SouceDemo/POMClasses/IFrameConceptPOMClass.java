package com.SouceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class IFrameConceptPOMClass {
	WebDriver driver;
	Select s;
	@FindBy(xpath="//iframe[@id='frame1']")
	WebElement iframe1;
	public WebElement switchToiFrame1() {
		return iframe1;
	}
	
	@FindBy(xpath = "//iframe[@id='frame3']")
	private WebElement iframe;

	public WebElement switchToiFrame3() {
		return iframe;
	}

	@FindBy(xpath = "//input[@id='a']")
	WebElement checkBox;

	public void clickCheckBox() {
		checkBox.click();
	}
	
	@FindBy(xpath="//iframe[@id='frame2']")
	WebElement iFrame2;
	
	public WebElement switchToIframe2() {
		return iFrame2;
	}
	
	@FindBy(xpath="//select[@id='animals']")
	WebElement dropDown;
	
	public void selectDropDown() {
		dropDown.click();
		s=new Select(dropDown);
		s.selectByVisibleText("Baby Cat");
	}
	
	

	public IFrameConceptPOMClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
}
