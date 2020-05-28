package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AccountCreatedSuccessfullyPage;



public class AccountSuccessfullyCreatedMsgTest extends AddNewAccountTest {
	WebDriver driver;
	@Test
	public void accountSuccessfullyCreatedMsg() {
		addNewAccount();
		AccountCreatedSuccessfullyPage accountSuccessfullyCreatedMsgPage = PageFactory.initElements(driver,
				AccountCreatedSuccessfullyPage.class);
	
		
	}
}
