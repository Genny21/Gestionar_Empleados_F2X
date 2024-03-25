package stepdefinitions.usuarios.eliminar;

import com.gestionar.empleados.f2x.questions.ValidarActualizacion;
import com.gestionar.empleados.f2x.questions.ValidarStatusCorrectoEliminar;
import com.gestionar.empleados.f2x.tasks.usuarios.actualizar.ActualizarUsuarioId;
import com.gestionar.empleados.f2x.tasks.usuarios.eliminar.EliminarUsuarioId;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EliminarUsuariosStepDefinition {

    @When("Realiza la eliminacion del usuario con {int}")
    public void realizaLaEliminacionDelUsuarioCon(Integer id) {
        theActorInTheSpotlight()
                .attemptsTo(
                        EliminarUsuarioId.withId(id)
                );

    }
    @Then("Se respondera exitosamente con la confirmacion correspondiente")
    public void seResponderaExitosamenteConLaConfirmacionCorrespondiente() {
        theActorInTheSpotlight()
                .asksFor(
                        ValidarStatusCorrectoEliminar.validar()
                );
    }



}
