package com.co.bonbonite.tasks;

import com.co.bonbonite.models.BetsDataModuls;
import com.co.bonbonite.models.LoginDataModels;
import com.co.bonbonite.userinterfaces.BeltsPage;
import com.co.bonbonite.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

public class BeltsTask implements Task {

  BetsDataModuls betsDataModuls;

    public BeltsTask(BetsDataModuls betsDataModuls) {
        this.betsDataModuls = betsDataModuls;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {

        // el actor se loguea
        actor.attemptsTo(Click.on(BeltsPage.BTN_REGSITER));
        actor.attemptsTo(Enter.theValue(betsDataModuls.getNameuser()).into(BeltsPage.TXT_CEDULA));
        actor.attemptsTo(Enter.theValue(betsDataModuls.getPassworduser()).into(BeltsPage.TXT_PASSWORD)
                ,Scroll.to(BeltsPage.TXT_PASSWORD));
        actor.attemptsTo(Click.on(BeltsPage.BTN_ACCEDER));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // actor compra producto cinturon


        actor.attemptsTo(Click.on(BeltsPage.BTN_BELTS));
        actor.attemptsTo(Click.on(BeltsPage.IMG_BELT));
        actor.attemptsTo(Click.on(BeltsPage.BTN_SIZE));
        actor.attemptsTo(Click.on(BeltsPage.BTN_SIZE3),
                Scroll.to(BeltsPage.BTN_BUYNOW));
        actor.attemptsTo(Click.on(BeltsPage.BTN_BUYNOW));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(Scroll.to(BeltsPage.BTN_CS));
        actor.attemptsTo(Click.on(BeltsPage.BTN_FINISHPURCHASE));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Scroll.to(BeltsPage.BTN_CS2));
        actor.attemptsTo(Click.on(BeltsPage.BTN_CONTINUED));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Enter.theValue(betsDataModuls.getName()).into(BeltsPage.TXT_NAME));
        actor.attemptsTo(Enter.theValue(betsDataModuls.getLastname()).into(BeltsPage.TXT_LASTNAME));
        actor.attemptsTo(Click.on(BeltsPage.TXT_GENDER));
        actor.attemptsTo(Click.on(BeltsPage.TXT_SELECTIONGENDER));
        actor.attemptsTo(Click.on(BeltsPage.TXT_TYPESELECTIONID));
        actor.attemptsTo(Click.on(BeltsPage.TXT_TYPEIDENTIFICATION));
        actor.attemptsTo(Enter.theValue(betsDataModuls.getIdentification()).into(BeltsPage.TXT_NUMBERID));
        actor.attemptsTo(Enter.theValue(betsDataModuls.getPhone()).into(BeltsPage.TXT_CELL));
        actor.attemptsTo(Scroll.to(BeltsPage.TXT_CELL));

       actor.attemptsTo(Click.on(BeltsPage.TXT_PAIS));
        actor.attemptsTo(Click.on(BeltsPage.TXT_PAIS1));
        actor.attemptsTo(Enter.theValue(betsDataModuls.getDepto()).into(BeltsPage.TXT_DEP));
        actor.attemptsTo(Enter.theValue(betsDataModuls.getCity()).into(BeltsPage.TXT_CITY));
       // actor.attemptsTo(Click.on(BeltsPage.TXT_DEP));
       // actor.attemptsTo(Click.on(BeltsPage.TXT_DEP1));
        //actor.attemptsTo(Click.on(BeltsPage.TXT_CITY));
        //actor.attemptsTo(Click.on(BeltsPage.TXT_CITY1));
        actor.attemptsTo(Enter.theValue(betsDataModuls.getAddrees()).into(BeltsPage.TXT_ADDRESS));
        actor.attemptsTo(Enter.theValue(betsDataModuls.getCodigo()).into(BeltsPage.TXT_CODE));
        actor.attemptsTo(Click.on(BeltsPage.TXT_PAGAR));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public static BeltsTask inthePage(BetsDataModuls betsDataModuls){
        return Tasks.instrumented(BeltsTask.class, betsDataModuls);
    }
}
