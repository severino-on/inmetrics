/**
 * 
 */
package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import PageObjects.LoginPage;
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
public class DadosLogin {
	public static GerenciadorDeDriver gerenciadorDeDriver;
	public static WebDriver driver;

	@Before
	public void acessarLogin() {
		gerenciadorDeDriver = DriverManagerFactory.getGerenciadorDeDriver(DriverType.CHORME);
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
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setUserName(usuario);

	}

	@When("informar a senha {string}")
	public void informar_a_senha(String senha) {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setPassword(senha);
	}

	@When("clico login")
	public void clico_login() {	
		LoginPage loginPage = new LoginPage(driver);
	loginPage.clickLogar();

	}

	@Then("visualizo a pagina principal")
	public void visualizo_a_pagina_principal() {

	}

}
