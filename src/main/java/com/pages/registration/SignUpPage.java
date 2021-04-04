package com.pages.registration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pages.locators.SignUpLocators;

/*
 * this class is used for the SignUp testCases 
 */

public class SignUpPage {
	private WebDriver driver;

	public SignUpPage(WebDriver driver) {
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
		WebElement signInLink = SignUpLocators.getSignInElement();
		signInLink.click();
	}

	// this method is used to click on the signUp link

	public void signUpClick() {
		WebElement signUpLink = SignUpLocators.getSignUpElement();
		signUpLink.click();
	}

	/*
	 * this method is used to get the signUp page heading and it will return the
	 * heading as string
	 */

	public boolean getSignUpHeading() {
		WebElement signUpHeading = SignUpLocators.getSignUpHeadingElement();
		return signUpHeading.isDisplayed();
	}

	/*
	 * this method is used to get emailTextfield and it will return the webElement
	 * for the same
	 */

	public WebElement getSignUpEmailTextfield() {
		WebElement emailTextfield = SignUpLocators.getEmailTextfieldElement();
		return emailTextfield;
	}

	// this method is used to click the signUp button

	public void getSignUpButtonClick() {
		WebElement signUpButton = SignUpLocators.getSignUpButtonElement();
		signUpButton.click();
	}

	// this method is used to click the signOut button
	
	public void getSignOutButtonClick() {
		WebElement signOutButton = SignUpLocators.getSignOutButtonElement();
		signOutButton.click();
	}

}
