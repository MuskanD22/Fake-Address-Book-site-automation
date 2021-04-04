package com.tests.addresses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.pages.address.AddressPage;
import com.pages.elementHandler.ColorHandlePage;
import com.pages.home.BaseClass;
import com.pages.locators.AddressPageLocators;

public class AddressTests extends BaseClass {
	AddressPage page;

	@Test(dataProvider = "data")
	public void addressFormsTest(String email, String password, String firstname, String lastname, String address1,
			String address2, String city, String state, String zipCode, String birthdate, String age, String website,
			String phone, String note) throws InterruptedException {

		page = PageFactory.initElements(driver, AddressPage.class);
		AddressPageLocators page1 = PageFactory.initElements(driver, AddressPageLocators.class);

		logger = extent.createTest(
				this.getClass().getSimpleName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName());

		logger.log(Status.INFO, "Start Verifying Address form page");

		Actions act = new Actions(driver);

		login(email, password);

		logger.log(Status.PASS, "Login successfully");

		Thread.sleep(3000);
		page.getAddressLink();
		logger.log(Status.INFO, "clicked on the address link");

		String addressHeading = page.getAddressHeadingText();
		Assert.assertEquals(addressHeading, "Addresses");
		logger.log(Status.PASS, "Address page heading is verified");

		List<WebElement> menu = page.getAddressMenu();
		for (WebElement ele : menu) {
			String tableHeading = ele.getAttribute("innerHTML");
			logger.log(Status.INFO, "menu item is " + tableHeading);
		}

		page.getAddNewAddressLink();
		logger.log(Status.INFO, "Clicked on the new address link");

		boolean firstnameText = page.getFirstnameText();
		logger.log(Status.INFO, "First name text is displayed: " + firstnameText);
		WebElement firstnameTextfield = page.getFirstnameTextField();
		firstnameTextfield.sendKeys(firstname);
		logger.log(Status.INFO, "Entered " + firstname + " as firstname ");

		boolean lastnameText = page.getLastnameText();
		logger.log(Status.INFO, "Last name text is displayed: " + lastnameText);
		act.sendKeys(Keys.TAB, lastname).build().perform();
		logger.log(Status.INFO, "Entered " + lastname + " as lastname ");

		boolean addressText1 = page.getAddressText1();
		logger.log(Status.INFO, "Address1 text is displayed: " + addressText1);
		act.sendKeys(Keys.TAB, address1).build().perform();
		logger.log(Status.INFO, "Entered " + address1 + " as address1 ");

		boolean addressText2 = page.getAddressText2();
		logger.log(Status.INFO, "Address2 text is displayed: " + addressText2);
		act.sendKeys(Keys.TAB, address2).build().perform();
		logger.log(Status.INFO, "Entered " + address2 + " as address2 ");

		boolean cityText = page.getCityText();
		logger.log(Status.INFO, "City text is displayed: " + cityText);
		act.sendKeys(Keys.TAB, city).build().perform();
		logger.log(Status.INFO, "Entered " + city + " as city");

		boolean stateText = page.getStateText();
		logger.log(Status.INFO, "State text is displayed: " + stateText);

		String choosestate = pro.getState();
		Select state1 = new Select(driver.findElement(By.xpath(choosestate)));
		state1.selectByValue(state);
		logger.log(Status.INFO, "Entered " + state + " as state ");

		boolean zipCodeText = page.getZipCodeText();
		logger.log(Status.INFO, "Zip code text is displayed: " + zipCodeText);

		act.sendKeys(Keys.TAB, zipCode, Keys.TAB).build().perform();
		logger.log(Status.INFO, "Entered " + zipCode + " as zipCode ");

		boolean countryText = page.getCountryText();
		logger.log(Status.INFO, "Country text is displayed: " + countryText);

		page.getSelectCountryClick();

		boolean dobText = page.getDobText();
		logger.log(Status.INFO, "Birthday text is displayed: " + dobText);
		act.sendKeys(Keys.TAB).sendKeys(birthdate, Keys.TAB).build().perform();

		boolean colorText = page.getColorText();
		logger.log(Status.INFO, "color text is displayed: " + colorText);

		page.getColorClick();
		logger.log(Status.INFO, "user clicked on the color selecting the color");

		act.sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, "34", Keys.TAB, "34", Keys.TAB, "234", Keys.ENTER).build().perform();
		logger.log(Status.INFO, "user enter 34, 34, 234 as rgb value as color values");

		String hexcode = ColorHandlePage.getHexCode(34, 34, 234);

		boolean ageText = page.getAgeText();
		logger.log(Status.INFO, "Age text is displayed: " + ageText);

		act.sendKeys(Keys.TAB, age).build().perform();
		logger.log(Status.INFO, "Entered " + age + " as age ");

		boolean websiteText = page.getWebsiteText();
		logger.log(Status.INFO, "Website text is displayed: " + websiteText);

		act.sendKeys(Keys.TAB, website).build().perform();
		logger.log(Status.INFO, "Entered " + website + " as website ");

		boolean pictureText = page.getPictureText();
		logger.log(Status.INFO, "Picture text is displayed: " + pictureText);
		act.sendKeys(Keys.TAB).build().perform();

		boolean phoneText = page.getPhoneText();
		logger.log(Status.INFO, "phone text is displayed: " + phoneText);

		act.sendKeys(Keys.TAB, phone).build().perform();
		logger.log(Status.INFO, "Entered " + phone + " as phone ");

		boolean commonInterestText = page.getCommonInterestText();
		logger.log(Status.INFO, "Common interest text is displayed: " + commonInterestText);

		String commonInterestCheckbox = pro.getCommonInterestCheckbox();
		List<WebElement> options = driver.findElements(By.xpath(commonInterestCheckbox));

		for (WebElement ele : options) {
			ele.click();
		}

		boolean noteText = page.getNoteText();
		logger.log(Status.INFO, "Note text is displayed: " + noteText);

		act.sendKeys(Keys.TAB, note, Keys.TAB).build().perform();
		logger.log(Status.INFO, "Entered " + note + " as note ");

		act.sendKeys(Keys.TAB.ENTER).build().perform();

		if (page.getCurrentUrl().contentEquals("http://a.testaddressbook.com/addresses/new")) {
			logger.log(Status.WARNING, "user entered some wrong details ");

		} else if (page.getCurrentUrl().contentEquals("http://a.testaddressbook.com/addresses")) {
			WebElement errorMessage = AddressPageLocators.getErrorMessageElement();
			logger.log(Status.INFO, "error message is displayed: " + errorMessage.isDisplayed());
			logger.log(Status.INFO, errorMessage.getText());
			logger.log(Status.PASS, "user missed some infomation so not be able to save the details");

		} else {
			logger.log(Status.PASS, "user entered details successfully");
			WebElement cc = AddressPageLocators.getColorVerificationElement();
			Assert.assertTrue(cc.getCssValue("background").contains("34, 34, 234"));
			logger.log(Status.PASS, "color rgb value is same as sent by user");
		}

	}
}
