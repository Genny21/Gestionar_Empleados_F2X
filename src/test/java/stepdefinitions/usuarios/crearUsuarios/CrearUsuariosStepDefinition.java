package stepdefinitions.usuarios.crearUsuarios;

import com.gestionar.empleados.f2x.models.Usuario;
import com.gestionar.empleados.f2x.questions.ValidarInfomacionExiste;
import com.gestionar.empleados.f2x.questions.ValidarStatusBad;
import com.gestionar.empleados.f2x.questions.ValidarStatusCorrecto;
import com.gestionar.empleados.f2x.questions.ValidarStatusNoExiste;
import com.gestionar.empleados.f2x.tasks.usuarios.CrearUsuarios.CrearUsuarios;
import com.gestionar.empleados.f2x.tasks.usuarios.consultarUsuarios.ConsultarUsuarioId;
import com.gestionar.empleados.f2x.tasks.usuarios.consultarUsuarios.ConsultarUsuarios;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static com.gestionar.empleados.f2x.helpers.Constants.BASE_URL;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
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
