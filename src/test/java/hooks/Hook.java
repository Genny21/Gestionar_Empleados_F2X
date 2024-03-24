package hooks;

import actors.ApiCast;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.util.EnvironmentVariables;

public class Hook {

    private EnvironmentVariables environmentVariables;

    @Before
    public void settingTheStage() {
        OnStage.setTheStage(
                new ApiCast(environmentVariables)
        );
    }
}
