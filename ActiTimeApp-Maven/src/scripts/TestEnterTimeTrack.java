package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.FWUtils;
import pages.EnterTimeTrackPage;
import pages.LoginPage;

public class TestEnterTimeTrack extends BaseTest{

	@Test
	public void verifyEnterTimeTrack() throws InterruptedException
	{
		String un = FWUtils.read_XL_Data(XL_DATA_PATH, "EnterTimeTrack", 1, 0);
		String pw = FWUtils.read_XL_Data(XL_DATA_PATH, "EnterTimeTrack", 1, 1);
		String eTitle = FWUtils.read_XL_Data(XL_DATA_PATH, "EnterTimeTrack", 1, 2);
		
		LoginPage lp = new LoginPage(driver);
		lp.setUN(un);
		Thread.sleep(1000);
		lp.setPW(pw);
		Thread.sleep(1000);
		lp.ClickLgnBtn();
		
		EnterTimeTrackPage etp = new EnterTimeTrackPage(driver);
		Thread.sleep(1000);
		FWUtils.verifyPage(driver, eTitle);
		
	}
}
