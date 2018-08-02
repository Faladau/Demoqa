package test.automation;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.automation.HomePage;
import test.BaseTest;

@Test
public class HomeTest extends BaseTest{
	
	HomePage hp = new HomePage();
	
	
	public void validHomePage() {
		
		navigateTo("http://demoqa.com/");
		String logoName =  hp.validHome();
		Assert.assertEquals(logoName, "Home");
	}
}
