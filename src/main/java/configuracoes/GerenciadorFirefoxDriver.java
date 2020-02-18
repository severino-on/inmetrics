package configuracoes;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

/**
 * @author severino
 *
 */
public class GerenciadorFirefoxDriver extends GerenciadorDeDriver {

	@Override
	public void createWebDriver() {
		FirefoxOptions options = new FirefoxOptions();
		this.driver = new FirefoxDriver(options);
	}

}
