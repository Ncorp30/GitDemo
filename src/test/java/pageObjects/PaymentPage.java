package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage {

    WebDriver driver;

    private static final String SANDBOX_CARD_NUMBER = "4111111111111111";
    private static final String SANDBOX_CARD_EXPIRY = "12/30";
    private static final String SANDBOX_CARD_CVV = "123";

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By paymentMethodRadioButton = By.name("payment_method");
    By creditCardOption = By.id("payment-method-credit-card");
    By cardNumberField = By.id("input-payment-card-number");
    By cardExpiryField = By.id("input-payment-card-expiry");
    By cardCVVField = By.id("input-payment-card-cvv");
    By continueButton = By.id("button-payment-method");
    By confirmOrderButton = By.id("button-confirm");

    // Actions
    public void selectPaymentMethod(String method) {
        if (method.equalsIgnoreCase("Credit Card")) {
            driver.findElement(paymentMethodRadioButton).click();  // Selecting payment method
            driver.findElement(creditCardOption).click();  // Choose Credit Card option
        }
        // Add more conditions here for other payment methods
    }

    public void fillCardDetails(String cardNumber, String expiryDate, String cvv) {
        driver.findElement(cardNumberField).sendKeys(SANDBOX_CARD_NUMBER);
        driver.findElement(cardExpiryField).sendKeys(SANDBOX_CARD_EXPIRY);
        driver.findElement(cardCVVField).sendKeys(SANDBOX_CARD_CVV);
    }

    public void clickContinue() {
        driver.findElement(continueButton).click();
    }

    public void clickConfirmOrder() {
        driver.findElement(confirmOrderButton).click();
    }

    public String getConfirmationMessage() {
        // This is just an example, modify based on your confirmation message locator
        By confirmationMessage = By.xpath("//div[@class='alert alert-success']");
        return driver.findElement(confirmationMessage).getText();
    }
}