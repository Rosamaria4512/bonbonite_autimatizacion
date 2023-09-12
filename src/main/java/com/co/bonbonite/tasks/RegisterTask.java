package com.co.bonbonite.tasks;

import com.co.bonbonite.models.RegisterDataModels;
import com.co.bonbonite.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RegisterTask implements Task {

    RegisterDataModels registerDataModels;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegisterPage.BTN_HAMBURGUER));
        actor.attemptsTo(Click.on(RegisterPage.BTN_MICUENTA));
        actor.attemptsTo(Click.on(RegisterPage.REGISTER));
        actor.attemptsTo(Enter.theValue(registerDataModels.getNameuser()).into(RegisterPage.TXT_NAME));
        actor.attemptsTo(Enter.theValue(registerDataModels.getEmaiuser()).into(RegisterPage.TXT_EMAIL));
        actor.attemptsTo(Enter.theValue(registerDataModels.getPassworduser()).into(RegisterPage.TXT_PASSWORD));
        actor.attemptsTo(Click.on(RegisterPage.CBX_INFORMATION));
        actor.attemptsTo(Click.on(RegisterPage.CBX_AUTORITATION));
        actor.attemptsTo(Click.on(RegisterPage.BTN_REGISTER));

    }

    public static RegisterTask inthePage(RegisterDataModels registerDataModels){
        return Tasks.instrumented(RegisterTask.class, registerDataModels);

    }
}
