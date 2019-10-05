package com.testscript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.baselib.Baseclass;
import com.baselib.genericclass;
import com.pageobject.SignInPage;

public class SignIn extends Baseclass {
	String sData[]=null;
	@Test
	public void SigninPage () throws Exception
	{
		sData=genericclass.readdata("Data","SignIn_001");
	SignInPage sp=new SignInPage(driver);
    sp.getSignInButton().click();
    //Thread.sleep(5000);
    sp.getMobileNumberTextBox().sendKeys(sData[1]);
    Thread.sleep(2000);
	sp.getContinueButton().click();
	//Thread.sleep(5000);
	sp.getPasswordTextBox().sendKeys(sData[2]);
	//Thread.sleep(5000);
	sp.getLoginButton().click();
	Thread.sleep(3000);
	
	
	
	
	
	}
	
	

}
