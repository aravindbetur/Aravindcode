package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baselib.Baseclass;

public class HomePage extends Baseclass {
	public static WebDriver driver = null;


	public HomePage(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver2, this);
	}
	
	@FindBy(id ="com.amazon.mShop.android.shopping:id/rs_search_src_text")
	private WebElement eleSearchTextBox;

	public WebElement getSearchTextBox() {
		return eleSearchTextBox;
	}
	
	
}
