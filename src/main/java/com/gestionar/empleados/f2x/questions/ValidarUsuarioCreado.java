package com.gestionar.empleados.f2x.questions;


import io.restassured.path.json.JsonPath;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


public class ValidarUsuarioCreado implements Question<Boolean> {

    private final String usernameEsperado;

    public ValidarUsuarioCreado(String usernameEsperado) {
        this.usernameEsperado = usernameEsperado;
    }

    public static ValidarUsuarioCreado validarUserName(String usernameEsperado){
        return new ValidarUsuarioCreado(usernameEsperado);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String responseBody = actor.recall("responseBody");
        String usernameEnRespuesta = JsonPath.from(responseBody).getString("username");
        return usernameEsperado.equals(usernameEnRespuesta);

    }
}
