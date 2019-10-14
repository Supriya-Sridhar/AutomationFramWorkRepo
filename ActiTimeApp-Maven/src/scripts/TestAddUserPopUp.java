package scripts;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.testng.annotations.Test;

	import generic.BaseTest;
	import generic.FWUtils;
import pages.AddUserPopUp;
import pages.EnterTimeTrackPage;
	import pages.LoginPage;
	import pages.UsersListPage;

	public class TestAddUserPopUp extends BaseTest{
		
		@Test
		public void verifyUserListPage() throws InterruptedException
		{
			String un = FWUtils.read_XL_Data(XL_DATA_PATH, "UserListPage", 1, 0);
			String pw = FWUtils.read_XL_Data(XL_DATA_PATH, "UserListPage", 1, 1);
			String etpTitle = FWUtils.read_XL_Data(XL_DATA_PATH, "UserListPage", 1, 2);
			String ulpTitle = FWUtils.read_XL_Data(XL_DATA_PATH, "UserListPage", 1, 3);
			
			String fn = FWUtils.read_XL_Data(XL_DATA_PATH, "AddUserPopUp", 4, 0);
			String ln = FWUtils.read_XL_Data(XL_DATA_PATH, "AddUserPopUp", 4, 1);
			String email = FWUtils.read_XL_Data(XL_DATA_PATH, "AddUserPopUp", 4, 2);
			String unNew = FWUtils.read_XL_Data(XL_DATA_PATH, "AddUserPopUp", 4, 3);
			String pwNew = FWUtils.read_XL_Data(XL_DATA_PATH, "AddUserPopUp", 4, 4);
			String repw = FWUtils.read_XL_Data(XL_DATA_PATH, "AddUserPopUp", 4, 5);
			
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
			
			AddUserPopUp auser = new AddUserPopUp(driver);
			Thread.sleep(1000);
			auser.setFN(fn);
			auser.setLN(ln);
			auser.setEmail(email);
			auser.setUN(unNew);
			auser.setPW(pwNew);
			auser.setRetypPW(repw);
			Thread.sleep(1000);
			
			auser.clckCreateUserBTN();
			
			
		}
}
