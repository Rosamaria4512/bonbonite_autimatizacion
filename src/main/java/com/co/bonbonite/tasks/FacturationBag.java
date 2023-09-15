package com.co.bonbonite.tasks;

import com.co.bonbonite.models.Facturation;
import com.co.bonbonite.userinterfaces.Fact_Bag;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import org.omg.CORBA.PUBLIC_MEMBER;

public class FacturationBag implements Task {
    Facturation facturation;

    public FacturationBag(Facturation facturation) {
        this.facturation = facturation;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Fact_Bag.BTN_FINALIZAR_COMPRA));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(Fact_Bag.BTN_CONTINUAR_COMPRA));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(Fact_Bag.BTN_INVITADO));

//        actor.attemptsTo(Enter.theValue(facturation.getId()).into(Fact_Bag.TXT_FORM_ID));
//        actor.attemptsTo(Enter.theValue(facturation.getId()).into(Fact_Bag.TXT_FORM_PASS));
//        actor.attemptsTo(Enter.theValue(facturation.getId()).into(Fact_Bag.TXT_FORM_CHEK));
//        actor.attemptsTo(Enter.theValue(facturation.getId()).into(Fact_Bag.TXT_FORM_BUTTON_SEND));


        actor.attemptsTo(Enter.theValue(facturation.getName()).into(Fact_Bag.TXT_NOMBRE));
        actor.attemptsTo(Enter.theValue(facturation.getSurname()).into(Fact_Bag.TXT_APELLIDOS));
        actor.attemptsTo(Click.on(Fact_Bag.SLT_GENERO));
        actor.attemptsTo(Click.on(Fact_Bag.OP_GENERO));
        actor.attemptsTo(Click.on(Fact_Bag.SLT_ID));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(Fact_Bag.OP_ID));
        actor.attemptsTo(Enter.theValue(facturation.getN_documento()).into(Fact_Bag.TXT_ID), Scroll.to(Fact_Bag.SLT_PAIS));
        actor.attemptsTo(Enter.theValue(facturation.getEmail()).into(Fact_Bag.TXT_CORREO));
        actor.attemptsTo(Enter.theValue(facturation.getPhone()).into(Fact_Bag.TXT_TELEFONO));
        actor.attemptsTo(Click.on(Fact_Bag.SLT_PAIS));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(Click.on(Fact_Bag.OP_PAIS));
        actor.attemptsTo(Click.on(Fact_Bag.SLT_DEPARTAMENTO), Scroll.to(Fact_Bag.TXT_CORREO));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(Click.on(Fact_Bag.OP_DEPARTAMENTO));

        actor.attemptsTo(Click.on(Fact_Bag.SLT_CITY));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(Fact_Bag.OP_CITY));



        actor.attemptsTo(Click.on(Fact_Bag.BTN_NEW_ACOUNT));
        actor.attemptsTo(Enter.theValue(facturation.getUser()).into(Fact_Bag.TXT_USER));
        actor.attemptsTo(Enter.theValue(facturation.getPassword()).into(Fact_Bag.TXT_PASS));
        actor.attemptsTo(Enter.theValue(facturation.getCode_zip()).into(Fact_Bag.TXT_CODE_ZIP));
        actor.attemptsTo(Enter.theValue(facturation.getAdrres()).into(Fact_Bag.TXT_DIRECCION),Scroll.to(Fact_Bag.TXT_NOMBRE));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(Fact_Bag.CHK_1));
        actor.attemptsTo(Click.on(Fact_Bag.CHK_2));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(Fact_Bag.BTN_COMPAR));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
    public static FacturationBag facturationBag(Facturation facturation){
        return Tasks.instrumented(FacturationBag.class,facturation);
    }
}
