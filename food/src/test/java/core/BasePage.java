package core;

import org.openqa.selenium.By;

public class BasePage {
	
	//------------------------- Escrita ---------------------------------------//

		public static void escrever(String id_campo, String texto){
			DriverFactory.iniciarDriver().findElement(By.xpath(id_campo)).clear();
			DriverFactory.iniciarDriver().findElement(By.xpath(id_campo)).sendKeys(texto);

		}


		//------------------------- Obter Texto ---------------------------------//

		public static String obterValorTexto(String id_campo){
			return DriverFactory.iniciarDriver().findElementByXPath(id_campo).getText();
		}

		//------------------------- Clicar -------------------------------------//

		public static void clicar(String id_campo){
			DriverFactory.iniciarDriver().findElementByXPath(id_campo).click();
		}


		//------------------------- Visível? ----------------------------------//

		public boolean campoSelecionado(String id_campo){
			return DriverFactory.iniciarDriver().findElementByXPath(id_campo).isSelected(); 
		}
	}
