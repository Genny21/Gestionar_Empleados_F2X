package com.gestionar.empleados.f2x.tasks.usuarios.CrearUsuarios;

import com.gestionar.empleados.f2x.helpers.TestEnvironments;
import com.gestionar.empleados.f2x.models.Usuario;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static com.gestionar.empleados.f2x.helpers.Constants.CREAR_USER;
import static com.gestionar.empleados.f2x.helpers.Constants.HEADER_VALUE_CONTEN_TYPE;


public class CrearUsuarios implements Task {

    private final Usuario usuario;


    public CrearUsuarios(Usuario usuario) {
        this.usuario = usuario;

    }

    public static Performable withinfo(Usuario usuario) {
        return Instrumented.instanceOf(CrearUsuarios.class).withProperties(usuario);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       String endpoint = TestEnvironments.getProperty(CREAR_USER);
        actor.attemptsTo(
                Post.to(endpoint)
                        .with(request -> request
                               // .header("Content-Type", HEADER_VALUE_CONTEN_TYPE)
                                .body(usuario))
        );
    }

}



