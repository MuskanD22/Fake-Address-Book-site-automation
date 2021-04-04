package com.tests.registration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.pages.home.BaseClass;
import com.pages.locators.SignInLocators;
import com.pages.registration.SignInPage;

public class SignInTests extends BaseClass {

	SignInPage page;
	SignInLocators sl;

	@Test(dataProvider = "signUp")
	public void signInTest(String username, String password) throws InterruptedException {
		logger = extent.createTest(
				this.getClass().getSimpleName() + "_" + Thread.currentThread().getStackTrace()[1].getMethodName());

		page = PageFactory.initElements(driver, SignInPage.class);
		sl = PageFactory.initElements(driver, SignInLocators.class);

		logger.log(Status.INFO, "Start Verifying SignIn page");

		Actions act = new Actions(driver);

		page.signInClick();
		logger.log(Status.INFO, "Clicked on the sign in link");

		Thread.sleep(3000);
		Assert.assertEquals(page.getPageTitle(), "Address Book - Sign In");
		logger.log(Status.INFO, "Sign In page title is verified and the title is " + page.getPageTitle());

		boolean signInHeadingText = page.getSignInHeading();
		logger.log(Status.INFO, "Sign in page heading is displayed : " + signInHeadingText);

		WebElement emailTextField = page.getEmailTextField();
		emailTextField.sendKeys(username);
		logger.log(Status.INFO, "Entered " + username + " as username in email field");

		act.sendKeys(Keys.TAB, password, Keys.TAB, Keys.ENTER).build().perform();
		logger.log(Status.INFO, "Entered password in password field");

		if (page.getCurrentUrl().contentEquals("http://a.testaddressbook.com/")) {

			logger.log(Status.PASS, "Login Successfully");

			String verifyLogin = page.getVerifyLoginText();

			Assert.assertEquals(verifyLogin, username.toLowerCase());
			logger.log(Status.PASS, "verified the username");
			Thread.sleep(2000);

			page.getSignOutLink();
			logger.log(Status.PASS, "Log OUT Successfully");
			Thread.sleep(3000);

		}else if(page.getCurrentUrl().contains("sign_in")) {
			
			logger.log(Status.PASS, "user entered invalid email ID");
		}
		
		else {
			Assert.assertTrue(page.getInvalidLogin());
			logger.log(Status.PASS, "Invalid login text is displayed: "+page.getInvalidLogin());
			logger.log(Status.INFO,page.getInvalidLoginText());
			logger.log(Status.PASS, "user entered invalid login credentials and not be able to login");		
		}
	}
}
