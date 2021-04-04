package com.pages.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/*
 * this class is used to get the locators for the homePage 
 */

public class HomePageLocator {
	private WebDriver driver;

	private static @FindBy(xpath = "/html/body/div/div/h1") WebElement welcomeHeading;
	private static @FindBy(xpath = "/html/body/div/div/h4") WebElement webAppHeading;

	/*
	 * these methods are used to get the different webElements and return the
	 * webElement
	 */

	public HomePageLocator(WebDriver driver) {
		this.driver = driver;
	}

	public static WebElement welcomeElement() {
		return welcomeHeading;
	}

	public static WebElement getWebAppElement() {
		return webAppHeading;
	}

}
