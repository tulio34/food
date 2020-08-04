package test;

import core.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.BoasVindasPage;
import page.CadastroPage;
import page.CodigoVerificacaoPage;
import page.HomePage;
import page.TutorialPage;


public class CadastroTestWithCucumber extends BaseTest{

	CadastroPage cadastroPage = new CadastroPage();
	private static CodigoVerificacaoPage codigoVerificacaoPage = new CodigoVerificacaoPage();
	private static HomePage homePage = new HomePage();
	private static BoasVindasPage boasVindasPage = new BoasVindasPage();
	private static TutorialPage tutorialPage = new TutorialPage();
	
	@Given("um usuario que deseje se cadastrar no app ifood")
	public void um_usuario_que_deseje_se_cadastrar_no_app_ifood() {
		tutorialPage.clicarSkip();
		boasVindasPage.clicarIamNew();
	    throw new io.cucumber.java.PendingException();
	}
	
	@When("preencher os campos de <e-mail>, <phone number>, <password>")
	public void preencher_os_campos_de_e_mail_phone_number_password() {
	    cadastroPage.preencherTodosCampos();
	    throw new io.cucumber.java.PendingException();
	}

	@When("clicar no botao <CREATE ACCOUNT>")
	public void clicar_no_botao_create_account() {
		cadastroPage.clicarBtnCriarConta();
	    throw new io.cucumber.java.PendingException();
	}

	@When("preencher o <codigo de verificacao>")
	public void preencher_o_codigo_de_verificacao() {
	    codigoVerificacaoPage.clicar4vezes1();
	    throw new io.cucumber.java.PendingException();
	}

	@When("clicar no botao <SUBMIT CODE>")
	public void clicar_no_botao_submit_code() {
	    codigoVerificacaoPage.clicarBtnSubmitCode();
	    throw new io.cucumber.java.PendingException();
	}

	@Then("exibir a tela de <categories> e <Popular>")
	public void exibir_a_tela_de_categories_e_popular() {
	    org.junit.Assert.assertEquals("Categories", homePage.obterTextoTituloCategories());
		org.junit.Assert.assertEquals("Popular", homePage.obterTextoTituloPopular());
	    throw new io.cucumber.java.PendingException();
	}

	@Given("um usuario que tente se cadastrar no app sem informar nenhum campo")
	public void um_usuario_que_tente_se_cadastrar_no_app_sem_informar_nenhum_campo() {
	    cadastroPage.preencherTodosCamposVazio();
	    throw new io.cucumber.java.PendingException();
	}

	@When("clicar no botao <SIGN UP WITH FACEBOOK>")
	public void clicar_no_botao_sign_up_with_facebook() {
	    cadastroPage.clicarBtnCriarContaFacebook();
	    throw new io.cucumber.java.PendingException();
	}

	@When("clicar no botao <SIGN UP WITH GOOGLE>")
	public void clicar_no_botao_sign_up_with_google() {
	    cadastroPage.clicarBtnCriarContaGoogle();
	    throw new io.cucumber.java.PendingException();
	}
	
}
