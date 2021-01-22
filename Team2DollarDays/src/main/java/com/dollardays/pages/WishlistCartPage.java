package com.dollardays.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistCartPage {
	
	WebDriver driver;
	
	public WishlistCartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Wishlist')] ")
	WebElement wishlistmenu;
	public WebElement getwishlistmenu()
	{
		return wishlistmenu;
	}
	
	@FindBy(xpath="//a[contains(text(),'Create a Wishlist')]")
	WebElement Createwishlink;
	public WebElement getCreatewishlink()
	{
		return Createwishlink;
	}
	
	@FindBy(xpath = "//a[contains(text(),'Click here to manage')] ")
	WebElement Cheremnglink;
	public WebElement getheremnglink()
	{
		return Cheremnglink;
	}
	
	@FindBy(xpath="//a[@href='wishlistproduct.aspx']")
	WebElement prodeditlink;
	public WebElement getprodemaillink()
	{
		return prodeditlink;
	}
	
	@FindBy(xpath="//input[@id='ctl00_cphContent_btnUpdateCart']")
	WebElement updatecartbtn;
	public WebElement getupdatecartbtn()
	{
		return updatecartbtn;
	}
	
	@FindBy(xpath="//input[@id='ctl00_cphContent_btnClearCart']")
	WebElement clearcartbtn;
	public WebElement getclearcartbtn()
	{
		return clearcartbtn;
	}
	
	

}
