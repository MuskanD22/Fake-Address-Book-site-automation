package com.pages.address;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pages.locators.ValidateAddressLocators;

/*
 * This class is used for the ValidateAddress testCases 
 */

public class ValidateAddressPage {
	private WebDriver driver;

	public ValidateAddressPage(WebDriver driver) {
		this.driver = driver;
	}

	/*
	 * This method is used to get text from the address page after successful submission of new address and
	 * will return a boolean value indicating that it is displayed or not
	 */

	public boolean getSuccessfulText() {
		WebElement successfulText = ValidateAddressLocators.getSuccessfulTextElement();
		return successfulText.isDisplayed();
	}

//  This method is use to get addressLink and it will click on the address Link 

	public void getAddressLink() {
		WebElement addressLink = ValidateAddressLocators.getAddressLinkElement();
		addressLink.click();
	}

//  This method is use to get showLink and it will click on the showLink 

	public void getShowLink() {
		WebElement showLink = ValidateAddressLocators.getShowLinkElement();
		showLink.click();
	}
}
