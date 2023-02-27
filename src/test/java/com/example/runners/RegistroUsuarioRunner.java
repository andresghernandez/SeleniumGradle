package com.example.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/RegistroUsuario.feature",
		glue = "com.example.stepsdefinitions",
		snippets = SnippetType.CAMELCASE,
		tags = {"@registro"}
		)

public class RegistroUsuarioRunner {
	
}
