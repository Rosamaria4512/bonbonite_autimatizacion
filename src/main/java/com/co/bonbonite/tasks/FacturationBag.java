package com.co.bonbonite.tasks;

import com.co.bonbonite.models.Facturation;
import com.co.bonbonite.userinterfaces.Fact_Bag;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.omg.CORBA.PUBLIC_MEMBER;

public class FacturationBag implements Task {
    Facturation facturation;

    public FacturationBag(Facturation facturation) {
        this.facturation = facturation;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Fact_Bag.BTN_FINALIZAR_COMPRA));
        actor.attemptsTo(Enter.theValue(facturation.getName()).into(Fact_Bag.TXT_NOMBRE));
        actor.attemptsTo(Enter.theValue(facturation.getSurname()).into(Fact_Bag.TXT_APELLIDOS));
        actor.attemptsTo(Click.on(Fact_Bag.SLT_GENERO));
        actor.attemptsTo(Click.on(Fact_Bag.OP_GENERO));
        actor.attemptsTo(Click.on(Fact_Bag.SLT_ID));
        actor.attemptsTo(Click.on(Fact_Bag.OP_ID));
        actor.attemptsTo(Enter.theValue(facturation.getN_documento()).into(Fact_Bag.TXT_ID));
        actor.attemptsTo(Enter.theValue(facturation.getEmail()).into(Fact_Bag.TXT_CORREO));
        actor.attemptsTo(Enter.theValue(facturation.getPhone()).into(Fact_Bag.TXT_TELEFONO));
        actor.attemptsTo(Enter.theValue(facturation.getAdrres()).into(Fact_Bag.TXT_DIRECCION));
        actor.attemptsTo(Enter.theValue(facturation.getCode_zip()).into(Fact_Bag.TXT_CODE_ZIP));
    }
    public static FacturationBag facturationBag(Facturation facturation){
        return Tasks.instrumented(FacturationBag.class,facturation);
    }
}
