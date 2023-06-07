package UserInyerface.UserInyerface;

import org.testng.Assert;
import org.testng.annotations.Test;
import PageObjectClasses.CookiesHideHelpTimerPageObject;

public class TestCase3 extends BaseTest{

	CookiesHideHelpTimerPageObject ac= new CookiesHideHelpTimerPageObject();
	
	@Test(priority=3)
	public void AcceptCookies() {
		ac.acceptCookies();
		Assert.assertFalse(ac.isCookiesMsgOnScreen(), "Even After Accepting Cookies, the Cookies Message still Appears");
	}
}
