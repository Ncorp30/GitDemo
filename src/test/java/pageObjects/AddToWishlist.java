package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToWishlist extends BasePage {

	public AddToWishlist(WebDriver driver) {
		super(driver);
	}


	//@FindBy(xpath = "//a[normalize-space()='Show AllLaptops & Notebooks']")
	//WebElement Notebooks;
	@FindBy(xpath = "//div[@id='content']//div[1]//div[1]//div[2]//div[2]//button[2]//i[1]")
	WebElement firstitem;

	//public void clickNotebookslaptops() {
	//	Notebooks.click();
	//}
	
	public void clickaddwishlist() {
		firstitem.click();
	}

}
 