package com.tests.addresslinks;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.pages.home.BaseClass;
import com.pages.locators.AddressLinksLocators;

public class EditLinkTests extends BaseClass {

	AddressLinksLocators page;

	@Test(dataProvider="editData")
	public void EditLink(String email,String password) throws InterruptedException {

		page = PageFactory.initElements(driver, AddressLinksLocators.class);
		logger = extent.createTest(
				this.getClass().getSimpleName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName());

		logger.log(Status.INFO, "Start Verifying Edit Link");

		login(email, password);
		logger.log(Status.PASS, "User logged in successfully");

		Thread.sleep(3000);

		page.getAddressLink();
		logger.log(Status.INFO, "User clicked on address Link");

		page.getEditLink();
		logger.log(Status.INFO, "user clicked Edit Link");

		Thread.sleep(4000);
		String editText = page.getEditPageHeading();
		Assert.assertEquals(editText, "Editing Address");
		logger.log(Status.PASS, "Verified edit page heading and the heading is " + editText);

		page.getDanceCheckbox();
		logger.log(Status.INFO, "user unchecked on the dance checkbox");

		page.getUpdateButtonClick();
		logger.log(Status.INFO, "user clicked on the update button Link");

		String successfulText = page.getSuccessfulText();
		Assert.assertEquals(successfulText, "Address was successfully updated.");
		logger.log(Status.PASS, "Verified successful updated addresses page text");

		String danceText = page.getDanceText();
		Assert.assertEquals(danceText, "No");
		logger.log(Status.PASS, "user successfully updated the dance checkbox");

	}
}
