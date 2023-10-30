package MethodDriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id="username") private WebElement untb;
	@FindBy(id="password") private WebElement pwtb;
	@FindBy(id="submit") private WebElement loginBtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getuntb()
	{
		return untb;
		
	}
	
	public void setUntb(String un)
	{
		untb.sendKeys(un);
	}
	public WebElement getpwtb()
	{
		return pwtb;
		
	}
	
	public void setpwtb(String pwd)
	{
		
		pwtb.sendKeys(pwd);
	}
     
	public WebElement getLoginBtn()
	{
		return loginBtn;
		
	}
	
	public void ClickloginBtn()
	{
		
		loginBtn.click();
	}
	public void login(String un,String pwd)
	{
		untb.sendKeys(un);
		pwtb.sendKeys(pwd);
		loginBtn.click();
	}
}
