package PageObjectClasses;

import org.openqa.selenium.By;

import aquality.selenium.core.elements.ElementState;
import aquality.selenium.elements.actions.JsActions;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ICheckBox;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;

public class CardOnePageObject extends Form {

	public CardOnePageObject() {
		super(By.xpath("//div[@class='logo__icon']"), "Inside Card One Userinyerface logo");
	}

	private final ITextBox txbPassword = getElementFactory().getTextBox(By.xpath("//input[@placeholder='Choose Password']"), "Choose Password");
	private final ITextBox txbMail = getElementFactory().getTextBox(By.xpath("//input[@placeholder='Your email']"), "Email");
	private final ITextBox txbDomain = getElementFactory().getTextBox(By.xpath("//input[@placeholder='Domain']"), "Email's Domain Name");
	private final IButton btnDropdown = getElementFactory().getButton(By.xpath("//div[@class='dropdown__field']"), "Dropdown");
	private final IButton btnDomain = getElementFactory().getButton(By.xpath("//div[normalize-space()='.com']"), "Domain Selection");
	private final IButton btnNext1 = getElementFactory().getButton(By.xpath("//a[@class='button--secondary']"), "Next");
	private final ICheckBox cbxTerms = getElementFactory().getCheckBox(By.xpath("//span[@class='icon icon-check checkbox__check']"), "Terms and Conditions ", ElementState.EXISTS_IN_ANY_STATE);
	private final IButton cardTwo = getElementFactory().getButton(By.xpath("//h3[normalize-space()='Personal details']"), "Card 2");
	
	JsActions js1 = new JsActions(btnDomain, "");
	
	public void setPassword(String password) {
		txbPassword.clearAndType(password);
	}
	
	public void setEmail(String mail) {
		txbMail.clearAndType(mail);
	}

	public void setDomain(String domain) {
		txbDomain.clearAndType(domain);
	}

	public void clickDropdown() {
		btnDropdown.click();
	}
	
	public void clickNext1() {
		btnNext1.click();
	}
	
	public void checkBox() {
		cbxTerms.click();
	}
	
	public void domainSelection() {
		js1.scrollIntoView();
		js1.click();
	}
	
	public boolean isCardTwoDisplayed() {
		return cardTwo.state().isDisplayed(); 	
	}
	
}
