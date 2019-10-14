package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersListPage {

	@FindBy(xpath="//div[text()='Add User']")
	private WebElement addUser;
	
	public UsersListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickAddUser()
	{
		addUser.click();
	}
}
