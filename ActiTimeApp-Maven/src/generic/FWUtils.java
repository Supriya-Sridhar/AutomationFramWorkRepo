package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FWUtils {
	

	public static void verifyPage(WebDriver driver, String eTitle)
	{
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleContains(eTitle));
		
		String aTitle = driver.getTitle();
		if(aTitle.equals(eTitle))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
	
	public static String read_XL_Data(String path, String sheet, int r, int c)
	{
		String s = "";
		try
		{
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			s = wb.getSheet(sheet).getRow(r).getCell(c).toString();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return s;
	}
	
	public static int read_XL_RowCount(String path, String sheet )
	{
		int s = 0;
		try
		{
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			wb.getSheet(sheet).getLastRowNum();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return s;
	}
}
