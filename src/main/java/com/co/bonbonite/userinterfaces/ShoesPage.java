package com.co.bonbonite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ShoesPage {
    public static final Target SVG_LOGIN=Target.the("icono para ir al login").locatedBy("//div[@class=\"myaccount\"]");
    public static final Target TXT_USER=Target.the("t USER").locatedBy("//input[@id=\"username\"]");
    public static final Target TXT_PASS=Target.the("t USER").locatedBy("//input[@id=\"password\"]");
    public static final Target BTN_LOGIN=Target.the("t USER").locatedBy("(//button[@type=\"submit\"])[1]");

}
