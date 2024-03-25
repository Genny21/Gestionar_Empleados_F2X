package stepdefinitions.usuarios.crear;

import com.gestionar.empleados.f2x.models.Usuario;
import com.gestionar.empleados.f2x.questions.ValidarStatusBad;
import com.gestionar.empleados.f2x.tasks.usuarios.crear.CrearUsuarios;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CrearUsuariosStepDefinition {


    @When("Envia la informacion requerida para su registro")
    public void enviaLaInformacionRequeridaParaSuRegistro() {

        Usuario usuario = new Usuario.Builder()
                .withUsername("genny")
                .withEmail("genny@example.com")
                .withPassword("password123")
                .build();

        theActorInTheSpotlight()
                .attemptsTo(
                        CrearUsuarios.withinfo(usuario)
        );

    }

    @Then("Se respondera con los resultados esperados")
    public void seResponderaConLosResultadosEsperados() {
        theActorInTheSpotlight()
                .asksFor(
                        ValidarStatusBad.validarBad()
                );

    }

}
