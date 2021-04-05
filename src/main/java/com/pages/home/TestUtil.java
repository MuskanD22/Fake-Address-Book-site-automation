package com.pages.home;

import java.util.ArrayList;

import com.utility.Xls_Reader;

/*
 * This class is used to take the data from excel sheet
 */
public class TestUtil {
	static Xls_Reader reader;

	/*
	 * this method is used to get the rows of the excel sheet and it will return the
	 * ArrayList of objects
	 */
	
	public static ArrayList<Object[]> getDataRow() {
		ArrayList<Object[]> myData = new ArrayList<>();
		try {
			reader = new Xls_Reader(
					"C:\\Users\\muskan.dureja\\eclipse-workspace\\PracticeAutomation\\ExcelReports\\FakeAddressBook.xlsx");
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (int rowNum = 2; rowNum <= reader.getRowCount("AddressSignUpData"); rowNum++) {

			String email = reader.getCellData("AddressSignUpData", "email", rowNum);
			String password = reader.getCellData("AddressSignUpData", "password", rowNum);
			Object ob[] = { email, password };
			myData.add(ob);
		}

		return myData;
	}

	public static ArrayList<Object[]> getDatarowExcel() {
		ArrayList<Object[]> myData = new ArrayList<>();
		try {
			reader = new Xls_Reader(
					"C:\\Users\\muskan.dureja\\eclipse-workspace\\PracticeAutomation\\ExcelReports\\FakeAddressBook.xlsx");
			// reader = new Xls_Reader("D:\\Reports\\addd.xlsx");
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (int rowNum = 2; rowNum <= reader.getRowCount("AddressData"); rowNum++) {

			String email = reader.getCellData("AddressData", "email", rowNum);
			String password = reader.getCellData("AddressData", "password", rowNum);
			String firstname = reader.getCellData("AddressData", "firstname", rowNum);
			String lastname = reader.getCellData("AddressData", "lastname", rowNum);
			String address1 = reader.getCellData("AddressData", "address1", rowNum);
			String address2 = reader.getCellData("AddressData", "address2", rowNum);
			String city = reader.getCellData("AddressData", "city", rowNum);
			String state = reader.getCellData("AddressData", "state", rowNum);
			String zipcode = reader.getCellData("AddressData", "zipcode", rowNum);
			String birthdate = reader.getCellData("AddressData", "birthdate", rowNum);
			String age = reader.getCellData("AddressData", "age", rowNum);
			String website = reader.getCellData("AddressData", "website", rowNum);
			String phone = reader.getCellData("AddressData", "phone", rowNum);
			String note = reader.getCellData("AddressData", "note", rowNum);
			Object ob[] = { email, password, firstname, lastname, address1, address2, city, state, zipcode, birthdate,
					age, website, phone, note };
			myData.add(ob);
		}
		return myData;
	}

	public static ArrayList<Object[]> getEditDatarowExcel() {
		ArrayList<Object[]> myData = new ArrayList<>();
		try {
			reader = new Xls_Reader(
					"C:\\Users\\muskan.dureja\\eclipse-workspace\\PracticeAutomation\\ExcelReports\\FakeAddressBook.xlsx");
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (int rowNum = 2; rowNum <= reader.getRowCount("editData"); rowNum++) {

			String email = reader.getCellData("editData", "email", rowNum);
			String password = reader.getCellData("editData", "password", rowNum);
			Object ob[] = { email, password };
			myData.add(ob);
		}

		return myData;
	}

	public static ArrayList<Object[]> getValidateData() {
		ArrayList<Object[]> myData = new ArrayList<>();
		try {
			reader = new Xls_Reader(
					"C:\\Users\\muskan.dureja\\eclipse-workspace\\PracticeAutomation\\ExcelReports\\FakeAddressBook.xlsx");
			// reader = new Xls_Reader("D:\\Reports\\addd.xlsx");
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (int rowNum = 2; rowNum <= reader.getRowCount("ValidateAddressData"); rowNum++) {

			String email = reader.getCellData("ValidateAddressData", "email", rowNum);
			String password = reader.getCellData("ValidateAddressData", "password", rowNum);
			String firstname = reader.getCellData("ValidateAddressData", "firstname", rowNum);
			String lastname = reader.getCellData("ValidateAddressData", "lastname", rowNum);
			String address1 = reader.getCellData("ValidateAddressData", "address1", rowNum);
			String address2 = reader.getCellData("ValidateAddressData", "address2", rowNum);
			String city = reader.getCellData("ValidateAddressData", "city", rowNum);
			String state = reader.getCellData("ValidateAddressData", "state", rowNum);
			String zipcode = reader.getCellData("ValidateAddressData", "zipcode", rowNum);
			String birthdate = reader.getCellData("ValidateAddressData", "birthdate", rowNum);
			String age = reader.getCellData("ValidateAddressData", "age", rowNum);
			String website = reader.getCellData("ValidateAddressData", "website", rowNum);
			String phone = reader.getCellData("ValidateAddressData", "phone", rowNum);
			String note = reader.getCellData("ValidateAddressData", "note", rowNum);
			Object ob[] = { email, password, firstname, lastname, address1, address2, city, state, zipcode, birthdate,
					age, website, phone, note };
			myData.add(ob);
		}
		return myData;
	}

}