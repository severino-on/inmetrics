/**
 * 
 */
package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author severino
 *
 */
public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}

	private By userNameTexbox = By.xpath("(//input[@name='login'])[2]");
	private By userPasswordTexbox = By.xpath("(//input[@name='password'])[2]");
	private By loginButton = By.linkText("Sign in");
	private By logarButton = By.xpath("(//a[contains(text(),'Sign in')])[3]");

	public void clickLogin() {
		driver.findElement(loginButton).click();

	}

	public void clickLogar() {

		driver.findElement(logarButton).click();
	}

	public void setUserName(String userName) {

		driver.findElement(userNameTexbox).sendKeys(userName);

	}

	public void setPassword(String password) {
		driver.findElement(userPasswordTexbox).sendKeys(password);
	}

}
