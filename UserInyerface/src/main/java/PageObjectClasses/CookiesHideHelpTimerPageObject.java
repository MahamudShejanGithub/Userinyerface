package PageObjectClasses;

import org.openqa.selenium.By;

import Utilities.UtilityClass;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.forms.Form;

public class CookiesHideHelpTimerPageObject extends Form {

	public CookiesHideHelpTimerPageObject() {
		super(By.xpath("//p[@class='cookies__message']"), "Accept Cookies & Hide Help Page");
	}
	
	private final IButton btnClickHere = getElementFactory().getButton(By.xpath("//a[@class='start__link']"), "click Here");
	private final IButton btnAcceptCookies = getElementFactory().getButton(By.xpath("//button[normalize-space()='Not really, no']"), "Accepted Cookies");
	private final IButton btnTextCookies = getElementFactory().getButton(By.xpath("//p[@class='cookies__message']"), "Accept Cookies Message");	
	private final IButton txtHelpForm = getElementFactory().getButton(By.xpath("//h2[@class='help-form__title']"), "Help Form Message");
	private final IButton btnHelpForm = getElementFactory().getButton(By.xpath("//span[@class='highlight']"), "Send to bottom");
	private final IButton btnTimer = getElementFactory().getButton(By.xpath("//div[@class='timer timer--white timer--center']"), "Timer");
	
	public void acceptCookies() {		
		btnClickHere.click();
		UtilityClass.waitForElement();
		btnAcceptCookies.click();
	}
	
	public boolean isCookiesMsgOnScreen() {
		return btnTextCookies.state().isDisplayed();
	}
	
	public void hideHelpForm() {		
		btnClickHere.click();
		UtilityClass.pageLoad();
		btnHelpForm.click();
		txtHelpForm.state().waitForNotDisplayed();
	}
	
	public boolean isHelpFormOpen() {
		return txtHelpForm.state().isDisplayed(); 	
	}
	
	public void timerValidation() {
		btnClickHere.click();
		btnTimer.click();
	}
	public String getTimerText() {
		return btnTimer.getText();
	}
}
