package UserInyerface.UserInyerface;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import JSONFileReader.JSONFileReaderClass;
import aquality.selenium.browser.AqualityServices;
import aquality.selenium.browser.Browser;

public class BaseTest {

	Browser browser = AqualityServices.getBrowser();

	@BeforeTest
	public void goToURL() {
		browser.maximize();
		browser.goTo(JSONFileReaderClass.getJSONKeyValue("url","configuration.json"));
	}
	
	@AfterTest
	public void closeBrowser() {
		browser.quit();
	}
}
