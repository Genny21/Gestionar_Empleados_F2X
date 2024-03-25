package com.gestionar.empleados.f2x.tasks.usuarios.eliminar;

import com.gestionar.empleados.f2x.helpers.TestEnvironments;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Delete;
import net.serenitybdd.screenplay.rest.interactions.Put;

import static com.gestionar.empleados.f2x.helpers.Constants.USER;


public class EliminarUsuarioId implements Task {

    private int id;

    public EliminarUsuarioId(int id) {
        this.id = id;
    }

    public static Performable withId(int id) {
        return Instrumented.instanceOf(EliminarUsuarioId.class).withProperties(id);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String endpoint = TestEnvironments.getProperty(USER);
        actor.attemptsTo(
                Delete.from(
                        endpoint + id
                )
        );
    }

}



