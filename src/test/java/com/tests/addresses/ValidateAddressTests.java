package com.tests.addresses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.pages.address.ValidateAddressPage;
import com.pages.elementHandler.DateHandler;
import com.pages.home.BaseClass;
import com.pages.locators.ValidateAddressLocators;

public class ValidateAddressTests extends BaseClass {
	ValidateAddressPage page;
	ValidateAddressLocators va;

	@Test( dataProvider = "getValidateData")
	public void VerifyAddressForms(String email, String password, String firstname, String lastname, String address1,
			String address2, String city, String state, String zipCode, String birthdate, String age, String website,
			String phone, String note) throws InterruptedException {
		page = PageFactory.initElements(driver, ValidateAddressPage.class);
		va = PageFactory.initElements(driver, ValidateAddressLocators.class);

		logger = extent.createTest(
				this.getClass().getSimpleName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName());

		logger.log(Status.INFO, "Start Verifying filled data in Address form ");

		login(email, password);
		
		logger.log(Status.PASS, "Login successfully");
			
		Thread.sleep(3000);
		page.getAddressLink();
		logger.log(Status.INFO, "clicked on the address link");

		page.getShowLink();
		logger.log(Status.INFO, "user clicked on the show Link");

		WebElement firstName = ValidateAddressLocators.getFirstNameElement();
		logger.log(Status.INFO, "street name is displayed: " + firstName.isDisplayed());
		Assert.assertEquals(firstName.getText(), firstname);
		logger.log(Status.PASS, "firstname is " + firstname + " same as sent by user");

		WebElement lastName = ValidateAddressLocators.getLastNameElement();
		logger.log(Status.INFO, "street name is displayed: " + lastName.isDisplayed());
		Assert.assertEquals(lastName.getText(), lastname);
		logger.log(Status.PASS, "lastname is " + lastname + " same as sent by user");

		WebElement streetAddress = ValidateAddressLocators.getStreetAddressElement();
		logger.log(Status.INFO, "street name is displayed: " + streetAddress.isDisplayed());
		Assert.assertEquals(streetAddress.getText(), address1);
		logger.log(Status.PASS, "address1 is " + address1 + "  same as sent by user");

		WebElement secondaryAddress = ValidateAddressLocators.getSecondaryAddressElement();
		logger.log(Status.INFO, "secondary address is displayed: " + secondaryAddress.isDisplayed());
		Assert.assertEquals(secondaryAddress.getText(), address2);
		logger.log(Status.PASS, "address2 is " + address2 + " same as sent by user");

		WebElement cities = ValidateAddressLocators.getCitiesElement();
		logger.log(Status.INFO, "city name is displayed: " + cities.isDisplayed());
		Assert.assertEquals(cities.getText(), city);
		logger.log(Status.PASS, "city is " + city + " same as sent by user");

		WebElement stateResult = ValidateAddressLocators.getStateResultElement();
		logger.log(Status.INFO, "state name is displayed: " + stateResult.isDisplayed());
		Assert.assertEquals(stateResult.getText(), state);
		logger.log(Status.PASS, "state is " + state + " same as sent by user");

		WebElement zipcode = ValidateAddressLocators.getZipcodeElement();
		logger.log(Status.INFO, "zip code is displayed: " + zipcode.isDisplayed());
		Assert.assertEquals(zipcode.getText(), zipCode);
		logger.log(Status.PASS, "zipcode is " + zipCode + " same as sent by user");

		WebElement country = ValidateAddressLocators.getCountryElement();
		logger.log(Status.INFO, "country name is displayed: " + country.isDisplayed());
		Assert.assertEquals(country.getText(), "canada");
		logger.log(Status.PASS, "country is " + country.getText() + " same as sent by user");

		WebElement birthday = ValidateAddressLocators.getBirthdayElement();
		logger.log(Status.INFO, "birth date is displayed: " + birthday.isDisplayed());

		String date = DateHandler.convertToDate(birthdate);
		Assert.assertEquals(birthday.getText(), date);
		logger.log(Status.PASS, "birthdate is " + date + " same as sent by user");

		WebElement Age = ValidateAddressLocators.getAgeElement();
		logger.log(Status.INFO, "age is displayed: " + Age.isDisplayed());
		Assert.assertEquals(Age.getText(), age);
		logger.log(Status.PASS, "age is " + age + " same as sent by user");

		WebElement websites = ValidateAddressLocators.getWebsitesElement();
		logger.log(Status.INFO, "website name is displayed: " + websites.isDisplayed());
		Assert.assertEquals(websites.getText(), website);
		logger.log(Status.PASS, "website is " + website + " same as sent by user");

		WebElement phoneNo = ValidateAddressLocators.getPhoneNoElement();
		logger.log(Status.INFO, "phone number is displayed: " + phoneNo.isDisplayed());
		Assert.assertEquals(phoneNo.getText(), phone);
		logger.log(Status.PASS, "phone number is " + phone + " same as sent by user");

		WebElement notes = ValidateAddressLocators.getNotesElement();
		logger.log(Status.INFO, "note is displayed: " + notes.isDisplayed());
		Assert.assertEquals(notes.getText(), note);
		logger.log(Status.PASS, "note is " + note + " same as sent by user");

		logger.log(Status.PASS, "All the data filled by user is verified");

	}
}
