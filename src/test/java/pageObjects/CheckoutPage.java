package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Locators
    private final By firstNameField = By.id("input-payment-firstname");
    private final By lastNameField = By.id("input-payment-lastname");
    private final By emailField = By.id("input-payment-email");
    private final By phoneField = By.id("input-payment-telephone");
    private final By addressField = By.id("input-payment-address-1");
    private final By cityField = By.id("input-payment-city");
    private final By postCodeField = By.id("input-payment-postcode");
    private final By countryDropdown = By.id("input-payment-country");
    private final By regionDropdown = By.id("input-payment-zone");
    private final By continueButton = By.id("button-payment-address");

    private void type(By locator, String value) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(value);
    }

    private void click(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    // Actions
    public void fillCheckoutForm(String fName, String lName, String email, String phone, String addr, String city, String postCode, String country) {
        type(firstNameField, fName);
        type(lastNameField, lName);
        type(emailField, email);
        type(phoneField, phone);
        type(addressField, addr);
        type(cityField, city);
        type(postCodeField, postCode);
        type(countryDropdown, country);
        click(continueButton);
    }

    public void clickContinue() {
        click(continueButton);
    }
}
