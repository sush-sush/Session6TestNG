package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util {
	
	
//	public static void waitForElement(WebDriver driver ,int timeInSeconds , By locator) {
//		WebDriverWait wait = new WebDriverWait(driver , timeInSeconds);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
//		
//		
//	}
//	public static void waitForElement(WebDriver driver , int timeInSecond , By locator) {
//		WebDriverWait wait = new WebDriverWait(driver , timeInSecond);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
//	}
	public static void waitForElement(WebDriver driver , int timeInSeconds ,By locator) {
		WebDriverWait wait =new  WebDriverWait(driver, timeInSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
