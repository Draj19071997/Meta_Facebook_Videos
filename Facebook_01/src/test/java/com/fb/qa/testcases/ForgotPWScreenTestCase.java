package com.fb.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.fb.qa.base.TestBase;
import com.fb.qa.pages.ForgottenPassword;

public class ForgotPWScreenTestCase extends TestBase
{
	
	ForgottenPassword Frgpw;
	public ForgotPWScreenTestCase() throws Exception 
	{
		super();
	}

	@BeforeTest
	public void setup() throws Exception
	{
		initalization();
		Frgpw=new ForgottenPassword();
	}
	
	@Test
	public void FacebookLogo_Validate() {
		Boolean flag= Frgpw.FacebookLogo();
		Assert.assertTrue(flag);
	}
	
	@AfterTest
	public void TearDown() 
	{
		driver.close();	
	}
	
}
