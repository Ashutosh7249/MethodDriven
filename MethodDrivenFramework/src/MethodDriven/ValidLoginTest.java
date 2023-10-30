package MethodDriven;


import KeywordDriven.BaseTest;
import KeywordDriven.FileLib;

public class ValidLoginTest extends BaseTest{

	public static void main(String[] args) throws Throwable {
		BaseTest bt=new BaseTest();
		bt.OpenBrowser();
		
		LoginPage lp=new LoginPage(driver);
		FileLib flib=new FileLib();
		String un=flib.getPropKeyValue(Prop_path, "username");
		String pwd = flib.getPropKeyValue(Prop_path, "password");
		lp.login(un, pwd);
		Thread.sleep(2000);

	}

}
