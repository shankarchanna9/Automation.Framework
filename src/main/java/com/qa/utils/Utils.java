package com.qa.utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.qa.resources.base;

public class Utils extends base {
	
	public WebDriver driver;
	
	public Utils(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement dofindElement(By locator) {
		return driver.findElement(locator);
	}
	
	public void doClick(By locator) {
		dofindElement(locator).click();
	}
	
	public void doClear(By locator) {
		dofindElement(locator).clear();		
	}
	public void sendKeys(By locator,String name) {
		dofindElement(locator).clear();
		dofindElement(locator).sendKeys(name);
	}
	public List<WebElement> dofindElements(By locator) {
		List<WebElement> options = driver.findElements(locator);
		return options;
	}
	public String getCurrentUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}
	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public boolean compareTitle(String titlename) {
		String title = driver.getTitle();
		//Assert.assertEquals(title, titlename);
		if (title.equals(titlename)) return true;
		else return false;
	}
	
	
	public void choicebyfindelements(By locator, String name) {
		List<WebElement> options = dofindElements(locator);
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase(name)) {
				option.click();
				break;
			}
		}
	}
	
	public int getOptionsbySelect(By locator) {
		WebElement element = dofindElement(locator);
		Select staticdropdown= new Select(element);
		List<WebElement> options = staticdropdown.getOptions();
		return options.size(); 
	}
	
	public void selectbyIndex(By locator, int index) {
		WebElement element = dofindElement(locator);
		Select staticdropdown= new Select(element);
		staticdropdown.selectByIndex(index);
	}
	public void selectbyValue(By locator, String value) {
		WebElement element = dofindElement(locator);
		Select staticdropdown= new Select(element);
		staticdropdown.selectByValue(value);
	}
	public void selectbyvisibleText(By locator, String text) {
		WebElement element = dofindElement(locator);
		Select staticdropdown= new Select(element);
		staticdropdown.selectByVisibleText(text);
	}
	
	public int dofindElementsbySize(By locator) {
		List<WebElement> options = driver.findElements(locator);
		return options.size();
	}
	public void getUrl(String url) {
		driver.get(url);
	}
	public void navigateUrl(String url) {
		driver.navigate().to(url);
	}
	public void navigateForward() {
		driver.navigate().forward();
	}
	public void navigateBack() {
		driver.navigate().back();
	}
	public void navigateRefresh() {
		driver.navigate().refresh();
	}
	
	
	public void tearDown(String method) {
		if(method.equalsIgnoreCase("quit")) {
			driver.quit();
		}
		else if(method.equalsIgnoreCase("close")) {
			driver.close();
		}
		else System.out.println("Give the teardown methods name");
	}
	
}
