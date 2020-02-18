/**
 * 
 */
package configuracoes;

/**
 * @author severino
 *
 */
public class DriverManagerFactory {
	public static GerenciadorDeDriver getGerenciadorDeDriver(DriverType type) {
		GerenciadorDeDriver gerenciadorDeDriver;
		switch (type) {
		case CHORME:
			gerenciadorDeDriver = new GerenciadorChromeDriver();
			break;

		default:
			gerenciadorDeDriver = new  GerenciadorFirefoxDriver();
			break;
		}
		return gerenciadorDeDriver;
	}
}
