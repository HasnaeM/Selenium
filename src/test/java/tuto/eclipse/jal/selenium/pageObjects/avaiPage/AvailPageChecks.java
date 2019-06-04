package tuto.eclipse.jal.selenium.pageObjects.avaiPage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import tuto.eclipse.jal.selenium.loaders.MyDriver;
import tuto.eclipse.jal.selenium.pageObjects.homePage.HomePageIDs;

public class AvailPageChecks {
	
	public AvailPageChecks() {
		 
	}
	
	
	
	protected void waitForThePage() {
		WebDriverWait wait = new WebDriverWait(MyDriver.driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(HomePageIDs.MODAL_CLOSE_BUTTON_CSS)));

	}
	
	protected String getPageTitle() {
		return MyDriver.driver.getTitle(); 
	}
}