package com.co.bonbonite.tasks;

import com.co.bonbonite.userinterfaces.BagsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class BagAgregateTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BagsPage.NAV_BURGER));
        actor.attemptsTo(Click.on(BagsPage.NAV_BURGER_OPTION));
        actor.attemptsTo(Click.on(BagsPage.OPT_LIST));
        actor.attemptsTo(Click.on(BagsPage.VRF_PRODUCT));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static BagAgregateTask bagAgregateTask(){
        return Tasks.instrumented(BagAgregateTask.class);
    }
}
