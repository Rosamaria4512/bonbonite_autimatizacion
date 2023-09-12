package com.co.bonbonite.tasks;

import com.co.bonbonite.models.LoginDataModels;
import com.co.bonbonite.userinterfaces.LoginPage;
import com.co.bonbonite.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

public class LoginTask implements Task {
    LoginDataModels loginDataModels;

    public LoginTask(LoginDataModels loginDataModels) {
        this.loginDataModels = loginDataModels;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LoginPage.BTN_REGSITER));
        actor.attemptsTo(Enter.theValue(loginDataModels.getNameuser()).into(LoginPage.TXT_CEDULA));
        actor.attemptsTo(Enter.theValue(loginDataModels.getPassworduser()).into(LoginPage.TXT_PASSWORD)
        ,Scroll.to(LoginPage.TXT_PASSWORD));
        actor.attemptsTo(Click.on(LoginPage.BTN_ACCEDER));
    }

    public static LoginTask inthePage(LoginDataModels loginDataModels){
        return Tasks.instrumented(LoginTask.class,loginDataModels);
    }
}
