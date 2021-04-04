package com.pages.elementHandler;

/*
 * This class is used to get color value
 */
public class ColorHandlePage {
	
	// This method is used to get HexCode value of the specified color
	
	public static String getHexCode(int r, int g, int b) {
		String hex = String.format("#%02X%02X%02X", r, g, b);
		return hex;
	}
}
