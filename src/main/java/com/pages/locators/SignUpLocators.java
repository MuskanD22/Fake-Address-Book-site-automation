package com.pages.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/*
 * this class is used to get the locators for the signUp page 
 */

public class SignUpLocators {
	private WebDriver driver;
	private static @FindBy(xpath = "//*[@id=\"sign-in\"]") WebElement signInLink;
	private static @FindBy(xpath = "//*[@id=\"clearance\"]/div/div/form/div[4]/a") WebElement signUpLink;
	private static @FindBy(xpath = "//*[@id=\"clearance\"]/h2") WebElement signUpHeading;
	private static @FindBy(xpath = "//*[@id='user_email']") WebElement emailTextfield;
	private static @FindBy(xpath = "//*[@id='new_user']/div[3]/input") WebElement signUpButton;
	private static @FindBy(xpath = "//*[@id='navbar']/div[1]/a[3]") WebElement signOutButton;

	/*
	 * these methods are used to get the different webElements and return the
	 * webElement
	 */

	public SignUpLocators(WebDriver driver) {
		this.driver = driver;
	}

	public static WebElement getSignInElement() {
		return signInLink;
	}

	public static WebElement getSignUpElement() {
		return signUpLink;
	}

	public static WebElement getSignUpHeadingElement() {
		return signUpHeading;
	}

	public static WebElement getEmailTextfieldElement() {
		return emailTextfield;
	}

	public static WebElement getSignUpButtonElement() {
		return signUpButton;
	}

	public static WebElement getSignOutButtonElement() {
		return signOutButton;
	}
}
