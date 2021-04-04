package com.pages.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/*
 * this class is used to get the locators for the signIn page 
 */

public class SignInLocators {
	private WebDriver driver;
	private static @FindBy(xpath = "//*[@id=\"sign-in\"]") WebElement signInLink;
	private static @FindBy(xpath = "//*[@id=\"clearance\"]/div/div/form/div[4]/a") WebElement signUpLink;
	private static @FindBy(xpath = "//*[@id=\"clearance\"]/h2") WebElement signInHeading;
	private static @FindBy(xpath = "//*[@id=\"session_email\"]") WebElement signInEmailTextField;
	private static @FindBy(xpath = "//*[@id=\"navbar\"]/div[2]/span") WebElement verifyLogin;
	private static @FindBy(xpath = "//*[@id=\"navbar\"]/div[1]/a[3]") WebElement signout;
	private static @FindBy(xpath = "/html/body/div/div[1]") WebElement invalidLogin;

	/*
	 * these methods are used to get the different webElements and return the
	 * webElement
	 */

	public  SignInLocators(WebDriver driver) {
		this.driver=driver;
	}
	
	public static WebElement getSignInElement() {
		return signInLink;
	}
	
	public static WebElement getSignUpElement() {
		return signUpLink;
	}
	
	public static WebElement getSignInHeadingElement() {
		return signInHeading;
	}
	public static WebElement getEmailTextfieldElement () {
		return signInEmailTextField;
	}
	public static WebElement getVerifyLoginElement() {
		return verifyLogin;
	}
	public static WebElement getSignOutElement() {
		return signout;
	}
	public static WebElement getInvalidLoginElement() {
		return invalidLogin;
	}
}
