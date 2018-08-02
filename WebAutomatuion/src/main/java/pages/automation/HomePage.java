package pages.automation;
import dataProvider.Constants;
import pages.BasePage;

public class HomePage extends BasePage{
	
	public String validHome() {
		String logoName = getElementPropertyValue("entry-title", Constants.CLASSNAME, Constants .TEXT, null, true);
		return logoName; 
	} 
}
