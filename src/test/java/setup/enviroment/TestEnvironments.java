package setup.enviroment;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.util.EnvironmentVariables;
import com.gestionar.empleados.f2x.helpers.Constants;


public class TestEnvironments {

    private final EnvironmentVariables environmentVariables;

    public TestEnvironments(EnvironmentVariables environmentVariables) {
        this.environmentVariables = environmentVariables;
    }

    public String getBaseUrl() {
        return EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(Constants.BASE_URL);
    }

    public String getPathUsers() {
        return EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(Constants.USERS);
    }
}
