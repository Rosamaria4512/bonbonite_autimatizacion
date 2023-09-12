package com.co.bonbonite.tasks;

import com.co.bonbonite.userinterfaces.ShoesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.omg.PortableInterceptor.ACTIVE;

import javax.swing.event.CaretListener;

public class ShoesBuyTasks implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ShoesPage.BTN_SHOES));
        actor.attemptsTo(Click.on(ShoesPage.BTN_SHOES_TYPE));
        actor.attemptsTo(Click.on(ShoesPage.BTN_IMG_SHOES));
        actor.attemptsTo(Click.on(ShoesPage.OP_TALLA));
        actor.attemptsTo(Click.on(ShoesPage.SLT_TALLA));
        actor.attemptsTo(Click.on(ShoesPage.BTN_COMPRAR_AHORA));
    }
    public static ShoesBuyTasks shoesBuyTasks(){
        return Tasks.instrumented(ShoesBuyTasks.class);
    }
}
