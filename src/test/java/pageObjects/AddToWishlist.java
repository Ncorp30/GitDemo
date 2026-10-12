package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddToWishlist extends BasePage {

	public AddToWishlist(WebDriver driver) {
		super(driver);
	}


	//@FindBy(xpath = "//a[normalize-space()='Show AllLaptops & Notebooks']")
	//WebElement Notebooks;
	@FindBy(css = "#content button[data-original-title='Add to Wish List']")
	WebElement firstitem;

	//public void clickNotebookslaptops() {
	//	Notebooks.click();
	//}
	
	public void clickAddToWishlist() {
		waitForElementToBeClickable(firstitem);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(firstitem));
			firstitem.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.elementToBeClickable(firstitem));
			firstitem.click();
		}
	}

}
 