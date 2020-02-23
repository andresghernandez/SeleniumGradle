package SeleniumGradle.steps;

import SeleniumGradle.pages.CuentaUsuarioPage;
import SeleniumGradle.pages.RegistroUsuarioPage;
import net.thucydides.core.annotations.Step;

public class RegistroUsuarioStep {
	
	RegistroUsuarioPage RegisterUserPage;
	CuentaUsuarioPage AccountUserPage;
	
	@Step
	public void homeRegister() {
		RegisterUserPage.open();
	}
	
	@Step
	public void ingresarDatosRegistro(String primerNombre, String segundoNombre, String apellido, String correo, String password, String confirmPassword) {
		RegisterUserPage.datosRegistroUsuario(primerNombre, segundoNombre, apellido, correo, password, confirmPassword);
	}
	
	@Step
	public boolean cuentaCreadaExitosamente() {
		return AccountUserPage.cuentaCreada();
	}
}
