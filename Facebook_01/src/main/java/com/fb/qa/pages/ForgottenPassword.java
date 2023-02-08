package com.fb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.qa.base.TestBase;

public class ForgottenPassword extends TestBase
{
	@FindBy (xpath = "//a[@aria-label='Facebook']") WebElement Fblogo;
	@FindBy (xpath = "//input[@placeholder='Email or phone']") WebElement EmailTextbox;
	@FindBy (xpath = "//input[@placeholder='Password']") WebElement PasswordTextbox;
	@FindBy (xpath = "//h2[@class='uiHeaderTitle']") WebElement FindYourAccPopup;
	@FindBy(linkText = "Cancel") WebElement CancleBtn;
	
	public ForgottenPassword() throws Exception 
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean FacebookLogo()
	{
		return Fblogo.isDisplayed();
	}

}
