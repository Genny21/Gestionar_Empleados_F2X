package com.gestionar.empleados.f2x.helpers;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.configuration.SystemPropertiesConfiguration;
import net.thucydides.core.util.EnvironmentVariables;
import com.gestionar.empleados.f2x.helpers.Constants;
import net.thucydides.core.util.SystemEnvironmentVariables;
import net.thucydides.core.webdriver.Configuration;


public final class TestEnvironments {

    private static final Configuration<?> CONFIGURATION = new SystemPropertiesConfiguration(
            SystemEnvironmentVariables.createEnvironmentVariables());
    private static final EnvironmentVariables ENVIRONMENT_VARIABLES = CONFIGURATION
            .getEnvironmentVariables();
    private TestEnvironments() {
    }
    public static String getProperty(String nameProperty) {
        return EnvironmentSpecificConfiguration.from(ENVIRONMENT_VARIABLES).getProperty(nameProperty);
    }

}

