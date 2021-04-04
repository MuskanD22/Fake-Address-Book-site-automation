package com.pages.registration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pages.locators.SignInLocators;

/*
 * this class is used for the SignIn testCases 
 */

public class SignInPage {

	private WebDriver driver;

	public SignInPage(WebDriver driver) {
		this.driver = driver;
	}

	/*
	 * this method is used to get page title and it will return the page title as
	 * string
	 */

	public String getPageTitle() {
		return driver.getTitle();
	}

	// this method is used to get URL and it will return the URL as string
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	// this method is used to click on the signIn link
	public void signInClick() {
		WebElement signInLink = SignInLocators.getSignInElement();
		signInLink.click();
	}

	/*
	 * this method is used to get the signIn page heading and it will return the
	 * heading as string
	 */

	public boolean getSignInHeading() {
		WebElement signInHeading = SignInLocators.getSignInHeadingElement();
		return signInHeading.isDisplayed();
	}

	/*
	 * this method is used to get emailTextfield and it will return the webElement
	 * for the same
	 */

	public WebElement getEmailTextField() {
		WebElement emailTextField = SignInLocators.getEmailTextfieldElement();
		return emailTextField;
	}

	/*
	 * this method is used to get verifyLogin text and it will return the same as
	 * string
	 */

	public String getVerifyLoginText() {
		return SignInLocators.getVerifyLoginElement().getText();
	}

	// this method is used to click the signOut button
	public void getSignOutLink() {
		SignInLocators.getSignOutElement().click();
	}

	public boolean getInvalidLogin() {
		return SignInLocators.getInvalidLoginElement().isDisplayed();
	}

	public String getInvalidLoginText() {
		return SignInLocators.getInvalidLoginElement().getText();
	}
}
