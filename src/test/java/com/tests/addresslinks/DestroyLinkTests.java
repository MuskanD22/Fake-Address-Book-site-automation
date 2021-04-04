package com.tests.addresslinks;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.pages.home.BaseClass;
import com.pages.locators.AddressLinksLocators;

public class DestroyLinkTests extends BaseClass {
	AddressLinksLocators page;

	@Test
	public void destroyLink() throws InterruptedException {

		page = PageFactory.initElements(driver, AddressLinksLocators.class);
		logger = extent.createTest(
				this.getClass().getSimpleName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName());

		logger.log(Status.INFO, "Start Verifying destroy Link");

		login("amrita1@gmail.com","amrita12");
		Assert.assertEquals(page.getCurrentUrl(), "http://a.testaddressbook.com/");
		logger.log(Status.PASS, "Login Successfully");

		Thread.sleep(3000);

		page.getAddressLink();
		logger.log(Status.INFO, "User clicked on address Link");
		
		page.getDestroyLink();
		logger.log(Status.INFO, "User clicked on destroy Link");
		
		driver.switchTo().alert().accept();

		logger.log(Status.INFO, "Clicked on the alert");
		
		Assert.assertEquals(page.getSuccessfulDestroyText(), "Address was successfully destroyed.");
		logger.log(Status.PASS, "data is destroy successfully");

		Assert.assertTrue(driver.getCurrentUrl().contains("addresses"));
		logger.log(Status.PASS, "Verified destroy link");

	}
}
