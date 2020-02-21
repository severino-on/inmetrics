/**
 * 
 */
package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import PageObjects.TaskPage;
import configuracoes.DriverManagerFactory;
import configuracoes.DriverType;
import configuracoes.GerenciadorDeDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author severino
 *
 */
public class StepTask {
	public static GerenciadorDeDriver gerenciadorDeDriver;
	public static WebDriver driver;
	//LoginPage loginPage = new LoginPage(driver);

	@Before
	public void acessarLogin() {
		gerenciadorDeDriver = DriverManagerFactory.getGerenciadorDeDriver(DriverType.FIREFOX);
		driver = gerenciadorDeDriver.getWebDriver();
		driver.get("http://www.juliodelima.com.br/taskit/");
	}

	@Given("Entrar na url")
	public void entrar_na_url() {

	}

	@Given("clicar login")
	public void clicar_login() {
		driver.findElement(By.linkText("Sign in")).click();

	}

	@Given("informar usuario {string}")
	public void informar_usuario(String usuario) {
		TaskPage loginPage = new TaskPage(driver);
		loginPage.setUserName(usuario);

	}

	@When("informar a senha {string}")
	public void informar_a_senha(String senha) {
		TaskPage loginPage = new TaskPage(driver);
		loginPage.setPassword(senha);
	}

	@When("clico login")
	public void clico_login() throws Exception {
		TaskPage loginPage = new TaskPage(driver);
		loginPage.clickLogar();
		Thread.sleep(1000);

	}

	
	@Then("clico em acionar task")
	public void clico_em_acionar_task() throws Exception {
	TaskPage loginPage = new TaskPage(driver);
	loginPage.clicarAdicionarTaks();
	}
	@Given("que o usuario esteja no formulario de cadastro de task")
	public void que_o_usuario_esteja_no_formulario_de_cadastro_de_task() {
		

	}

	@Given("informar titulo da task {string}")
	public void informar_titulo_da_task(String string) {
		TaskPage loginPage = new TaskPage(driver);
		loginPage.preencheTitulo(string);

	}

	@Given("selecionar data limite")
	public void selecionar_data_limite() throws Exception {
		TaskPage loginPage = new TaskPage(driver);
		loginPage.data();

		
	}

	@Given("hora limite")
	public void hora_limite() {
		TaskPage loginPage = new TaskPage(driver);
		loginPage.hora();
	}

	@When("informar descricao sobre a task {string}")
	public void informar_descricao_sobre_a_task(String string) {
		TaskPage loginPage = new TaskPage(driver);
		loginPage.descricaoTask(string);
	}
	
	@Then("clico no botao salvar")
	public void clico_no_botao_salvar() {
		TaskPage loginPage = new TaskPage(driver);
		loginPage.salvarTaks();
	}

}
