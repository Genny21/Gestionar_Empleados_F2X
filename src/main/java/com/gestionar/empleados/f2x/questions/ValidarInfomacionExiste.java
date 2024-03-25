package com.gestionar.empleados.f2x.questions;

import com.gestionar.empleados.f2x.helpers.Constants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.rest.interactions.Ensure;
import org.apache.http.HttpStatus;

import static org.hamcrest.Matchers.notNullValue;


public class ValidarInfomacionExiste implements Question<Boolean> {

    public static ValidarInfomacionExiste validarDataExsite(){
        return new ValidarInfomacionExiste();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        actor.attemptsTo(
                Ensure.that(Constants.MSJ_VALIDACION_DATA_EXISTE, validatableResponse -> validatableResponse
                        .body("data.id", notNullValue()))
        );
        return true;
    }
}
