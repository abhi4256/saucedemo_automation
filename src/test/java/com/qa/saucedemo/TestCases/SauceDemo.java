package com.qa.saucedemo.TestCases;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.saucedemo.base.BaseClass;
import com.qa.saucedemo.pages.HomePage;
import com.qa.saucedemo.utils.TestUtils;

public class SauceDemo extends BaseClass {
	int TC;
	HomePage home;

	@BeforeMethod
	public void setUp() {
		intitilization();
		home = new HomePage();

	}

	@AfterMethod
	public void Screen(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.SUCCESS) {
			TestUtils.Screenshots(TC);
		}

	}

	@Test
	public void LoginForHomeSection() {
		TC = 1;
		home.Login_for_home(Props.getProperty("username"), Props.getProperty("password"));
		home.dropdown();

	}

	@Test
	public void adding() {
		TC = 2;
		home.Login_for_home(Props.getProperty("username"), Props.getProperty("password"));
		home.add();
	}

	@Test
	public void Logout() {
		TC = 3;
		home.Login_for_home(Props.getProperty("username"), Props.getProperty("password"));
		home.Logout();
	}
}
