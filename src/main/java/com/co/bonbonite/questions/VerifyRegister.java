package com.co.bonbonite.questions;

import com.co.bonbonite.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerifyRegister implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(RegisterPage.TXT_VALIDATION).viewedBy(actor).asString();
    }

    public static VerifyRegister validation(){
        return new VerifyRegister();
    }
}
