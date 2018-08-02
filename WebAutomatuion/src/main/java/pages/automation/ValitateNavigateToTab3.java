package pages.automation;

import dataProvider.Constants;
import pages.BasePage;

public class ValitateNavigateToTab3 extends BasePage{

	
	public String validTab3Text() {
	
	navigateTo("http://demoqa.com/");
	clickOnFindElement("//*[@id=\"menu-item-66\"]/a", Constants.XPATH);
	clickOnFindElement("//*[@id=\"menu-item-153\"]/a", Constants.XPATH);
	clickOnFindElement("//*[@id=\"ui-id-3\"]", Constants.XPATH);
	String teb3Text = getElementPropertyValue("//*[@id=\"ui-id-3\"]", Constants.XPATH, Constants.TEXT, null, true);
	return teb3Text;
	}
}
