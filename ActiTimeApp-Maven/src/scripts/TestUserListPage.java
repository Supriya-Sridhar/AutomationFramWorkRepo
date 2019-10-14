package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.FWUtils;
import pages.EnterTimeTrackPage;
import pages.LoginPage;
import pages.UsersListPage;

public class TestUserListPage extends BaseTest{

	@Test
	public void verifyUserListPage() throws InterruptedException
	{
		String un = FWUtils.read_XL_Data(XL_DATA_PATH, "UserListPage", 1, 0);
		String pw = FWUtils.read_XL_Data(XL_DATA_PATH, "UserListPage", 1, 1);
		String etpTitle = FWUtils.read_XL_Data(XL_DATA_PATH, "UserListPage", 1, 2);
		String ulpTitle = FWUtils.read_XL_Data(XL_DATA_PATH, "UserListPage", 1, 3);
		
		LoginPage lp = new LoginPage(driver);
		lp.setUN(un);
		Thread.sleep(1000);
		lp.setPW(pw);
		Thread.sleep(1000);
		lp.ClickLgnBtn();
		
		EnterTimeTrackPage etp = new EnterTimeTrackPage(driver);
		Thread.sleep(1000);
		FWUtils.verifyPage(driver, etpTitle);
		Thread.sleep(1000);
		etp.clickUserBtn();
		
		UsersListPage ulp = new UsersListPage(driver);
		Thread.sleep(1000);
		FWUtils.verifyPage(driver, ulpTitle);
		Thread.sleep(1000);
		ulp.clickAddUser();
		
		WebElement frstName = driver.findElement(By.id("userDataLightBox_firstNameField"));
		
	}
}
