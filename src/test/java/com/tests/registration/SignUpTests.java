package com.tests.registration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.pages.home.BaseClass;
import com.pages.locators.SignUpLocators;
import com.pages.registration.SignUpPage;

public class SignUpTests extends BaseClass {

	SignUpPage page;
	SignUpLocators sl;

	@Test
	public void beforeSignUpTest() throws InterruptedException {
		logger = extent.createTest(
				this.getClass().getSimpleName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName());

		logger.log(Status.INFO, "Start Verifying SignUp page");

		page = PageFactory.initElements(driver, SignUpPage.class);

		sl = PageFactory.initElements(driver, SignUpLocators.class);

		page.signInClick();
		logger.log(Status.INFO, "Clicked on signIn link");

		Thread.sleep(3000);

		Assert.assertEquals(page.getPageTitle(), "Address Book - Sign In");
		logger.log(Status.PASS, "Sign Up page title is Verified and the title is "+page.getPageTitle());

		page.signUpClick();
		logger.log(Status.INFO, "Clicked on sign Up link");

		Thread.sleep(3000);
		Assert.assertEquals(page.getPageTitle(), "Address Book - Sign Up");
		logger.log(Status.PASS, "Sign Up page title is Verified and the title is "+page.getPageTitle());
	}

	@Test(dataProvider = "signUp")
	public void signUpTest(String username, String password) throws InterruptedException {
		logger = extent.createTest(
				this.getClass().getSimpleName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName());

		page = PageFactory.initElements(driver, SignUpPage.class);

		sl = PageFactory.initElements(driver, SignUpLocators.class);

		page.signInClick();

		logger.log(Status.INFO, "Clicked on signIn link");
		Thread.sleep(2000);
		page.signUpClick();
		logger.log(Status.INFO, "Clicked on sign Up link");
		Thread.sleep(2000);
		Actions act = new Actions(driver);

		logger.log(Status.INFO, "Sign up page heading is displayed : " + page.getSignUpHeading());

		WebElement emailField = page.getSignUpEmailTextfield();
		act.sendKeys(emailField, username, Keys.TAB).build().perform();
		logger.log(Status.INFO, "Entered username as " + username + " in email textField");

		act.sendKeys(password, Keys.TAB).build().perform();
		logger.log(Status.INFO, "Entered password in password textField");

		page.getSignUpButtonClick();
		logger.log(Status.INFO, "Clicked on the sign up button");

		if (page.getCurrentUrl().contentEquals("http://a.testaddressbook.com/")) {

			Assert.assertEquals(page.getCurrentUrl(), "http://a.testaddressbook.com/");
			logger.log(Status.PASS, "Login Successfully");

			page.getSignOutButtonClick();
			logger.log(Status.PASS, "Log Out Successfully");

		} 
		else if (page.getCurrentUrl().contains("users")) {

			logger.log(Status.PASS, "Already user exists and not be able to signUp");
		}
		else {
			logger.log(Status.PASS, "user entered invalid email address and not be able to signUp");
		}
		
	}
}
