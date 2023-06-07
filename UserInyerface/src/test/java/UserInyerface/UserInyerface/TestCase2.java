package UserInyerface.UserInyerface;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjectClasses.CookiesHideHelpTimerPageObject;

public class TestCase2 extends BaseTest{

	CookiesHideHelpTimerPageObject hf= new CookiesHideHelpTimerPageObject();
	
	@Test(priority=2)
	public void HideForm() {
		hf.hideHelpForm();
		Assert.assertFalse(hf.isHelpFormOpen(), "Help form is either Open or Closing lately");
	}
}
