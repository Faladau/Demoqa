package test.automation;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.automation.ValitateNavigateToTab3;
import test.BaseTest;

public class ValidationTab3Test extends BaseTest{
	
	ValitateNavigateToTab3 validText = new ValitateNavigateToTab3();
	
	@Test
	public void validTextTab3Test() {
		
	 String textValidation = validText.validTab3Text();
	 Assert.assertEquals(textValidation, "Tab 3");
	}
}
