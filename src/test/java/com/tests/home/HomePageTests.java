package com.tests.home;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.pages.home.BaseClass;
import com.pages.home.HomePage;
import com.pages.locators.HomePageLocator;

public class HomePageTests extends BaseClass {

	HomePageLocator page;
	HomePage hp;

	@Test
	public void homeTest() {
		page = PageFactory.initElements(driver, HomePageLocator.class);
		hp = PageFactory.initElements(driver, HomePage.class);

		logger = extent.createTest(
				this.getClass().getSimpleName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName());
		logger.log(Status.INFO, "Start verifying home page");

		Assert.assertEquals(hp.getPageTitle(), "Address Book");
		logger.log(Status.PASS, "Verified Title and title of the page is " + hp.getPageTitle());

		String actualHeading = hp.getWelcomeHeading();
		Assert.assertEquals(actualHeading, "Welcome to Address Book");
		logger.log(Status.PASS, "Verified Heading and heading is " + actualHeading);

		String actualWebAppHeading = hp.getWebApplicationHeading();
		Assert.assertEquals(actualWebAppHeading, "A simple web app for showing off your testing");
		logger.log(Status.PASS, "Verified web heading and web heading is " + actualWebAppHeading);

		logger.log(Status.PASS, "Verified Home page");

	}
}
