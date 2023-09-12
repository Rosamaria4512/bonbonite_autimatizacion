package com.co.bonbonite.questions;

import com.co.bonbonite.userinterfaces.ShoesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerifyBuy implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ShoesPage.VLT_BUY).viewedBy(actor).asString();
    }
    public static VerifyBuy verifyBuy(){
        return new VerifyBuy();
    }
}
