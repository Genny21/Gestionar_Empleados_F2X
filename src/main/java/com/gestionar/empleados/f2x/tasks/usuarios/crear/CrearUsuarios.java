package com.gestionar.empleados.f2x.tasks.usuarios.crear;

import com.gestionar.empleados.f2x.helpers.TestEnvironments;
import com.gestionar.empleados.f2x.models.Usuario;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static com.gestionar.empleados.f2x.helpers.Constants.CREAR_USER;
import static com.gestionar.empleados.f2x.helpers.Constants.HEADER_VALUE_CONTEN_TYPE;


public class CrearUsuarios implements Task {

    private final Usuario usuario;
    private String id;


    public CrearUsuarios(Usuario usuario, String id) {
        this.usuario = usuario;
        this.id = id;
    }

    public static Performable withinfo(Usuario usuario, String id) {
        return Instrumented.instanceOf(CrearUsuarios.class).withProperties(usuario, id);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       String endpoint = TestEnvironments.getProperty(CREAR_USER);
        actor.attemptsTo(
                Post.to(endpoint + id)
                        .with(request -> request
                                .header("Content-Type", HEADER_VALUE_CONTEN_TYPE)
                                .body(usuario))
        );
        // Captura la respuesta del servidor
        String responseBody = SerenityRest.lastResponse().getBody().asString();

        // Almacena la respuesta en la sesión para que pueda ser accesible por otras interacciones
        actor.remember("responseBody", responseBody);

    }

}



