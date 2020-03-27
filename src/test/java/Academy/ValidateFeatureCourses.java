package Academy;

import org.testng.Assert;
import org.testng.annotations.Test;

import Resources.BaseTest;
import pageObject.QAclickPage;

public class ValidateFeatureCourses extends BaseTest
{
	@Test
	public void validateCourses() throws InterruptedException
	{
		OpenBrowser("chrome");
		QAclickPage qa = new QAclickPage(driver);
		Thread.sleep(2000);
		String actual = qa.textVerify();
		Assert.assertEquals(actual,"FEATURED CURSES");
		
	}
	
}
