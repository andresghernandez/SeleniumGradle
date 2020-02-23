package SeleniumGradle.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/RegistroUsuario.feature",
		glue = "",
		snippets = SnippetType.CAMELCASE,
		tags = {"@registro"} // Si se deja tags = {""} se ejecutan todo los escenarios de feature
		)

public class RegistroUsuarioRunner {
	
}
