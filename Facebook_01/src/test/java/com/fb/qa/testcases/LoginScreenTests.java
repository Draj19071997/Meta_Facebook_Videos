package com.fb.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.fb.qa.base.TestBase;
import com.fb.qa.pages.ForgottenPassword;
import com.fb.qa.pages.LoginSceen;

public class LoginScreenTests extends TestBase
{
	LoginSceen login;
	ForgottenPassword FPW;
	
	LoginScreenTests() throws Exception
	{
		super();
	}
	
	@BeforeTest
	public void setup() throws Exception
	{
		initalization();
		login=new LoginSceen();
	}
	
	@Test
	public void Validate_PageTitle() 
	{
		String ExpectedTitle=login.pagetitle();
		String ActualTitle="Facebook – log in or sign up";
		Assert.assertEquals(ActualTitle, ExpectedTitle, "Title is not matching");
	}
	
	@Test
	public void Logo_Validation() {
		Boolean LogoDisplayed= login.FBLogo_Validation();
		Assert.assertEquals(true, LogoDisplayed);
	}
	
	@Test
	public void Heading_validation() {
		String ExpectedHeading= login.FBHead_String_Validation();
		String ActualHeading="Facebook helps you connect and share with the people in your life.";
		Assert.assertEquals(ExpectedHeading, ActualHeading, "Heading is incorrect/not available");
	}
	@Test
	public void ForgottenPW_Click_Validate()
	{
		FPW=login.ForgottenPW_Click_Validation();
	}
	
	@AfterTest
	public void Teardown() 
	{
		driver.close();
	}
	

	
}
