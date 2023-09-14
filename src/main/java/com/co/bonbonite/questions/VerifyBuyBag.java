package com.co.bonbonite.questions;

import com.co.bonbonite.userinterfaces.Fact_Bag;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerifyBuyBag implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(Fact_Bag.VALIDATE_COMPRA).viewedBy(actor).asString();
    }
    public static VerifyBuyBag verifyBuyBag(){
        return new VerifyBuyBag();
    }
}
