package com.gestionar.empleados.f2x.tasks.usuarios.consultarUsuarios;

import com.gestionar.empleados.f2x.helpers.TestEnvironments;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static com.gestionar.empleados.f2x.helpers.Constants.USER;



public class ConsultarUsuarioId implements Task {

    private int id;

    public ConsultarUsuarioId(int id) {
        this.id = id;
    }

    public static Performable withId(int id) {
        return Instrumented.instanceOf(ConsultarUsuarioId.class).withProperties(id);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String endpoint = TestEnvironments.getProperty(USER);
        actor.attemptsTo(
                Get.resource(
                        endpoint + id
                )
        );
    }

}



