package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart extends BasePage {

	public AddToCart(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//button[@class='btn btn-primary']//i[@class='fa fa-shopping-cart']")
	private WebElement addtocart;
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addtocart1;
	/*@FindBy(xpath = "//input[@id='input-option225']")
	WebElement txtdeliverydate;
	
	@FindBy(xpath = "//input[@id='input-quantity']")
	WebElement txtquantity;
	@FindBy(xpath = "//button[@id='button-cart']")
	WebElement btnAddToCart;*/
	
	public void clickAddToCart() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(addtocart)).click();
	}
	
	/*public void setDeliveryDate(String delivery) {
		txtdeliverydate.sendKeys("2024-02-21");
	}
	
	public void settxtquantity(String qnt) {
		txtquantity.sendKeys("5");
	}

	public void clickAddCart() {
		btnAddToCart.click();
	}*/
	
	public void clickAddToCarts() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(addtocart1)).click();
	}
}
 