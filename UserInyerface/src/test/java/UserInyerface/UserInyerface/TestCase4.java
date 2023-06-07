package UserInyerface.UserInyerface;

import org.testng.Assert;
import org.testng.annotations.Test;
import JSONFileReader.JSONFileReaderClass;
import PageObjectClasses.CookiesHideHelpTimerPageObject;

public class TestCase4 extends BaseTest{

	CookiesHideHelpTimerPageObject t= new CookiesHideHelpTimerPageObject();
	
	@Test(priority=4)
	public void timerValidation() {
		t.timerValidation();
		Assert.assertEquals(t.getTimerText(), JSONFileReaderClass.getJSONKeyValue("timer","timer.json"), "Timer Doesn't Start From 00.00.00");
	}
}
