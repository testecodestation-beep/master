package Steps;

import Elemento.Elementos;
import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	Elementos e = new Elementos();
	Metodos m = new Metodos();

	@Given("que acesse o banco inter")
	public void que_acesse_o_banco_inter() {
	  m.abrirNavegador("https://inter.co/");
	}
	@Given("que acesse o ambiente de testes {string}")
	public void que_acesse_o_ambiente_de_testes(String url) {
	  m.abrirNavegador(url); 
	}

	@When("clicar no botao abra sua conta")
	public void clicar_no_botao_abra_sua_conta() throws InterruptedException {
		m.pausa(15000);
		m.clicar(e.getBtnAbraSuaConta());
	    
	}

	@When("preencher o formulario de abertura de conta")
	public void preencher_o_formulario_de_abertura_de_conta() throws InterruptedException {
		m.pausa(3000);
		m.preencherCampo("samuel xavier", e.getCampoNome());
	    
	}

	@When("clicar no checkbox autorizando")
	public void clicar_no_checkbox_autorizando() {
	   m.clicar(e.getTermoAceite());
	}

	@When("clicar no botao continuar")
	public void clicar_no_botao_continuar() {
	 m.clicar(e.getBtnContinuar());  
	}

	@Then("valido o texto Prontinho recebemos os seu dados")
	public void valido_o_texto_prontinho_recebemos_os_seu_dados() {
	   
	}
	@When("preencher o formulario de abertura de conta com {string} {string} {string} {string} {string}")
	public void preencher_o_formulario_de_abertura_de_conta_com(String nome, String telefone, String cpf, String dtonascimento, String email) throws InterruptedException {
	    m.pausa(5000);
		m.preencherCampo(nome,e.getCampoNome());
	    m.preencherCampo(telefone, e.getCampoTelefone());
	    m.preencherCampo(cpf, e.getCampoCpf());
	    m.preencherCampo(dtonascimento, e.getCampoDataNascimento());
	    m.preencherCampo(email, e.getCampoEmail());
	}
	@When("clicar no botao abrir conta")
	public void clicar_no_botao_abrir_conta() {
		m.clicar(e.getBtnAbrirConta());
	  
	}

	@When("preencher o formulario de abertura de conta com {string} {string}")
	public void preencher_o_formulario_de_abertura_de_conta_com(String nome, String cnpj) throws InterruptedException {
		m.pausa(5000);
		m.preencherCampo(nome, e.getCampoNomeEmpresa());
		m.preencherCampo(cnpj, e.getCampoCnpj());
	    
	}

}
