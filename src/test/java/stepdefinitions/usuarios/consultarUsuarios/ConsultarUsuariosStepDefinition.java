package stepdefinitions.usuarios.consultarUsuarios;

import com.gestionar.empleados.f2x.questions.ValidarStatus;
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

public class ConsultarUsuariosStepDefinition {


    @Given("Que {word} se encuentra en la plataforma de gestion de usuarios")
    public void queGennySeEncuentraEnLaPlataformaDeGestionDeUsuarios(String actor) {
        OnStage.
                setTheStage(
                        new OnlineCast()
                );
        theActorCalled(actor).
        whoCan(CallAnApi.at(BASE_URL));

    }
    @When("Realiza la busqueda de la lista de usuarios")
    public void realizaLaBusquedaDeLaListaDeUsuarios() {

        theActorInTheSpotlight()
                .attemptsTo(
                        ConsultarUsuarios.listUsers()
                );

    }
    @Then("Se respondera exitosamente con los resultados esperados")
    public void seResponderaExitosamenteConLosResultadosEsperados() {
        theActorInTheSpotlight()
                .asksFor(
                        ValidarStatus.validar()
                );

    }

}
