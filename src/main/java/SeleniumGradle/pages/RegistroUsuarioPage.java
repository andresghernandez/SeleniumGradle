package SeleniumGradle.pages;

import org.openqa.selenium.support.FindBy;

import SeleniumGradle.utils.Datos;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class RegistroUsuarioPage extends PageObject {

	Datos excel = null;

	@FindBy(xpath = "//*[@name='firstname']")
	WebElementFacade txtFirstName;
	@FindBy(xpath = "//*[@name='middlename']")
	WebElementFacade txtSecondName;	
	@FindBy(xpath = "//*[@name='lastname']")
	WebElementFacade txtLastName;
	@FindBy(xpath = "//*[@name='email']")
	WebElementFacade txtEmail;
	@FindBy(xpath = "//*[@name='password']")
	WebElementFacade txtPassword;	
	@FindBy(xpath = "//*[@name='confirmation']")
	WebElementFacade txtConfirmPassword;		
	@FindBy(xpath = "//span[contains(text(),'Register')]")
	WebElementFacade btnRegister;	
	
	public void datosRegistroUsuario(String primerNombre, String segundoNombre, String apellido, String correo, String password, String confirmPassword ) {
		txtFirstName.sendKeys(primerNombre);
		txtSecondName.sendKeys(segundoNombre);
		txtLastName.sendKeys(apellido);
		txtEmail.sendKeys(correo);
		txtPassword.sendKeys(password);
		txtConfirmPassword.sendKeys(confirmPassword);
		btnRegister.click();
	}
	
}
