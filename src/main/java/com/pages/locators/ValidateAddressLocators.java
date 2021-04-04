package com.pages.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/*
 * this class is used to get the locators for the ValidateAddressPage 
 */

public class ValidateAddressLocators {

	private static @FindBy(xpath = "//*[@id=\"navbar\"]/div[1]/a[2]") WebElement addressLink;
	private static @FindBy(xpath = "/html/body/div/div[1]") WebElement successfulCreatedText;
	private static @FindBy(xpath = "/html/body/div/table/tbody/tr[1]/td[5]/a") WebElement showLink;
	private static @FindBy(xpath = "/html/body/div/p[1]/span[2]") WebElement firstName;
	private static @FindBy(xpath = "/html/body/div/p[2]/span[2]") WebElement lastName;
	private static @FindBy(xpath = "/html/body/div/p[3]/span[2]") WebElement streetAddress;
	private static @FindBy(xpath = "/html/body/div/p[4]/span[2]") WebElement secondaryAddress;
	private static @FindBy(xpath = "/html/body/div/p[5]/span[2]") WebElement cities;
	private static @FindBy(xpath = "/html/body/div/p[6]/span[2]") WebElement stateResult;
	private static @FindBy(xpath = "/html/body/div/p[7]/span[2]") WebElement zipcode;
	private static @FindBy(xpath = "/html/body/div/p[8]/span[2]") WebElement country;
	private static @FindBy(xpath = "/html/body/div/p[9]/span[2]") WebElement birthday;
	private static @FindBy(xpath = "/html/body/div/p[11]/span[2]") WebElement Age;
	private static @FindBy(xpath = "/html/body/div/p[12]/span[2]") WebElement websites;
	private static @FindBy(xpath = "/html/body/div/p[13]/span[2]") WebElement phoneNo;
	private static @FindBy(xpath = "/html/body/div/p[17]/span[2]") WebElement notes;

	private WebDriver driver;

	/*
	 * these methods are used to get the different webElements and return the
	 * webElement
	 */

	public ValidateAddressLocators(WebDriver driver) {
		this.driver = driver;
	}

	public static WebElement getAddressLinkElement() {
		return addressLink;
	}

	public static WebElement getSuccessfulTextElement() {
		return successfulCreatedText;
	}

	public static WebElement getShowLinkElement() {
		return showLink;
	}

	public static WebElement getFirstNameElement() {
		return firstName;
	}

	public static WebElement getLastNameElement() {
		return lastName;
	}

	public static WebElement getStreetAddressElement() {
		return streetAddress;
	}

	public static WebElement getSecondaryAddressElement() {
		return secondaryAddress;
	}

	public static WebElement getCitiesElement() {
		return cities;
	}

	public static WebElement getStateResultElement() {
		return stateResult;
	}

	public static WebElement getZipcodeElement() {
		return zipcode;
	}

	public static WebElement getCountryElement() {
		return country;
	}

	public static WebElement getBirthdayElement() {
		return birthday;
	}

	public static WebElement getAgeElement() {
		return Age;
	}

	public static WebElement getWebsitesElement() {
		return websites;
	}

	public static WebElement getPhoneNoElement() {
		return phoneNo;
	}

	public static WebElement getNotesElement() {
		return notes;
	}

}
