package com.co.bonbonite.questions;

import com.co.bonbonite.userinterfaces.BagsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerifyBag implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(BagsPage.VRF_PRODUCT).viewedBy(actor).asString();
    }
    public static VerifyBag verifyBag(){
        return new VerifyBag();
    }
}
