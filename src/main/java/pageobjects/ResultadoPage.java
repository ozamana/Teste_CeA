package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultadoPage extends Page{

	public ResultadoPage(WebDriver driver) {
		super(driver);
		
	}
	
	public WebElement getPerguntasFrequentes(){
		return getElement("//li[@class='list-inline_item']//*[@href='http://atendimentocea.zendesk.com']");
	}
	
	public void clickPerguntasFrequentes(){
		getPerguntasFrequentes().click();
	}
	
	public WebElement getPerguntas(){
		
		return getElement("//h3[@class='p-art-title' and contains (text(),'Quais as condi��es de Troca & Devolu��o')]");
	}
	
	public void clickPerguntas(){
		
		getPerguntas().click();
		
	}
	
	public WebElement getTextFrequentes(){
		
		return getElement("//ul[@id='r1a']//li");
	}
	
	public String getTextPerguntas(){
		
		return getTextFrequentes().getText();
	}
	
	public WebElement getInstitucional(){
		
		return getElement("//*[contains(text(),'LOJA F�SICA')]/following::li[6]");

	}
	
	public void clickInstitucional(){
		
		getInstitucional().click();
	}
	
	public WebElement getTelefoneCartao(){
		
		return getElement("//*[@class='section-tree']/descendant::li[1]");
		
	}
	
	public WebElement getTelefone(){
		return getElement("//a[contains(text(),'Telefone do Cart�o C&A')]");
	}
	public void clickTelefoneCartao(){
		
		getTelefone().click();
	}
	
	public WebElement getAtendimentoLoja(){
		
		return getElement("//*[@class='section-tree']/descendant::li[2]");
	}
	
	public WebElement getOndeLocalizar(){
		
		return getElement("//*[@class='section-tree']/descendant::li[3]");
	}
	
	public WebElement getComprarCartao(){
		
		return getElement("//*[@class='section-tree']/descendant::li[4]");
		
	}
	
	public WebElement getEnviarCurriculo(){
		
		return getElement("//*[@class='section-tree']/descendant::li[5]");
		
	}
	
	public WebElement getImg(){
		return getElement("//h1[contains(text(),'Telefone do Cart�o C&A')]/following::img[1]");
		
	}
	
}
