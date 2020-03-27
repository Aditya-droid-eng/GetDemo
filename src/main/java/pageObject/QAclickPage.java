package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QAclickPage 
{
	
	
	@FindBy(xpath = "//span[text()='Login']")
	private WebElement login;
	
	public void loginBTN()
	{
		login.click();
	}
	
	public QAclickPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//h2[text()='Featured Courses']")
	private WebElement text;
	
	public String textVerify()
	{
		String acTual = text.getText();
		return acTual;
	}
}
