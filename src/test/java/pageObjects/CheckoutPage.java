package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage {

    private final WebDriver driver;

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

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators

    // Actions
    public void fillCheckoutForm(String fName, String lName, String email, String phone, String addr, String city, String postCode, String country) {
        fillTextField(firstNameField, fName);
        fillTextField(lastNameField, lName);
        fillTextField(emailField, email);
        fillTextField(phoneField, phone);
        fillTextField(addressField, addr);
        fillTextField(cityField, city);
        fillTextField(postCodeField, postCode);
        selectDropdownByVisibleText(countryDropdown, country);
        driver.findElement(continueButton).click();
    }

    public void clickContinue() {
        driver.findElement(continueButton).click();
    }

    private void fillTextField(By field, String value) {
        driver.findElement(field).clear();
        driver.findElement(field).sendKeys(value);
    }

    private void selectDropdownByVisibleText(By dropdown, String value) {
        new Select(driver.findElement(dropdown)).selectByVisibleText(value);
    }
}
