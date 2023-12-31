package com.co.bonbonite.tasks;

import com.co.bonbonite.models.RegisterDataModels;
import com.co.bonbonite.userinterfaces.LoginPage;
import com.co.bonbonite.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

public class RegisterTask implements Task {

    RegisterDataModels registerDataModels;

    public RegisterTask(RegisterDataModels registerDataModels) {
        this.registerDataModels = registerDataModels;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegisterPage.BTN_REGSITER));
        actor.attemptsTo(Enter.theValue(registerDataModels.getNameuser()).into(RegisterPage.TXT_NAME));
        actor.attemptsTo(Enter.theValue(registerDataModels.getEmaiuser()).into(RegisterPage.TXT_EMAIL));
        actor.attemptsTo(Enter.theValue(registerDataModels.getPassworduser()).into(RegisterPage.TXT_PASSWORD));
      //  actor.attemptsTo(Scroll.to(RegisterPage.CBX_INFORMATION));
        actor.attemptsTo(Click.on(RegisterPage.CBX_INFORMATION));
        actor.attemptsTo(Click.on(RegisterPage.CBX_AUTORITATION));
        actor.attemptsTo(Click.on(RegisterPage.BTN_REGISTER));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static RegisterTask inthePage(RegisterDataModels registerDataModels){
        return Tasks.instrumented(RegisterTask.class, registerDataModels);

    }
}
