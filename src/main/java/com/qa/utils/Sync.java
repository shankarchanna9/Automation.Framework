package com.qa.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.resources.base;

public class Sync extends base{

	public WebDriver driver;
	
	public Sync(WebDriver driver) {
		this.driver=driver;
	}
	
	public void implicitWait(int seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));		
	}
	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(commonUtils.IMPLICIT_WAIT));		
	}
	

	public void elementToBeClickableWait(By locator) {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(commonUtils.EXPLICIT_WAIT));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	public void elementToBeClickableWait(By locator,int duration) {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(duration));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	
	
	
	
}
