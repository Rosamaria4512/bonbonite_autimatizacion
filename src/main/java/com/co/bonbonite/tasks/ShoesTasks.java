package com.co.bonbonite.tasks;

import com.co.bonbonite.models.Credentials;
import com.co.bonbonite.userinterfaces.ShoesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ShoesTasks implements Task {
    Credentials credentials;

    public ShoesTasks(Credentials credentials) {
        this.credentials = credentials;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(Click.on(ShoesPage.SVG_LOGIN));
        actor.attemptsTo(Enter.theValue(credentials.getUser()).into(ShoesPage.TXT_USER));
        actor.attemptsTo(Enter.theValue(credentials.getPass()).into(ShoesPage.TXT_PASS));
       actor.attemptsTo(Click.on(ShoesPage.BTN_LOGIN));
    }
    public static ShoesTasks shoesTasks(Credentials credentials){
        return Tasks.instrumented(ShoesTasks.class,credentials);
    }
}
