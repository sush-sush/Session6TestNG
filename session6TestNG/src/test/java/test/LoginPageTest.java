package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTest extends Util {
	
	WebDriver driver;
	// Element Library

	By usernameField = By.id("username");
	By passwordField = By.xpath("//input[@id='password']");
	By signInButton = By.xpath("//div[@class='sign-in-inner']/descendant::button[@type='submit']");
	By dashboardDisplay =By.xpath("//h2[contains(text(),'Dashboard')]");
	
	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://techfios.com/test/billing/?ng=login/");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
	}

	@Test
	public void validUserShouldBeAbleToLogIn() throws InterruptedException {
		driver.findElement(usernameField).sendKeys("techfiosdemo@gmail.com");
		driver.findElement(passwordField).sendKeys("abc123");
		driver.findElement(signInButton).click();
		Thread.sleep(3000);
		waitForElement(driver ,10 ,dashboardDisplay);
		
	}
	@Test
	public void InvalidUserShouldNotBeAbleToLogIn() throws InterruptedException {
		driver.findElement(usernameField).sendKeys("techfiosdemo@gmail.com");
		driver.findElement(passwordField).sendKeys("abc23");
		driver.findElement(signInButton).click();
		Thread.sleep(3000);
		//Util.waitForElement(driver ,10 ,dashboardDisplay);

	}
	@AfterTest
	public void tearDown() {
		driver.close();
		//driver.quit();
	}

}
