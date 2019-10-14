package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserPopUp {

	@FindBy(id="userDataLightBox_firstNameField")
	private WebElement frstNameTB;
	
	@FindBy(name="lastName")
	private WebElement lastNameTB;
	
	@FindBy(name="email")
	private WebElement emailTB;
	
	@FindBy(name="username")
	private WebElement unTB;
	
	@FindBy(name="password")
	private WebElement pwTB;
	
	@FindBy(name="passwordCopy")
	private WebElement retyppwTB;
	
	@FindBy(xpath="//span[text()='Create User']")
	private WebElement clckCreateUserBTN;
	
	public AddUserPopUp(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setFN(String frstName)
	{
		frstNameTB.sendKeys(frstName);
	}
	
	public void setLN(String lastName)
	{
		lastNameTB.sendKeys(lastName);
	}
	
	public void setEmail(String email)
	{
		emailTB.sendKeys(email);
	}
	
	public void setUN(String un)
	{
		unTB.sendKeys(un);
	}
	
	public void setPW(String pw)
	{
		pwTB.sendKeys(pw);
	}
	
	public void setRetypPW(String rePW)
	{
		retyppwTB.sendKeys(rePW);
	}
	
	public void clckCreateUserBTN()
	{
		clckCreateUserBTN.click();
	}
}
