package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AccountCreatedSuccessfullyPage {
	
	WebDriver driver;
	
	public AccountCreatedSuccessfullyPage(WebDriver driver) {
		this.driver = driver ;
	}
	@FindBy(how = How.XPATH ,using = "//div[@class='alert alert-success fade in']") WebElement ACCOUNT_CREATED_MSG ;

}
