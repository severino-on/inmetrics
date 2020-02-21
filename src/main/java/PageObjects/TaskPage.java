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
public class TaskPage {
	WebDriver driver;

	public TaskPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	private By userNameTexbox = By.xpath("(//input[@name='login'])[2]");
	private By userPasswordTexbox = By.xpath("(//input[@name='password'])[2]");
	private By loginButton = By.linkText("Sign in");
	private By logarButton = By.xpath("(//a[contains(text(),'Sign in')])[3]");
	private By add = By.linkText("My tasks");
	private By addTask = By.xpath("//button");
	private By tituloTask = By.name("title");
	private By calendario = By.xpath("//button[@type='button']");
	private By selecionaData = By.xpath("(//button[@type='button'])[3]");
	private By hora = By.name("time");
	private By selecionaHora = By.xpath("(//button[@type='button'])[6]");
	private By descricao = By.name("text");
	private By salvarTask = By.xpath("//a[contains(text(),'Save')]");

	
	
	
	
	
	
	
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

	public void clicarAdicionarTaks() {
		driver.findElement(add).click();
		driver.findElement(addTask).click();

	}

	public void preencheTitulo(String titulo) {
		driver.findElement(tituloTask).sendKeys(titulo);
	}

	public void data() throws Exception {
		driver.findElement(By.name("date")).click();

		driver.findElement(calendario).click();
		driver.findElement(selecionaData).click();

	}

	public void hora() {
		driver.findElement(hora).click();
		driver.findElement(selecionaHora).click();
	}

	public void descricaoTask(String descricaotask) {
		driver.findElement(descricao).sendKeys(descricaotask);
	}

	public void salvarTaks() {
		//driver.findElement(salvarTask);
		driver.findElement(By.xpath("//div[@id='addtask']/div")).click();
		driver.getClass();
	    driver.findElement(salvarTask).click();

	}
}
