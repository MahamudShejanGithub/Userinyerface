package Utilities;

import java.time.Duration;

import aquality.selenium.browser.AqualityServices;

public class UtilityClass {

	public static void pageLoad() {
		AqualityServices.getBrowser().waitForPageToLoad();
	}
	
	public static void waitForElement() {
		AqualityServices.getBrowser().setImplicitWaitTimeout(Duration.ofSeconds(5));
	}
	
	public static void waitForPageLoad() {
		AqualityServices.getBrowser().setPageLoadTimeout(Duration.ofSeconds(10));
	}
}
