package com.gestionar.empleados.f2x.questions;

import com.gestionar.empleados.f2x.helpers.Constants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.rest.interactions.Ensure;
import org.apache.http.HttpStatus;


public class ValidarStatusBad implements Question<Boolean> {

    public static ValidarStatusBad validarBad(){
        return new ValidarStatusBad();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        actor.attemptsTo(
                Ensure.that(Constants.MSJ_VALIDACION_CODIGO_BAD, validatableResponse -> validatableResponse
                        .statusCode(HttpStatus.SC_BAD_REQUEST))
        );
        return true;
    }
}
