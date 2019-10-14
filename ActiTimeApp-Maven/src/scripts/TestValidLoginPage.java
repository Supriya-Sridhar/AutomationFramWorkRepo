package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.FWUtils;
import pages.LoginPage;

public class TestValidLoginPage extends BaseTest{

	@Test
	public void validTestLP()
	{
		String un = FWUtils.read_XL_Data(XL_DATA_PATH, "ValidLogin", 1, 0);
		String pw = FWUtils.read_XL_Data(XL_DATA_PATH, "ValidLogin", 1, 1);
		
		LoginPage lp = new LoginPage(driver);
		lp.setUN(un);
		lp.setPW(pw);
		lp.ClickLgnBtn();
	
	}
	
}
