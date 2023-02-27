package com.example.steps;

import com.example.pages.CuentaUsuarioPage;
import com.example.pages.RegistroUsuarioPage;

import net.thucydides.core.annotations.Step;

public class RegistroUsuarioStep {
	
	RegistroUsuarioPage registerUserPage;
	CuentaUsuarioPage accountUserPage;
	
	@Step
	public void homeRegister() {
		registerUserPage.open();
	}
	
	@Step
	public void ingresarDatosRegistro(String primerNombre, String segundoNombre, String apellido, String correo, String password, String confirmPassword) {
		registerUserPage.datosRegistroUsuario(primerNombre, segundoNombre, apellido, correo, password, confirmPassword);
	}
	
	@Step
	public boolean cuentaCreadaExitosamente() {
		registerUserPage.ingresar();
		return accountUserPage.cuentaCreada();
	}
}
