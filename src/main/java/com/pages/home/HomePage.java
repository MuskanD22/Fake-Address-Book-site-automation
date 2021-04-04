package com.pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pages.locators.HomePageLocator;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	// 3 page Actions :features of the page the form of methods:
	
	
	//  This method is used to get the page title and it will return the page title as string
	 
	public String getPageTitle() {
		return driver.getTitle();
	}

	//  This method is used to get the welcome heading and it will return the heading as string
	
	public String getWelcomeHeading() {
		WebElement heading=HomePageLocator.welcomeElement();
		return heading.getText();
	}

	//  This method is used to get the web application heading and it will return the heading as string
	
	public String getWebApplicationHeading() {
		WebElement headingText= HomePageLocator.getWebAppElement();
		return headingText.getText();
	}


}
