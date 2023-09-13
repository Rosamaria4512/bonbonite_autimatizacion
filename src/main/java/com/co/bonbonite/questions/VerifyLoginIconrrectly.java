package com.co.bonbonite.questions;

import com.co.bonbonite.userinterfaces.LoginINcorrectlyPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerifyLoginIconrrectly implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LoginINcorrectlyPage.TXT_CEDULA.resolveFor(actor).getAttribute("valur").contains("10618117145");

    }

    public static VerifyLoginIconrrectly validation(){
        return new VerifyLoginIconrrectly();
    }
}
