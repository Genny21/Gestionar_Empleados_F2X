package stepdefinitions.usuarios.actualizar;

import com.gestionar.empleados.f2x.questions.ValidarActualizacion;
import com.gestionar.empleados.f2x.questions.ValidarInfomacionExiste;
import com.gestionar.empleados.f2x.tasks.usuarios.actualizar.ActualizarUsuarioId;
import com.gestionar.empleados.f2x.tasks.usuarios.consultar.ConsultarUsuarioId;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ActualizarUsuariosStepDefinition {

    @When("Realiza la actualizacion del usuario con {int}")
    public void realizaLaActualizacionDelUsuarioCon(Integer id) {

        theActorInTheSpotlight()
                .attemptsTo(
                        ActualizarUsuarioId.withId(id)
                );
    }
    @Then("Se confirmara la actualizacion exitosa")
    public void seConfirmaraLaActualizacionExitosa() {

        theActorInTheSpotlight()
                .asksFor(
                        ValidarActualizacion.validarActualizar()
                );

    }



}
