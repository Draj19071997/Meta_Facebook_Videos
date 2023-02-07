package com.fb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.qa.base.TestBase;

public class LoginSceen extends TestBase
{
	@FindBy(name="email") WebElement uname;
	@FindBy(name="pass") WebElement upw;
	@FindBy(name="login") WebElement loginBtn;
	@FindBy(linkText = "Forgotten password?") WebElement Forgotten_Password_Btn;
	@FindBy(linkText ="Create new account") WebElement Create_new_account_Btn;
	@FindBy(xpath = "//img[@class='fb_logo _8ilh img']") WebElement FB_Logo;
	@FindBy(xpath = "//h2[@class='_8eso']") WebElement FBHead;
	@FindBy(linkText = "Create a Page") WebElement Create_a_Page_Btn;
	
	public LoginSceen() throws Exception 
	{
		PageFactory.initElements(driver, this);
	}
	
	public String pagetitle()
	{
		return driver.getTitle();
	}
	
	//TC for FBLogo
	public Boolean FBLogo_Validation()
	{
		return FB_Logo.isDisplayed();
	}
	
	//TC for FBHeading
	public String FBHead_String_Validation()
	{
		return FBHead.getText();
	}
	
	//TC for ForgottenPW
	public ForgottenPassword ForgottenPW_Click_Validation()
	{
		Forgotten_Password_Btn.click();
		return new ForgottenPassword();
	}
	
	public Boolean ForgottenPW_Displayed_Validation()
	{
		return Forgotten_Password_Btn.isDisplayed();	
	}
	
	
	//TC for Create_new_account
	
	public Boolean Create_new_account_Btn_Validation()
	{
		return Create_new_account_Btn.isDisplayed();	
	}
	
	public CreateNewAccount Create_new_account_Btn_Click_Validation()
	{
		Create_new_account_Btn.click();
		return new CreateNewAccount();	
	}
	
	public String Create_new_account_Btn_TextFont_Validation()
	{
		return Create_new_account_Btn.getCssValue("font-size");
		
			
	}
	

}
