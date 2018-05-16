package pageobjects;

import org.openqa.selenium.WebDriver;

public class PaginaInicialPage extends Page {
	
	public PaginaInicialPage(WebDriver driver){
		super (driver);	
	}
	
	public String getURL(){
		return driver.getCurrentUrl();
		
	}

}
