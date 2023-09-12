package com.co.bonbonite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage {
    public static final Target BTN_HAMBURGUER = Target.the("click en el logo")
            .locatedBy("//*[@id='burger']");
    public static final Target BTN_MICUENTA = Target.the("click en el logo")
            .locatedBy("//*[@id='menu-item-30']/a");
    public static final Target REGISTER = Target.the("click en el logo")
            .locatedBy(" //*[@id='customer_login']/div[2]");

    public static final Target TXT_NAME = Target.the("click en el logo")
            .locatedBy(" //*[@id='reg_username']");
    public static final Target TXT_EMAIL = Target.the("click en el logo")
            .locatedBy(" //*[@id='reg_email']");
    public static final Target TXT_PASSWORD = Target.the("click en el logo")
            .locatedBy(" //*[@id='reg_password']");
    public static final Target CBX_INFORMATION = Target.the("click en el logo")
            .locatedBy("//*[@id='newsletter_authorization']");
    public static final Target CBX_AUTORITATION = Target.the("click en el logo")
            .locatedBy("//*[@id='privacy_policy_reg']");
    public static final Target BTN_REGISTER = Target.the("click en el logo")
            .locatedBy("//button[@type='submit']");




}
