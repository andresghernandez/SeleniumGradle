package com.example.pages;

import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import java.util.concurrent.TimeUnit;


@DefaultUrl("page:webdriver.base.url")
public class RegistroUsuarioPage extends PageObject {

	@FindBy(xpath = "//*[@name='firstName']")
	WebElementFacade txtFirstName;
	@FindBy(xpath = "//*[@name='middlename']")
	WebElementFacade txtSecondName;	
	@FindBy(xpath = "//*[@name='lastName']")
	WebElementFacade txtLastName;
	@FindBy(xpath = "//*[@name='email']")
	WebElementFacade txtEmail;
	@FindBy(xpath = "//*[@name='password']")
	WebElementFacade txtPassword;	
	@FindBy(xpath = "//*[@name='confirmPassword']")
	WebElementFacade txtConfirmPassword;		
	@FindBy(xpath = "//*[contains(@name,'submit')]")
	WebElementFacade btnRegister;	
	
	public void datosRegistroUsuario(String primerNombre, String segundoNombre, String apellido, String correo, String password, String confirmPassword ) {
		this.getDriver().manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		txtFirstName.sendKeys(primerNombre);
		//txtSecondName.sendKeys(segundoNombre);
		txtLastName.sendKeys(apellido);
		txtEmail.sendKeys(correo);
		txtPassword.sendKeys(password);
		txtConfirmPassword.sendKeys(confirmPassword);
		btnRegister.click();
	}
	
}
