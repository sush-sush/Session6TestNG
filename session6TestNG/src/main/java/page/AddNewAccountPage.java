package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddNewAccountPage {
	Random rnd = new Random();
	int rndNo = rnd.nextInt(999);
	String accountTitle = "sush" + rndNo;
	String initialBalance = "100" + rndNo ;
	
			WebDriver driver;
	
	public AddNewAccountPage(WebDriver driver) {
		this.driver = driver;
		
	}
	@FindBy(how = How.NAME ,using = "account") WebElement ACCOUNT_TITLE_LOCATOR;
	@FindBy(how = How.ID ,using = "description") WebElement DESCRIPTION_FIELD_LOCATOR;
	@FindBy(how = How.ID ,using = "balance") WebElement INITIAL_BALANCE_LOCATOR;
	@FindBy(how = How.XPATH ,using = "//form[@role='form']/descendant::button[@type='submit']") WebElement SUBMIT_BUTTON_LOCATOR;
	
	
	
		public void enterAccountTitle(String account) {
		ACCOUNT_TITLE_LOCATOR.sendKeys(accountTitle);
	}
	public void enterDescription(String description) {
		DESCRIPTION_FIELD_LOCATOR.sendKeys("Red :");
	}
	public void enterInitialBalance(String money) {
		INITIAL_BALANCE_LOCATOR.sendKeys(initialBalance);
	}
	public void clickOnSubmitButton() {
		SUBMIT_BUTTON_LOCATOR.click();
		
	}

}
