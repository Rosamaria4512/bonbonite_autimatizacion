package com.co.bonbonite.tasks;

import com.co.bonbonite.userinterfaces.BagsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ScrollTo;
import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;

public class BagAgregateTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BagsPage.A_BOLSO));
        actor.attemptsTo(Click.on(BagsPage.TYPE_BOLSO));
        actor.attemptsTo(Click.on(BagsPage.SLT_BOLSO));
        actor.attemptsTo(Click.on(BagsPage.AGRT_LIST_DESEOS));

        actor.attemptsTo(Click.on(BagsPage.BRN_PERFIL));

        actor.attemptsTo(Click.on(BagsPage.OPT_LIST));

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
