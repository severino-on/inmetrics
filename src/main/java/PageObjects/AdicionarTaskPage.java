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
public class AdicionarTaskPage {
	WebDriver driver;

	public void AdicionarTaskPageObjec(WebDriver driver) {
		this.driver = driver;

	}

	By add = By.linkText("Let's add some tasks!");
	By addTask = By.xpath("//button");
	By tituloTask = By.name("title");
	By calendario = By.xpath("//button[@type='button']");
	By selecionaData = By.xpath("(//button[@type='button'])[3]");
	By hora = By.name("time");
	By selecionaHora = By.xpath("(//button[@type='button'])[6]");
	By descricao = By.name("text");
	By salvarTask = By.linkText("Save");
	
	
	
	
	
	public void clicarAdicionarTaks() {
		driver.findElement(add).click();
		//driver.findElement(addTask).click();
	}
	
	
	
}