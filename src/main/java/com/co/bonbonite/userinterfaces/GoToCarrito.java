package com.co.bonbonite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class GoToCarrito {
    public static final Target A_CARRITO=Target.the("Ir al modulo de carrito").locatedBy("//div[@class='cart']");
    public static final Target VER_CARRITO=Target.the("Ir al modulo de carrito").locatedBy("(//a[@href=\"https://www.bon-bonite.com/carrito/\"])[2]");
    public static final Target BTN_FINALIZAR=Target.the("Boton comprar").locatedBy("//button[@class='resume-cta cta-step']");
    public static final Target BTN_SIGTE=Target.the("Boton sigte").locatedBy("//button[@class='resume-cta cta-step']");
    public static final Target BTN_COMPAR =Target.the("REALIZAR COMPRA").locatedBy("//*[@id='place_order']");
}
