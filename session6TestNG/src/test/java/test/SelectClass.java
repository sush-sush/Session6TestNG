package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SelectClass extends Util{
	
	WebDriver driver;
	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://objectspy.space/");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
	}
	@Test
	public void selectTest() throws InterruptedException {
		Select select = new Select(driver.findElement(By.id("continents")));
		//select.selectByVisibleText("Africa");
		//or you can do it by selectByValue
		select.selectByIndex(2);
		By africaLocator = By.xpath("//option[contains(text(),'Africa')]");
		waitForElement(driver ,10 ,africaLocator);
		Thread.sleep(2000);
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
