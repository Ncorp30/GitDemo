package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountRegistrationPage extends BasePage{
	
	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	

	private By txtFirstname = By.xpath("//input[@id='input-firstname']");

	private By txtLastname = By.xpath("//input[@id='input-lastname']");

	private By txtEmail = By.xpath("//input[@id='input-email']");

	private By txtTelephone = By.xpath("//input[@id='input-telephone']");

	private By txtPassword = By.xpath("//input[@id='input-password']");

	private By txtConfirmPassword = By.xpath("//input[@id='input-confirm']");

	private By chkdPolicy = By.xpath("//input[@name='agree']");

	private By btnContinue = By.xpath("//input[@value='Continue']");

	private By msgConfirmation = By.xpath("//h1[normalize-space()='Your Account Has Been Created!']");


public void setFirstName(String fname) {
	driver.findElement(txtFirstname).sendKeys(fname);

}

public void setLastName(String lname) {
	driver.findElement(txtLastname).sendKeys(lname);

}

public void setEmail(String email) {
	driver.findElement(txtEmail).sendKeys(email);

}

public void setTelephone(String tel) {
	driver.findElement(txtTelephone).sendKeys(tel);

}

public void setPassword(String pwd) {
	driver.findElement(txtPassword).sendKeys(pwd);

}

public void setConfirmPassword(String pwd) {
	driver.findElement(txtConfirmPassword).sendKeys(pwd);

}

public void setPrivacyPolicy() {
	driver.findElement(chkdPolicy).click();

}

public void clickContinue() {
	//sol1 
	driver.findElement(btnContinue).click();
	
	//sol2 
	//btnContinue.submit();
	
	//sol3
	//Actions act=new Actions(driver);
	//act.moveToElement(btnContinue).click().perform();
				
	//sol4
	//JavascriptExecutor js=(JavascriptExecutor)driver;
	//js.executeScript("arguments[0].click();", btnContinue);
	
	//Sol 5
	//btnContinue.sendKeys(Keys.RETURN);
	
	//Sol6  
	//WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
	//mywait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();
	
}

public void fillRegistrationForm(String fname, String lname, String email, String tel, String pwd, String confirmPwd) {
	setFirstName(fname);
	setLastName(lname);
	setEmail(email);
	setTelephone(tel);
	setPassword(pwd);
	setConfirmPassword(confirmPwd);
}

public void submitRegistration() {
	setPrivacyPolicy();
	clickContinue();
}

public void registerAccount(String fname, String lname, String email, String tel, String pwd, String confirmPwd) {
	fillRegistrationForm(fname, lname, email, tel, pwd, confirmPwd);
	submitRegistration();
}

}
