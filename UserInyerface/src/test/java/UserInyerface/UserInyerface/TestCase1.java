package UserInyerface.UserInyerface;

import org.junit.Assert;
import org.testng.annotations.Test;
import PageObjectClasses.CardOnePageObject;
import PageObjectClasses.CardTwoPageObject;
import PageObjectClasses.HomePagePageObject;
import Utilities.RandomlyGeneratedText;
import Utilities.UtilityClass;

public class TestCase1 extends BaseTest{
	
	HomePagePageObject hp=new HomePagePageObject();

	CardOnePageObject cardone = new CardOnePageObject(); 
	RandomlyGeneratedText random = new RandomlyGeneratedText();
	private static final int numberOfInterests=3;
	
	@Test(priority=1)
	public void Registration()
	{	
		hp.clickHere();
		UtilityClass.pageLoad();
		Assert.assertFalse("Card One is not Open", hp.isCardOneDisplayed());
		
		cardone.setPassword(random.password());
		Assert.assertEquals(random.password().length(),10);
		cardone.setEmail(random.mail());
		Assert.assertEquals(random.mail().length(),8);
		cardone.setDomain(random.domain());
		Assert.assertEquals(random.domain().length(),5);
		cardone.clickDropdown();
		cardone.domainSelection();
		cardone.checkBox();
		cardone.clickNext1();
		UtilityClass.pageLoad();
		Assert.assertFalse("Card Two is not Open", cardone.isCardTwoDisplayed());
		
		CardTwoPageObject cardtwo = new CardTwoPageObject();
		cardtwo.unSelectInterests();
		cardtwo.selectInterests(numberOfInterests);
		cardtwo.clickUpload();
		cardtwo.uploadImage("img","configuration.json" );
		Assert.assertFalse("Card Three is not open",cardtwo.isCardThreeDisplayed());
		cardtwo.clickNext2();
	}
}
