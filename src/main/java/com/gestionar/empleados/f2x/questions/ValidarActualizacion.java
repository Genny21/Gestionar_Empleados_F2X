package com.gestionar.empleados.f2x.questions;

import com.gestionar.empleados.f2x.helpers.Constants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.rest.interactions.Ensure;

import static org.hamcrest.Matchers.notNullValue;


public class ValidarActualizacion implements Question<Boolean> {

    public static ValidarActualizacion validarActualizar(){
        return new ValidarActualizacion();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        actor.attemptsTo(
                Ensure.that(Constants.MSJ_ACTUALIZACION, validatableResponse -> validatableResponse
                        .body("updatedAt", notNullValue()))
        );
        return true;
    }
}
