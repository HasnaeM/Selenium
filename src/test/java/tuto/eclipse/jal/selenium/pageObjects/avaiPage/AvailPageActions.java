package tuto.eclipse.jal.selenium.pageObjects.avaiPage;

import org.openqa.selenium.By;

import tuto.eclipse.jal.selenium.loaders.MyDriver;
import tuto.eclipse.jal.selenium.pageObjects.homePage.HomePageIDs;

public class AvailPageActions {
	
	public void clickContinueButton() {
		
		MyDriver.driver.findElement(By.id(AvailPageIDs.CONTINUE_BUTTON)).click();
	}

	
	
}
