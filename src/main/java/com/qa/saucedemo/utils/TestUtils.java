package com.qa.saucedemo.utils;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.qa.saucedemo.base.BaseClass;

public class TestUtils extends BaseClass {
	public static void Screenshots(int TC) throws IOException {
		File dest = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File src = new File("C:\\Users\\HP\\eclipse-workspace\\Excelr_project1\\ScreenShot\\ScreenShot"+ TC +".png");
		FileHandler.copy(dest, src);
	}
    
	
}
