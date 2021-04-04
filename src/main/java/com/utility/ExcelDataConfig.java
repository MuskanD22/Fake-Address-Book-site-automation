package com.utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/*
 * this class is used to get excel data
 */

public class ExcelDataConfig {

	XSSFWorkbook wb;

	XSSFSheet sheet;

	public ExcelDataConfig(String excelPath) {
		File src = new File(excelPath);

		try {
			// Create an object of FileInputStream class to read excel file
			FileInputStream fis = new FileInputStream(src);
			// Now get the workBook
			wb = new XSSFWorkbook(fis);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public String getData(int sheetNumber, int row, int column) {

		sheet = wb.getSheetAt(sheetNumber);
		// String data="";
		String data = sheet.getRow(row).getCell(column).getStringCellValue();

		/*
		 * try { Cell cell=sheet.getRow(row).getCell(column); if (cell.getCellType() ==
		 * Cell.CELL_TYPE_STRING) { data =
		 * sheet.getRow(row).getCell(column).getStringCellValue(); } else if
		 * (sheet.getRow(row).getCell(column).getCellType() == Cell.CELL_TYPE_NUMERIC) {
		 * data = NumberToTextConverter.toText(sheet.getRow(row).getCell(column).
		 * getNumericCellValue()); } } catch (Exception e) { //data =
		 * NumberToTextConverter.toText(sheet.getRow(row).getCell(column).
		 * getNumericCellValue());
		 * data=String.valueOf((int)(sheet.getRow(row).getCell(column).
		 * getNumericCellValue()));
		 * 
		 * // Double newData = new Double(datsa); // data=Double.toString(datsa); //
		 * data = String.valueOf(value); }
		 */
		return data;
	}

	public int getRowCount(int sheetNumber) {

		return (wb.getSheetAt(sheetNumber).getLastRowNum() + 1);

	}

	public String[][] getExcelData(int sheetNumber) {
		sheet = wb.getSheetAt(sheetNumber);
		String[][] data = null;
		try {
			XSSFRow row = sheet.getRow(0);
			int noOfRows = sheet.getPhysicalNumberOfRows();
			int noOfCols = row.getLastCellNum();
			Cell cell;
			data = new String[noOfRows - 1][noOfCols];
			for (int i = 1; i < noOfRows; i++) {
				for (int j = 0; j < noOfCols; j++) {
					row = sheet.getRow(i);
					cell = row.getCell(j);
					data[i - 1][j] = cell.getStringCellValue();
				}
			}
		} catch (Exception e) {
			System.out.println("The exception is: " + e.getMessage());
		}
		return data;
	}

}
