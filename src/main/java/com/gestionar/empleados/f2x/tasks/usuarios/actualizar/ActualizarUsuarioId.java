package com.gestionar.empleados.f2x.tasks.usuarios.actualizar;

import com.gestionar.empleados.f2x.helpers.TestEnvironments;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Put;

import static com.gestionar.empleados.f2x.helpers.Constants.USER;


public class ActualizarUsuarioId implements Task {

    private int id;

    public ActualizarUsuarioId(int id) {
        this.id = id;
    }

    public static Performable withId(int id) {
        return Instrumented.instanceOf(ActualizarUsuarioId.class).withProperties(id);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String endpoint = TestEnvironments.getProperty(USER);
        actor.attemptsTo(
                Put.to(
                        endpoint + id
                )
        );
    }

}



