package Elemento;

import org.openqa.selenium.By;

public class Elementos {
	
	private By btnAbraSuaConta = By.xpath("//button[@title='Abra sua conta']");
	private By campoNome = By.id("nome");
	private By campoTelefone = By.id("celular");
	private By campoEmail = By.id("email");
	private By campoCpf = By.id("cpf");
	private By campoDataNascimento = By.id("dataNascimento");
	private By checkboxAutorizo = By.xpath("//label[@for='conta-digital-pf']");
	private By btnContinuar = By.xpath("//button[@type='submit']");
	//elementos conta PJ
	private By campoNomeEmpresa = By.id("nome");
	private By campoCnpj = By.id("cnpj");
	private By termoAceite = By.xpath("//p[@class='sc-gEvEer dakYYp']");
	private By btnContinuarCnpj = By.xpath("//button[normalize-space()='Continuar']");
	private By btnAbrirConta = By.xpath("//button[normalize-space()='Abrir conta']");
	public By getBtnAbrirConta() {
		return btnAbrirConta;
	}
	public By getCampoNomeEmpresa() {
		return campoNomeEmpresa;
	}
	public By getCampoCnpj() {
		return campoCnpj;
	}
	public By getTermoAceite() {
		return termoAceite;
	}
	public By getBtnContinuarCnpj() {
		return btnContinuarCnpj;
	}
	
	
	public By getBtnAbraSuaConta() {
		return btnAbraSuaConta;
	}
	public By getCampoNome() {
		return campoNome;
	}
	public By getCampoTelefone() {
		return campoTelefone;
	}
	public By getCampoEmail() {
		return campoEmail;
	}
	public By getCampoCpf() {
		return campoCpf;
	}
	public By getCampoDataNascimento() {
		return campoDataNascimento;
	}
	public By getCheckboxAutorizo() {
		return checkboxAutorizo;
	}
	public By getBtnContinuar() {
		return btnContinuar;
	}
	
	

}
