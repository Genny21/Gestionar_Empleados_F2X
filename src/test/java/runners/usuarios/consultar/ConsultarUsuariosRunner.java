package runners.usuarios.consultar;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = {"src/test/resources/features/usuarios/consultar/consultarUsuarios.feature"},
        glue = {"stepdefinitions"},
        tags = "@UsuarioNoExiste",
        snippets = CAMELCASE,
        dryRun = false //Desactive, despues de comprobar la existencia/relacion entre enunciado gherkin y StepDefinition
)


public class ConsultarUsuariosRunner {


}
