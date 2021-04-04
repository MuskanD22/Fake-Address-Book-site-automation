package com.pages.address;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pages.locators.AddressPageLocators;

/*
 * This class is the page class for the address TestCases 
 */
public class AddressPage {

	private WebDriver driver;

	public AddressPage(WebDriver driver) {
		this.driver = driver;
	}

//  This method is use to get current URL and it will return the URL as string

	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

//  This method is use to get page title and it will return the page title as string

	public String getPageTitle() {
		return driver.getTitle();
	}

//  This method is use to get address link and it will click on the address Link 

	public void getAddressLink() {
		WebElement addressLink = AddressPageLocators.getAddressLinkElement();
		addressLink.click();
	}

//  This method is use to get address page heading and it will return the page heading as string

	public String getAddressHeadingText() {
		WebElement addressHeading = AddressPageLocators.getAddressHeadingElement();
		return addressHeading.getText();
	}

//  This method is use to get menu of the address page  and it will return list of  all menu item as WebElement 

	public List<WebElement> getAddressMenu() {
		List<WebElement> addressMenu = AddressPageLocators.getAddressMenuElement();
		return addressMenu;
	}

//  This method is use to get new address link and clicked on the newAddressLink
	public void getAddNewAddressLink() {
		WebElement newAddressLink = AddressPageLocators.getAddNewAddressLinkElement();
		newAddressLink.click();
	}

	/*
	 * This method is used to get firstName text from the address page and will
	 * return a boolean value indicating that it is displayed or not
	 */

	public boolean getFirstnameText() {
		WebElement firstnameElement = AddressPageLocators.getFirstnameElement();
		return firstnameElement.isDisplayed();
	}

// This method is used to get firstName textField and return the webElement for the same
	public WebElement getFirstnameTextField() {
		WebElement firstnameTextfield = AddressPageLocators.getFirstnameTextfieldElement();
		return firstnameTextfield;
	}

	/*
	 * This method is used to get lastName text from the address page and will
	 * return a boolean value indicating that it is displayed or not
	 */

	public boolean getLastnameText() {
		WebElement lastnameElement = AddressPageLocators.getLastnameElement();
		return lastnameElement.isDisplayed();
	}

	/*
	 * This method is used to get address text from the address page and will return
	 * a boolean value indicating that it is displayed or not
	 */

	public boolean getAddressText1() {
		WebElement addressText1Element = AddressPageLocators.getAddressText1Element();
		return addressText1Element.isDisplayed();
	}

	/*
	 * This method is used to get secondary address text from the address page and
	 * will return a boolean value indicating that it is displayed or not
	 */

	public boolean getAddressText2() {
		WebElement addressText2 = AddressPageLocators.getAddressText2Element();
		return addressText2.isDisplayed();
	}

	/*
	 * This method is used to get city text from the address page and will return a
	 * boolean value indicating that it is displayed or not
	 */

	public boolean getCityText() {
		WebElement cityText = AddressPageLocators.getCityTextElement();
		return cityText.isDisplayed();
	}

	/*
	 * This method is used to get state text from the address page and will return a
	 * boolean value indicating that it is displayed or not
	 */

	public boolean getStateText() {
		WebElement stateText = AddressPageLocators.getStateTextElement();
		return stateText.isDisplayed();
	}

	/*
	 * This method is used to get ZIP code text from the address page and will
	 * return a boolean value indicating that it is displayed or not
	 */

	public boolean getZipCodeText() {
		WebElement zipCodeText = AddressPageLocators.getZipCodeTextElement();
		return zipCodeText.isDisplayed();
	}

	/*
	 * This method is used to get country text from the address page and will return
	 * a boolean value indicating that it is displayed or not
	 */

	public boolean getCountryText() {
		WebElement countryText = AddressPageLocators.getCountryTextElement();
		return countryText.isDisplayed();
	}

	/*
	 * This method is used to get select the particular country from the address
	 * page and click on it
	 */

	public void getSelectCountryClick() {
		WebElement selectCountry = AddressPageLocators.getSelectCountryElement();
		selectCountry.click();
	}

	/*
	 * This method is used to get DOB text from the address page and will return a
	 * boolean value indicating that it is displayed or not
	 */

	public boolean getDobText() {
		WebElement DobText = AddressPageLocators.getDobTextElement();
		return DobText.isDisplayed();
	}

	/*
	 * This method is used to get color text from the address page and will return a
	 * boolean value indicating that it is displayed or not
	 */

	public boolean getColorText() {
		WebElement colorText = AddressPageLocators.getColorTextElement();
		return colorText.isDisplayed();
	}

	public void getColorClick() {
		WebElement color = AddressPageLocators.getColorElement();
		color.click();
	}

	/*
	 * This method is used to get age text from the address page and will return a
	 * boolean value indicating that it is displayed or not
	 */

	public boolean getAgeText() {
		WebElement ageText = AddressPageLocators.getAgeTextElement();
		return ageText.isDisplayed();
	}

	/*
	 * This method is used to get WebSite text from the address page and will return
	 * a boolean value indicating that it is displayed or not
	 */

	public boolean getWebsiteText() {
		WebElement websiteText = AddressPageLocators.getWebsiteTextElement();
		return websiteText.isDisplayed();
	}

	/*
	 * This method is used to get picture text from the address page and will return
	 * a boolean value indicating that it is displayed or not
	 */

	public boolean getPictureText() {
		WebElement pictureText = AddressPageLocators.getPictureTextElement();
		return pictureText.isDisplayed();
	}

	/*
	 * This method is used to get phone text from the address page and will return a
	 * boolean value indicating that it is displayed or not
	 */

	public boolean getPhoneText() {
		WebElement phoneText = AddressPageLocators.getPhoneTextElement();
		return phoneText.isDisplayed();
	}

	/*
	 * This method is used to get common interest text from the address page and
	 * will return a boolean value indicating that it is displayed or not
	 */

	public boolean getCommonInterestText() {
		WebElement commonInterestText = AddressPageLocators.getCommonInterestTextElement();
		return commonInterestText.isDisplayed();
	}

	/*
	 * This method is used to get note text from the address page and will return a
	 * boolean value indicating that it is displayed or not
	 */

	public boolean getNoteText() {
		WebElement noteText = AddressPageLocators.getNoteTextElement();
		return noteText.isDisplayed();
	}
}
