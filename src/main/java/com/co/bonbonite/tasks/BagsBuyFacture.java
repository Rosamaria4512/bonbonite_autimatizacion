package com.co.bonbonite.tasks;

import com.co.bonbonite.userinterfaces.BagsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class BagsBuyFacture implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BagsPage.A_BOLSO));
        actor.attemptsTo(Click.on(BagsPage.TYPE_BOLSO));
        actor.attemptsTo(Click.on(BagsPage.SLT_BOLSO));
        actor.attemptsTo(Click.on(BagsPage.BUY_BOLSO));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static BagsBuyFacture bagsBuyFacture(){
        return Tasks.instrumented(BagsBuyFacture.class);
    }
}
