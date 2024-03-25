package stepdefinitions.usuarios.crear;

import com.gestionar.empleados.f2x.models.Usuario;
import com.gestionar.empleados.f2x.questions.ValidarStatusBad;
import com.gestionar.empleados.f2x.questions.ValidarStatusCorrectoCrear;
import com.gestionar.empleados.f2x.questions.ValidarUsuarioCreado;
import com.gestionar.empleados.f2x.tasks.usuarios.crear.CrearUsuarios;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CrearUsuariosStepDefinition {


    @When("Envia la informacion requerida con {word} para su registro")
    public void enviaLaInformacionRequeridaParaSuRegistro(String id) {

        Usuario usuario = new Usuario.Builder()
                .withUsername("genny")
                .withEmail("genny@example.com")
                .withPassword("password123")
                .build();

        theActorInTheSpotlight()
                .attemptsTo(
                        CrearUsuarios.withinfo(usuario, id)
        );

    }

    @When("No envia la informacion valida requerida con {word} para su registro")
    public void noEnviaLaInformacionValidaRequeridaConIdParaSuRegistro(String id) {

        Usuario usuario = new Usuario.Builder()
                .withUsername("genny")
                .withEmail("genny@example.com")
                .withPassword("password123")
                .build();

        theActorInTheSpotlight()
                .attemptsTo(
                        CrearUsuarios.withinfo(usuario, id)
                );

    }
    @Then("Se respondera con los resultados esperados")
    public void seResponderaConLosResultadosEsperados() {
        theActorInTheSpotlight()
                .asksFor(
                        ValidarStatusBad.validarBad()
                );

    }

    @And("Se mostrara la informacion del usuario creado")
    public void seMostraraLaInformacionDelUsuarioCreado() {
        theActorInTheSpotlight().should(
                seeThat("el usuario se registra con éxito",
                        ValidarUsuarioCreado.validarUserName("genny"))
        );
    }

    @When("No envia la informacion requerida con {word} para su registro")
    public void noEnviaLaInformacionRequeridaConIdParaSuRegistro(String id) {

        Usuario usuario = new Usuario.Builder()
                .withUsername("")
                .withEmail("")
                .withPassword("")
                .build();

        theActorInTheSpotlight()
                .attemptsTo(
                        CrearUsuarios.withinfo(usuario, id)
                );

    }

    @Then("Se respondera exitosamente la creacion del usuario")
    public void seResponderaExitosamenteLaCreacionDelUsuario() {
        theActorInTheSpotlight()
                .asksFor(
                        ValidarStatusCorrectoCrear.validar()
                );

    }

}
