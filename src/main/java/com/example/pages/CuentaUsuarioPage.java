package com.example.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class CuentaUsuarioPage extends PageObject {
	
	@FindBy(xpath = "//*[contains(text(),'Thank you')]")
	WebElementFacade lblRegister;
	
	@Step
	public boolean cuentaCreada() {
		//waitFor(ExpectedConditions.visibilityOf(lblRegister));
		getDriver().manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		boolean registroExitoso = false;
		if (lblRegister.getText().contains("Thank you")) {
			registroExitoso = true;
		}
		return registroExitoso;
	}
	
}
