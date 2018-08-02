package test;

import java.util.HashMap;

import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pages.BasePage;

public class BaseTest extends BasePage{
	

	@BeforeClass
	public void intializa() {
		readConfig();
		initSet();
	}
	
	
	@AfterClass
	public void tearDown() {
		tearDownP();
	}

}
