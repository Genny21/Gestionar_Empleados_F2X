package com.gestionar.empleados.f2x.tasks.usuarios.consultar;

import com.gestionar.empleados.f2x.helpers.TestEnvironments;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static com.gestionar.empleados.f2x.helpers.Constants.USERS;


public class ConsultarUsuarios implements Task {

    public static Performable listUsers() {
        return Instrumented.instanceOf(ConsultarUsuarios.class).withProperties();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String endpoint = TestEnvironments.getProperty(USERS);
        actor.attemptsTo(
                Get.resource(
                        endpoint
                )
        );
    }

}



