package com.co.bonbonite.tasks;

import com.co.bonbonite.userinterfaces.GoToCarrito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import javax.swing.event.CaretListener;

public class OpenCarrito implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(GoToCarrito.A_CARRITO));
        actor.attemptsTo(Click.on(GoToCarrito.VER_CARRITO));
        actor.attemptsTo(Click.on(GoToCarrito.BTN_FINALIZAR));
        actor.attemptsTo(Click.on(GoToCarrito.BTN_SIGTE));
        actor.attemptsTo(Click.on(GoToCarrito.BTN_COMPAR));
    }
    public static OpenCarrito openCarrito(){
        return Tasks.instrumented(OpenCarrito.class);
    }
}
