package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.qa.pages.loginPage;

public class loginPageTest extends loginPage {

	public loginPageTest(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Test
	public void isLogin() {
		// TODO Auto-generated method stub
		super.login();
	}
	
	//added random lines
}
