package funcionalidades;

import org.openqa.selenium.WebDriver;

import pageobjects.PaginaInicialPage;
import util.Navegador;

public class PaginaInicialFuncionalidade {

	private WebDriver driver;
	private PaginaInicialPage paginaInicial;
	private String url = "http://www.cea.com.br/";

	public PaginaInicialFuncionalidade (){
		driver = Navegador.getChromeDriver();
		paginaInicial = new PaginaInicialPage(driver);		

	}
	public void login(){
		driver.get(url);
	}

	public boolean isPaginaInicial(){
		if(paginaInicial.getURL().contains("cea")){
			return true;
		}return false;
	}

}
