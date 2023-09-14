package com.co.bonbonite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class BeltsPage {

    //inicio de sesion
    public static final Target BTN_REGSITER = Target.the("click en el logo")
            .locatedBy(" //div[@class='myaccount']");
    public static final Target TXT_CEDULA = Target.the("campo para agregar la cedula")
            .locatedBy("//*[@id='username']");
    public static final Target TXT_PASSWORD = Target.the("capo para agregar contrasena")
            .locatedBy("//*[@id='password']");

    public static final Target BTN_ACCEDER = Target.the("click en boton acceder")
            .locatedBy("//button[@name='login']");
    //*[@id="customer_login"]/div[1]/form/p[3]/button


//mapeo compra de productos cinturones
    public static final Target BTN_BELTS = Target.the("click en citurones")
            .locatedBy("//*[@id='menu-item-9']/a");
    public static final Target IMG_BELT = Target.the("click en el cituron")
            .locatedBy("//*[@id='wrapper']/div[5]/ul/li[1]/a/img");
    public static final Target BTN_SIZE = Target.the("click en en el boton tallas")
            .locatedBy("//*[@id='pa_talla']");
    public static final Target BTN_SIZE3 = Target.the("click para seleccionar talla")
            .locatedBy("//*[@id='pa_talla']/option[3]");
    public static final Target BTN_BUYNOW = Target.the("click en comprar ahora")
            .locatedBy("//a[text()='Comprar Ahora']");

    public static final Target BTN_FINISHPURCHASE = Target.the("click en finalizar compra")
            .locatedBy("//a[@class='checkout-button button alt wc-forward']");
    public static final Target BTN_CONTINUED = Target.the("click en CONTINUAR")
            .locatedBy("//button[@class='resume-cta cta-step']");
    public static final Target BTN_CS = Target.the("Localizador para poder hacer scroll")
            .locatedBy("//*[@id='content']/div/div/div[2]/div/table/tbody/tr[1]/td/span/bdi/span");
    public static final Target BTN_CS2 = Target.the("Localizador para poder hacer scroll")
            .locatedBy("//*[@id='step1']/div/div[3]/div/div[5]/div[1]/h4");

    public static final Target TXT_NAME = Target.the("campo para el nombre")
            .locatedBy("//*[@id='billing_first_name']");
    public static final Target TXT_LASTNAME = Target.the("campo para el apellido")
            .locatedBy("//*[@id='billing_last_name']");
    public static final Target TXT_GENDER = Target.the("campo para el GENERO")
            .locatedBy("//*[@id='billing_gender']");
    public static final Target TXT_SELECTIONGENDER = Target.the("SELECIIONAR HOMBRE")
            .locatedBy("//*[@id='billing_gender']/option[1]");
    public static final Target TXT_TYPESELECTIONID = Target.the("SELECIIONAR CC")
            .locatedBy("//*[@id='billing_tipo_documento']/option[1]");
    public static final Target TXT_TYPEIDENTIFICATION = Target.the("CAMPO PAAR CEDULA")
            .locatedBy("//*[@id='billing_tipo_documento']");

    public static final Target TXT_NUMBERID = Target.the("CAMPO PARA ESCRIBIR LA CEDULA")
            .locatedBy("//*[@id='billing_user_login']");

    public static final Target TXT_CELL = Target.the("CAMPO PARA CELULAR")
            .locatedBy("//*[@id='billing_phone']");
    public static final Target TXT_PAIS = Target.the("seleccionar pais")
            .locatedBy("//span[@id='select2-billing_country-container']");
    public static final Target TXT_PAIS1 = Target.the("seleccionar pais colombia")
            .locatedBy("//*[@id='select2-billing_country-container']");


    public static final Target TXT_DEP = Target.the("Localizador para poder hacer scroll")
            .locatedBy("//*[@id='billing_state']");
    public static final Target TXT_DEP1 = Target.the("Localizador para poder hacer scroll")
            .locatedBy("//*[@id='billing_state']/option[11]");
    public static final Target TXT_CITY = Target.the("Localizador para poder hacer scroll")
            .locatedBy("//*[@id='billing_city']");
    public static final Target TXT_CITY1 = Target.the("Localizador para poder hacer scroll")
            .locatedBy("//*[@id='billing_city']/option[27]");
    public static final Target TXT_ADDRESS = Target.the("Localizador para poder hacer scroll")
            .locatedBy("//*[@id='billing_address_1']");
    public static final Target TXT_CODE = Target.the("Localizador para poder hacer scroll")
            .locatedBy("//*[@id='billing_postcode']");
    public static final Target TXT_ENVIAR= Target.the("Localizador para poder hacer scroll")
            .locatedBy("//*[@id='ship-to-different-address-checkbox']");
    public static final Target TXT_ESTAS = Target.the("Localizador para poder hacer scroll")
            .locatedBy("//*[@id='wccf_checkout_field_regalo_check_regalo_si']");
    public static final Target TXT_PAGAR= Target.the("Localizador para poder hacer scroll")
            .locatedBy("//*[@id='place_order']");













}
