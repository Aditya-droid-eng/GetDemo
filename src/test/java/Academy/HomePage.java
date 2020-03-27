package Academy;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.BaseTest;
import pageObject.LoginPage;
import pageObject.QAclickPage;

public class HomePage extends BaseTest
{
	@Test()
	public void homePageTest() throws InterruptedException
	{
		OpenBrowser("chrome");
		QAclickPage qa = new QAclickPage(driver);
		Thread.sleep(2000);
		String actual = qa.textVerify();
		Assert.assertEquals(actual,"FEATURED CURSES");
		qa.loginBTN();
		Thread.sleep(1000);
		LoginPage lp = new LoginPage(driver);
		lp.userName("asd@gmail.com");
		Thread.sleep(1000);
		lp.passWord("asd123");
		lp.login();
		
		System.out.println("jjjjj");
		System.out.println("kkkkk");
		System.out.println("ooooooo");
	}
	

}
