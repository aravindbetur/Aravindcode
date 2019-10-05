package com.pageobject;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.baselib.Baseclass;

public class SignInPage extends Baseclass{
	public static WebDriver driver = null;


	public SignInPage(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver2, this);
	}



	@FindBy(id ="com.amazon.mShop.android.shopping:id/sign_in_button")
	private WebElement eleSignInButton;

	public WebElement getSignInButton() {
		return eleSignInButton;
	}
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]/android.widget.EditText")
	private WebElement eleMobileNumberTextBox;

	public WebElement getMobileNumberTextBox() {
		return eleMobileNumberTextBox;
	}
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View[7]/android.widget.Button")
	private WebElement eleContinueButton;

	public WebElement getContinueButton() {
		return eleContinueButton;
	}

	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[8]/android.view.View[2]/android.widget.EditText")
	private WebElement elePasswordTextbox;

	public WebElement getPasswordTextBox() {
		return elePasswordTextbox;
	}
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[8]/android.view.View[11]/android.widget.Button")
	private WebElement eleLoginButton;
	public WebElement getLoginButton() {
		return eleLoginButton;
	}

}
