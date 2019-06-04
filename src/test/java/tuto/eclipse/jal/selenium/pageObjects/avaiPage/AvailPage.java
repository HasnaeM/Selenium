package tuto.eclipse.jal.selenium.pageObjects.avaiPage;

import static org.junit.Assert.assertEquals;

import tuto.eclipse.jal.selenium.pageObjects.homePage.HomePageChecks;

public class AvailPage {

	public AvailPage() {
		super();
		
		
	System.out.println(" a second page has been created");
	}
	 
	public void run(){
	performsActions();
	//performChecks();
	}

	//private void performChecks() {
	//	AvailPageChecks check = new AvailPageChecks();
		//assertEquals(AVAIL_PAGE + "The title is not the expected one", EXPECTED_PAGE_TITLE, check.getPageTitle());
	//	System.out.println("see it, if is  wrong :-)");
		
		
//	}

	private void performsActions() {
		System.out.println("2 page"); 
		AvailPageActions actions = new AvailPageActions();
		actions.clickContinueButton();
		
	}
	

}
