package com.co.bonbonite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static final Target BTN_REGSITER = Target.the("click en el logo")
            .locatedBy(" //div[@class='myaccount']");
    public static final Target TXT_CEDULA = Target.the("campo para agregar la cedula")
            .locatedBy("//*[@id='username']");
    public static final Target TXT_PASSWORD = Target.the("capo para agregar contrasena")
            .locatedBy("//*[@id='password']");

    public static final Target BTN_ACCEDER = Target.the("click en boton acceder")
            .locatedBy("//button[@name='login']");
    //*[@id="customer_login"]/div[1]/form/p[3]/button

    public static final Target BCBX_RECUERDAME = Target.the("click en el logo")
            .locatedBy("//*[@id'rememberme']");


}
