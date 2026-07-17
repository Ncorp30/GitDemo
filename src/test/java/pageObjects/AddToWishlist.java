package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToWishlist extends BasePage {

	public AddToWishlist(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txtEmailAddress;

	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txtPassword;

	@FindBy(xpath = "//input[@value='Login']")
	WebElement btnLogin;


	//@FindBy(xpath = "//a[normalize-space()='Show AllLaptops & Notebooks']")
	//WebElement Notebooks;
	@FindBy(css = "#content button[data-original-title='Add to Wish List']")
	WebElement firstitem;

	public void setEmail(String email) {
		txtEmailAddress.sendKeys(email);
	}

	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}

	public void clickLogin() {
		btnLogin.click();
	}

	//public void clickNotebookslaptops() {
	//	Notebooks.click();
	//}
	
	public void clickaddwishlist() {
		firstitem.click();
	}

}