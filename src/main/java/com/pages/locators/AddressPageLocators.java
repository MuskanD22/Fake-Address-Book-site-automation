package com.pages.locators;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/*
 * This is class is used to get the locators for AddresPage 
 */

public class AddressPageLocators {

	private WebDriver driver;

	private static @FindBy(xpath = "//*[@id=\"navbar\"]/div[1]/a[2]") WebElement addressLink;
	private static @FindBy(xpath = "/html/body/div/h2") WebElement addressHeading;
	private static @FindBy(xpath = "/html/body/div/table/thead/tr/th") List<WebElement> addressMenu;

	private static @FindBy(xpath = "/html/body/div/a") WebElement newAddressLink;

	private static @FindBy(xpath = "//*[@id='new_address']/div[1]/label") WebElement firstnameText;
	private static @FindBy(xpath = "//*[@id='address_first_name']") WebElement firstnameTextfield;
	private static @FindBy(xpath = "//*[@id=\"new_address\"]/div[2]/label") WebElement lastnameText;

	private static @FindBy(xpath = "//*[@id=\"new_address\"]/div[3]/label") WebElement addressText1;
	private static @FindBy(xpath = "//*[@id=\"new_address\"]/div[4]/label") WebElement addressText2;
	private static @FindBy(xpath = "//*[@id=\"new_address\"]/div[5]/label") WebElement cityText;

	private static @FindBy(xpath = "//*[@id=\"new_address\"]/div[6]/label") WebElement stateText;
	private static @FindBy(xpath = "//*[@id=\"new_address\"]/div[8]/span") WebElement countryText;
	private static @FindBy(xpath = "//*[@id=\"new_address\"]/div[7]/label") WebElement zipCodeText;
	private static @FindBy(xpath = "//*[@id=\"new_address\"]/div[8]/label[2]") WebElement selectCountry;

	private static @FindBy(xpath = "//*[@id=\"new_address\"]/div[9]/label") WebElement dobText;
	private static @FindBy(xpath = "//*[@id=\"new_address\"]/div[10]/label") WebElement colorText;
	private static @FindBy(xpath = "//*[@id=\"address_color\"]") WebElement color;

	private static @FindBy(xpath = "//*[@id=\"new_address\"]/div[11]/label") WebElement ageText;
	private static @FindBy(xpath = "//*[@id=\"new_address\"]/div[12]/label") WebElement websiteText;
	private static @FindBy(xpath = "//*[@id=\"new_address\"]/div[13]/label") WebElement pictureText;

	private static @FindBy(xpath = "//*[@id=\"new_address\"]/div[14]/label") WebElement phoneText;
	private static @FindBy(xpath = "//*[@id=\"new_address\"]/div[15]/label") WebElement commonInterestText;
	private static @FindBy(xpath = "//*[@id=\"new_address\"]/div[16]/label") WebElement noteText;
	private static @FindBy(xpath = "/html/body/div/p[10]/span[2]") WebElement colorVerification;
	private static @FindBy(xpath = "//*[@id=\"error_explanation\"]") WebElement errorMessage;
	public AddressPageLocators(WebDriver driver) {
		this.driver = driver;
	}

	/*
	 * These methods are used to get the different WebElement and it will return the
	 * WebElement
	 *
	 */

	public static WebElement getAddressLinkElement() {
		return addressLink;
	}

	public static WebElement getAddressHeadingElement() {
		return addressHeading;
	}

	// This method is used to get the menu webElement and it will return the
	// list of webElement

	public static List<WebElement> getAddressMenuElement() {
		return addressMenu;
	}

	public static WebElement getAddNewAddressLinkElement() {
		return newAddressLink;
	}

	public static WebElement getFirstnameElement() {
		return firstnameText;
	}

	public static WebElement getFirstnameTextfieldElement() {
		return firstnameTextfield;
	}

	public static WebElement getLastnameElement() {
		return lastnameText;
	}

	public static WebElement getAddressText1Element() {
		return addressText1;
	}

	public static WebElement getAddressText2Element() {
		return addressText2;
	}

	public static WebElement getStateTextElement() {
		return stateText;
	}

	public static WebElement getCityTextElement() {
		return cityText;
	}

	public static WebElement getZipCodeTextElement() {
		return zipCodeText;
	}

	public static WebElement getCountryTextElement() {
		return countryText;
	}

	public static WebElement getSelectCountryElement() {
		return selectCountry;
	}

	public static WebElement getDobTextElement() {
		return dobText;
	}

	public static WebElement getColorTextElement() {
		return colorText;
	}

	public static WebElement getAgeTextElement() {
		return ageText;
	}

	public static WebElement getWebsiteTextElement() {
		return websiteText;
	}

	public static WebElement getPictureTextElement() {
		return pictureText;
	}

	public static WebElement getPhoneTextElement() {
		return phoneText;
	}

	public static WebElement getCommonInterestTextElement() {
		return commonInterestText;
	}

	public static WebElement getNoteTextElement() {
		return noteText;
	}

	public static WebElement getColorVerificationElement() {
		return colorVerification;
	}

	public static WebElement getColorElement() {

		return color;
	}
	public static WebElement getErrorMessageElement() {

		return errorMessage;
	}
}
