package PageObjectClasses;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;

import JSONFileReader.JSONFileReaderClass;
import aquality.selenium.core.elements.ElementState;
import aquality.selenium.elements.ElementType;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ICheckBox;
import aquality.selenium.forms.Form;

public class CardTwoPageObject extends Form {

	public CardTwoPageObject() {
		super(By.xpath("//div[@class='logo__icon']"), "Inside Card Two Userinyerface logo");
	}

	private final IButton btnUpload = getElementFactory().getButton(By.xpath("//a[@class='avatar-and-interests__upload-button']"), "Upload Button");
	private final ICheckBox cbxUnSelect = getElementFactory().getCheckBox(By.xpath("//label[@for='interest_unselectall']//span[@class='icon icon-check checkbox__check']"), "UnSelect all", ElementState.EXISTS_IN_ANY_STATE);
	private final IButton btnNext2 = getElementFactory().getButton(By.xpath("//button[normalize-space()='Next']"), "Next");
	private final List<ICheckBox> cbxInterests = getElementFactory().findElements(By.xpath("//span[@class='icon icon-check checkbox__check']"), ElementType.CHECKBOX);
	private final IButton cardThree = getElementFactory().getButton(By.xpath("//h3[normalize-space()='Personal details']"), "Card 3");

	public void unSelectInterests() {
		cbxUnSelect.click();
	}

	public void selectInterests(int numberOfInterests) {

		for (int i=0;i<numberOfInterests;i++) {
			Random r= new Random();		 
			int randomValue = r.nextInt(cbxInterests.size());
			cbxInterests.get(randomValue).click();
		}
	}

	public void clickUpload() {
		btnUpload.click();
	}

	public void uploadImage(String key,String fileName) {
		try {
			Robot robot= new Robot();		
			StringSelection stringSelection = new StringSelection(JSONFileReaderClass.getJSONKeyValue(key,fileName));
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
			robot.setAutoDelay(2000);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);			
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

	public void clickNext2() {
		btnNext2.click();
	}

	public boolean isCardThreeDisplayed() {
		return cardThree.state().isDisplayed(); 	
	}
}

