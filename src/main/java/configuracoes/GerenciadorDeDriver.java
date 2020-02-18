/**
 * 
 */
package configuracoes;

import org.openqa.selenium.WebDriver;

/**
 * @author severino
 *
 */
public abstract class GerenciadorDeDriver {

	protected WebDriver driver;

	protected abstract void createWebDriver();

	public void quitWebDriver() {
		if (null != driver) {
			driver.quit();
			driver = null;
		}
	}

	public WebDriver getWebDriver() {
		if (null == driver) {
			createWebDriver();
		}
		return driver;

	}
}
