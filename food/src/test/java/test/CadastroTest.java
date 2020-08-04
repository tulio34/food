package test;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import core.BaseTest;
import page.BoasVindasPage;
import page.CadastroPage;
import page.CodigoVerificacaoPage;
import page.HomePage;
import page.TutorialPage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CadastroTest extends BaseTest{

	CadastroPage cadastroPage = new CadastroPage();
	private static CodigoVerificacaoPage codigoVerificacaoPage = new CodigoVerificacaoPage();
	private static HomePage homePage = new HomePage();
	private static BoasVindasPage boasVindasPage = new BoasVindasPage();
	private static TutorialPage tutorialPage = new TutorialPage();
	
	
	@Before
	public void pularPassos(){
		tutorialPage.clicarSkip();
		boasVindasPage.clicarIamNew();
	}
	@Test
	public void test1_CadastrarSucesso(){
		cadastroPage.preencherTodosCampos();
		codigoVerificacaoPage.clicar4vezes1();
		codigoVerificacaoPage.clicarBtnSubmitCode();
		org.junit.Assert.assertEquals("Categories", homePage.obterTextoTituloCategories());
		org.junit.Assert.assertEquals("Popular", homePage.obterTextoTituloPopular());
	}
	@Test
	public void CadastrarSucessoCamposVazios(){
		cadastroPage.preencherTodosCamposVazio();
		cadastroPage.clicarBtnCriarConta();
		codigoVerificacaoPage.clicar4vezes1();
		codigoVerificacaoPage.clicarBtnSubmitCode();
		org.junit.Assert.assertEquals("Categories", homePage.obterTextoTituloCategories());
		org.junit.Assert.assertEquals("Popular", homePage.obterTextoTituloPopular());
	}
	@Test
	public void CriarContaComFacebook(){
		cadastroPage.clicarBtnCriarContaFacebook();
		codigoVerificacaoPage.clicar4vezes1();
		codigoVerificacaoPage.clicarBtnSubmitCode();
		org.junit.Assert.assertEquals("Categories", homePage.obterTextoTituloCategories());
		org.junit.Assert.assertEquals("Popular", homePage.obterTextoTituloPopular());
	}
	@Test
	public void CriarContaComGoogle(){
		cadastroPage.clicarBtnCriarContaGoogle();
		codigoVerificacaoPage.clicar4vezes1();
		codigoVerificacaoPage.clicarBtnSubmitCode();
		org.junit.Assert.assertEquals("Categories", homePage.obterTextoTituloCategories());
		org.junit.Assert.assertEquals("Popular", homePage.obterTextoTituloPopular());
	}
}
