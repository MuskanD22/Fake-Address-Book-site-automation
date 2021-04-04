package com.pages.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/*
 * this class is used to get locators for the Address Link testCases
 */
public class AddressLinksLocators {

	private WebDriver driver;

	private static @FindBy(xpath = "//*[@id=\"navbar\"]/div[1]/a[2]") WebElement addressLink;
	private static @FindBy(xpath = "/html/body/div/table/tbody/tr/td[6]/a") WebElement editLink;
	private static @FindBy(xpath = "/html/body/div/h2") WebElement editPageHeading;
	private static @FindBy(xpath = "//*[@id=\"address_interest_dance\"]") WebElement danceCheckbox;
	private static @FindBy(xpath = "//*[@class='btn btn-primary']") WebElement updateButton;
	private static @FindBy(xpath = "/html/body/div/div[1]") WebElement successfulText;
	private static @FindBy(xpath = "/html/body/div/p[15]/span[2]") WebElement danceText;
	private static @FindBy(xpath = "/html/body/div/table/tbody/tr/td[7]/a") WebElement destroyLink;
	private static @FindBy(xpath = "/html/body/div/div") WebElement successfulDestroyText;

	public AddressLinksLocators(WebDriver driver) {
		this.driver = driver;
	}

	/*
	 * this method is used to get the addressLink from the address Page and then
	 * clicked on the addressLink
	 */

	public void getAddressLink() {
		addressLink.click();
	}

	/*
	 * this method is used to get the editLink from the address Page and then
	 * clicked on the editLink
	 */

	public void getEditLink() {
		editLink.click();
	}

	/*
	 * this method is used to get the heading from the edit Page and then return the
	 * heading as string.
	 */

	public String getEditPageHeading() {
		return editPageHeading.getText();
	}

	/*
	 * this method is used to get the checkBox from the edit Page and then clicked
	 * on the dance checkBox
	 */

	public void getDanceCheckbox() {
		danceCheckbox.click();
	}

	/*
	 * this method is used to get the update button from the edit Page and then
	 * clicked on the updateButton
	 */

	public void getUpdateButtonClick() {
		updateButton.click();
	}

	/*
	 * this method is used to get the text from the Page and it return the text as
	 * string
	 */

	public String getSuccessfulText() {

		return successfulText.getText();
	}
	/*
	 * this method is used to get the dance text from the Page and it return the
	 * text as string
	 * 
	 */

	public String getDanceText() {
		return danceText.getText();
	}

	/*
	 * this method is used to get the destroyLink from the Page and then clicked on
	 * the destroyLink
	 */

	public void getDestroyLink() {
		destroyLink.click();
	}

	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	public String getSuccessfulDestroyText() {

		return successfulDestroyText.getText();
	}

}
