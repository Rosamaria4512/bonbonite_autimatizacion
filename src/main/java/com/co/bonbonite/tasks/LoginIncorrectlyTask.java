package com.co.bonbonite.tasks;

import com.co.bonbonite.models.LoginIncorrectlyModels;
import com.co.bonbonite.questions.VerifyLoginIconrrectly;
import com.co.bonbonite.userinterfaces.LoginINcorrectlyPage;
import com.co.bonbonite.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

public class LoginIncorrectlyTask implements Task {

LoginIncorrectlyModels loginIncorrectlyModels;

    public LoginIncorrectlyTask(LoginIncorrectlyModels loginIncorrectlyModels) {
        this.loginIncorrectlyModels = loginIncorrectlyModels;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LoginINcorrectlyPage.BTN_REGSITER));
        actor.attemptsTo(Enter.theValue(loginIncorrectlyModels.getNameuser()).into(LoginINcorrectlyPage.TXT_CEDULA));
        actor.attemptsTo(Enter.theValue(loginIncorrectlyModels.getPassworduser()).into(LoginINcorrectlyPage.TXT_PASSWORD)
                , Scroll.to(LoginINcorrectlyPage.TXT_PASSWORD));
        actor.attemptsTo(Click.on(LoginINcorrectlyPage.BTN_ACCEDER));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public static LoginIncorrectlyTask validation(LoginIncorrectlyModels loginIncorrectlyModels)
    {
        return Tasks.instrumented(LoginIncorrectlyTask.class,(loginIncorrectlyModels));
    }
}
