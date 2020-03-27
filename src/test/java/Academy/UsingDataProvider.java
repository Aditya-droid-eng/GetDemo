package Academy;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.BaseTest;
import pageObject.LoginPage;
import pageObject.QAclickPage;

public class UsingDataProvider extends BaseTest
{
	@Test(dataProvider = "data")
	public void usingData(String name,String pass) throws InterruptedException
	{
		OpenBrowser("chrome");
		QAclickPage qa = new QAclickPage(driver);
		Thread.sleep(2000);
		qa.loginBTN();
		Thread.sleep(1000);
		LoginPage lp = new LoginPage(driver);
		lp.userName(name);
		Thread.sleep(1000);
		lp.passWord(pass);
		lp.login();
	}
	
	@DataProvider
	public Object[][] data()
	{
		Object[][] data = new Object[1][2];
		data[0][0] = "addf@gmail.com";
		data[0][1] = "addf56";
		return data;
	
	}
}
