package com.co.bonbonite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage {
    public static final Target BTN_HAMBURGUER = Target.the("click en el logo")
            .locatedBy("//*[@id='burger']");
    public static final Target BTN_REGSITER = Target.the("click en el logo")
            .locatedBy(" //div[@class='myaccount']");

    public static final Target REGISTER = Target.the("click en el logo")
            .locatedBy(" //*[@id='customer_login']/div[2]");

    public static final Target TXT_NAME = Target.the("click en el logo")
            .locatedBy("//*[@id='reg_username']");
    public static final Target TXT_EMAIL = Target.the("click en el logo")
            .locatedBy("//input[@id='reg_email']");
    public static final Target TXT_PASSWORD = Target.the("click en el logo")
            .locatedBy("//input[@id='reg_password']");
    public static final Target CBX_INFORMATION = Target.the("click en el logo")
            .locatedBy("(//input[@type='checkbox'])[2]");
    public static final Target CBX_AUTORITATION = Target.the("click en el logo")
            .locatedBy("(//input[@type='checkbox'])[3]");
    public static final Target BTN_REGISTER = Target.the("click en el logo")
            .locatedBy("(//button[@type='submit'])[2]");
    public static final Target TXT_VALIDATION = Target.the("CAMPO PARA VLAIDAR REGISTRO EXITOSO")
            .locatedBy("(//*[text()='Hola ']");




}
