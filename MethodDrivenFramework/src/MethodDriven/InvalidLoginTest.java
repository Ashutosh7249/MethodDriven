package MethodDriven;

import org.openqa.selenium.WebDriver;

public class InvalidLoginTest extends BaseTest{

	public static void main(String[] args) throws Throwable {
		BaseTest bt=new BaseTest();
		bt.OpenBrowser();
		
		FileLib flib=new FileLib();
		int rc = flib.getRowCount(Excel_path, "invaliddata");
		for(int i=1;i<=rc;i++)
		{	
		String un = flib.getcellData(Excel_path, "invaliddata" , i, 0);
		String pwd = flib.getcellData(Excel_path, "invaliddata", i, 1);
		
	
		LoginPage lp=new LoginPage(driver);
		lp.login(un, pwd);
		Thread.sleep(3000);
		}
		}

}
