package PageObjectClasses;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.forms.Form;

import org.openqa.selenium.By;

public class HomePagePageObject extends Form {

	 public HomePagePageObject() {
		super(By.xpath("//div[@class='logo__icon']"), "userinyerface logo");
	}
	 
	private final IButton btnClickHere = getElementFactory().getButton(By.xpath("//a[@class='start__link']"), "click Here");	
	private final IButton cardOne = getElementFactory().getButton(By.xpath("//h3[normalize-space()='Personal details']"), "Card 1");
	
	public void clickHere() {	
		btnClickHere.click();
	}
	
	public boolean isCardOneDisplayed() {
		return cardOne.state().isDisplayed(); 	
	}
}
