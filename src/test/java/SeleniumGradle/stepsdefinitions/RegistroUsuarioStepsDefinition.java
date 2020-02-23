package SeleniumGradle.stepsdefinitions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import SeleniumGradle.utils.Excel;
import SeleniumGradle.steps.RegistroUsuarioStep;
import SeleniumGradle.utils.DataDrivenExcel;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.thucydides.core.annotations.Steps;

public class RegistroUsuarioStepsDefinition {
	
	DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
	Map<String, String> data = new HashMap<String, String>();
	
	@Steps
	RegistroUsuarioStep RegisterStep;
	
	//Register User
	
	@Given("^que estoy en la pagina de registro (.*)$")
	public void queEstoyEnLaPaginaDeRegistro(int row, DataTable dataExcel){
		List<Map<String, String>> dataFeature = dataExcel.asMaps(String.class, String.class);
		Excel excel = new Excel(dataFeature.get(0).get("Ruta Excel"), dataFeature.get(0).get("Pesta�a"), true, row);
		data = dataDriverExcel.leerExcel(excel);
		RegisterStep.homeRegister();
		//Para traer los datos usuario y contrase�a escritos en el feature
		//RegisterStep.iniciarSesionRegistrado(dataFeature.get(0).get("Usuario"), dataFeature.get(0).get("Contrase�a"));
		
	}
	
    @When("^realizo el registro de los datos$")
    public void realizoElRegistroDeLosDatos() {
    	RegisterStep.ingresarDatosRegistro(data.get("Primer Nombre"), data.get("Segundo Nombre"), data.get("Apellido"), data.get("Correo"), data.get("Password"), data.get("Confirmar Password"));
    }
    
    @Then("^puedo finalizar la creacion del usuario$")
    public void puedoFinalizarLaCreacionDelUsuario() {
    	Assert.assertTrue("Registro No Exitoso", RegisterStep.cuentaCreadaExitosamente());
    }
	
}
