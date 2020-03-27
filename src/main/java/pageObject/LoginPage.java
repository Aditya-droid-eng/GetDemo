package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(xpath = "//input[@id='user_email']")
	private WebElement userName;
	
	@FindBy(xpath = "//input[@id='user_password']")
	private WebElement passWord;
	
	@FindBy(xpath = "//input[@name='commit']")
	private WebElement login;
	
	public void userName(String name)
	{
		userName.sendKeys(name);
	}
	public void passWord(String pass)
	{
		passWord.sendKeys(pass);
	}
	public void login()
	{
		login.click();
	}
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
}
