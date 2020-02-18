/**
 * 
 */
package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import PageObjects.AdicionarTaskPage;
import configuracoes.GerenciadorDeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

/**
 * @author severino
 *
 */
public class DadosTask {
	public static GerenciadorDeDriver gerenciadorDeDriver;
	public static WebDriver driver;

	@Given("que o usuario esteja no formulario de cadastro de task")
	public void que_o_usuario_esteja_no_formulario_de_cadastro_de_task() {
		AdicionarTaskPage adicionarTaskPageObject = new AdicionarTaskPage();
		adicionarTaskPageObject.clicarAdicionarTaks();
	}

	@Given("informar titulo da task {string}")
	public void informar_titulo_da_task(String string) {
		
	}

	@Given("selecionar data limite")
	public void selecionar_data_limite() {

	}

	@Given("hora limite")
	public void hora_limite() {

	}

	@When("informar descricao sobre a task {string}")
	public void informar_descricao_sobre_a_task(String string) {

	}

}
