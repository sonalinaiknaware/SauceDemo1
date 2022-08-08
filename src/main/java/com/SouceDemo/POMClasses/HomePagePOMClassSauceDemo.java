package com.SouceDemo.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePagePOMClassSauceDemo {

	private static final String String = null;
	WebDriver driver;
	Select s;
	
	@FindBy(xpath = "//button[@id='react-burger-menu-btn']")
	WebElement settingBtn;

	public void clickSettingBtn() {
		settingBtn.click();
	}

	// for single element finding
	@FindBy(xpath = "(//button[@class='btn btn_primary btn_small btn_inventory'])[1]")
	WebElement addToCart;

	public void clickAddToCart() {
		addToCart.click();
	}

	// multiple Element finding
	@FindBy(xpath = "//button[@class='btn btn_primary btn_small btn_inventory']")
	List<WebElement> allElement;

	public void clickAllElement() {
//		for (WebElement elements : allElement) {
//			elements.click();
			for(int i=0; i<allElement.size();i++)
				{
				allElement.get(i).click();
				}

		
	}

	@FindBy(xpath = "//a[@id='logout_sidebar_link']")
	WebElement logOutBtn;

	public void clickLogoutBtn() {
		logOutBtn.click();
	}

	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	WebElement cart;

	public void clickCartBtnToBuy() {
		cart.click();
	}

	public String clickCart() {
		String countOfProduct = cart.getText();
		return countOfProduct;
	}
    @FindBy(xpath="//button[@class='btn btn_secondary back btn_medium']")
    WebElement continueShopping;
    
    public void clickContinueShopping() {
    	continueShopping.click();
    }
    
    @FindBy(xpath="//button[@id='checkout']")
    WebElement checkoutbtn;
    
    public void clickcheckoutBtn() {
    	checkoutbtn.click();
    }
	
    @FindBy(xpath="//input[@id='first-name']")
    WebElement firstNameTextbox;
    
    public void sendFirstName() {
    	firstNameTextbox.sendKeys("Priti");
    }
    
    @FindBy(xpath="//input[@id='last-name']")
    WebElement lastNameTextBox;
    
    public void sendLastName() {
    	lastNameTextBox.sendKeys("Kamble");
    }
    
    @FindBy(xpath="//input[@id='postal-code']")
    WebElement postalCodeTextBox;
    
    public void sendPostalCode() {
    	postalCodeTextBox.sendKeys("123456");
    }
    
    @FindBy(xpath="//input[@id='continue']")
    WebElement continueBtn;
    
    public void clickContinueBtn() {
    	continueBtn.click();
    }
    
    @FindBy(xpath="//button[@id='finish']")
    WebElement finishBtn;
    
    public void clickFinishBtn() {
    	finishBtn.click();
    }
    //DropDown
    @FindBy(xpath="//select[@class='product_sort_container']")
    WebElement dropDown;
    public void clickDropDown() {
    	
    	s.selectByVisibleText("Price (low to high)");
    }
    
    @FindBy(xpath="//a[@id='about_sidebar_link']")
    WebElement aboutFunction;
    
    public void clickAboutFunctionality() {
    	aboutFunction.click();
    }
	public HomePagePOMClassSauceDemo(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
		s=new Select(dropDown);
	}

}
