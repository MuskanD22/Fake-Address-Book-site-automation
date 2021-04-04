package com.pages.home;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class AddressPropertiesPage {

	Properties pro;

	public AddressPropertiesPage() {
		try {
			File src = new File(
					"C:\\Users\\muskan.dureja\\eclipse-workspace\\PracticeAutomation\\src\\main\\resources\\PracticeAutomation.properties");
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			// Load file so we can use into our script
			pro.load(fis);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public String URL() {
		return pro.getProperty("URL");
	}

	public String getSignInLink() {
		return pro.getProperty("signInLink.xpath");
	}

	public String getSignInEmailTextField() {
		return pro.getProperty("signInEmailTextField.xpath");
	}

	public String getState() {
		return pro.getProperty("state.xpath");
	}

	public String getCommonInterestCheckbox() {
		return pro.getProperty("commonInterestCheckbox.xpath");
	}

}
