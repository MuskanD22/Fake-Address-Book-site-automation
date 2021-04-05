package com.pages.home;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.utility.CaptureScreenshots;
import com.utility.ExcelDataConfig;
import com.utility.QuickBrowserOpening;

public class BaseClass {

	public WebDriver driver;
	public ExtentHtmlReporter reporter;
	public static ExtentReports extent;
	int i = 0;
	public ExtentTest logger;
	public AddressPropertiesPage pro = new AddressPropertiesPage();
	public ExcelDataConfig config;

	/*
	 * This startup() method will create the instance of Extent report
	 */

	@BeforeSuite
	public void startup() {
		reporter = new ExtentHtmlReporter("D:\\ReportData\\lastRun5.html");
		reporter.setAppendExisting(true);
		extent = new ExtentReports();
		extent.attachReporter(reporter);
	}

	@BeforeTest
	public void beforeTest() {

	}

	@BeforeClass
	public void beforeClass() {
	}

	/*
	 * This beforeMethod() method will open the browser and load the application
	 * before the test started
	 */

	@BeforeMethod
	public void beforeMethod() {
		String URL = pro.URL();
		driver = QuickBrowserOpening.StartBrowser("Chrome", URL);
	}

	/*
	 * This testDataFeed() will provide the data when user is entering the data in
	 * registration form
	 */

	/*@DataProvider(name = "signin")
	public Object[][] testDataFeed() {
		int rows_count = 0;
		config = new ExcelDataConfig("D:\\Reports\\AddressSignUp.xlsx");

		rows_count = config.getRowCount(0);

		Object[][] data = new Object[rows_count][2];

		for (int i = 1; i < rows_count; i++) {

			data[i][0] = config.getData(0, i, 0);
			data[i][1] = config.getData(0, i, 1);
		}
		return data;
	}
*/
	/*
	 * This dataFeed() will provide the data when user is entering the data in login
	 * form
	 */

	@DataProvider(name = "getValidateData")
	public Iterator<Object[]> getDataForValidateAddressTests() {
		ArrayList<Object[]> testdata = TestUtil.getValidateData();
		return testdata.iterator();
	}
	/*
	 * This getData() will provide the data when user is entering the data in
	 * address form
	 */
	@DataProvider(name = "signUp")
	public Iterator<Object[]> dataFeed() {
		ArrayList<Object[]> testdata = TestUtil.getDataRow();
		return testdata.iterator();
	}
	
	
	@DataProvider(name = "data")
	public Iterator<Object[]> getData() {
		ArrayList<Object[]> testdata = TestUtil.getDatarowExcel();
		return testdata.iterator();
	}
	@DataProvider(name = "editData")
	public Iterator<Object[]> getEditData() {
		ArrayList<Object[]> testdata = TestUtil.getEditDatarowExcel();
		return testdata.iterator();
	}
	// This tearDown method will capture the screenshot when the test fails

	@AfterMethod
	public void tearDown(ITestResult result) throws IOException {

		if (result.getStatus() == ITestResult.FAILURE) {
			String temp = CaptureScreenshots.captureScreenshots(driver, "Screenshot" + i);

			logger.fail(result.getThrowable().getMessage(),
					MediaEntityBuilder.createScreenCaptureFromPath(temp).build());

		}

		extent.flush();
		i++;
		driver.quit();
	}

	@AfterClass
	public void afterClass() {

	}

	@AfterTest
	public void afterTest() {

	}

	@AfterSuite
	public void afterSuite() {

	}

	// this method is used to login on the portal
	public void login(String username, String password) {
		Actions act = new Actions(driver);
		String signInLink = pro.getSignInLink();
		driver.findElement(By.xpath(signInLink)).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		String signInEmailTextField = pro.getSignInEmailTextField();
		driver.findElement(By.xpath(signInEmailTextField)).sendKeys(username);
		act.sendKeys(Keys.TAB, password, Keys.TAB.ENTER).build().perform();
	}

}
