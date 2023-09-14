package com.co.bonbonite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ShoesPage {
    public static final Target SVG_LOGIN=Target.the("icono para ir al login").locatedBy("//div[@class='myaccount']");
    public static final Target TXT_USER=Target.the("t USER").locatedBy("//input[@id='username']");
  public static final Target TXT_PASS=Target.the("t PASS").locatedBy("//input[@id='password']");
  public static final Target BTN_LOGIN=Target.the("B LOGIN").locatedBy("(//button[@type='submit'])[1]");
    //------------------------------------------------------------------------------------------------------------------------------------------------
    public static final Target BTN_SHOES=Target.the("Ver zapatos").locatedBy("(//a[@href='https://www.bon-bonite.com/categoria-producto/zapatos-mujer/'])[1]");
    public static final Target BTN_SHOES_TYPE=Target.the("Seleccionar tipo zapato").locatedBy("(//a[@href='https://www.bon-bonite.com/categoria-producto/zapatos-mujer/tenis/'])[2]");
    public static final Target BTN_IMG_SHOES=Target.the("Seleccionar zapato img").locatedBy("(//a[@class='woocommerce-LoopProduct-link woocommerce-loop-product__link'])[1]");
    public static final Target SLT_TALLA=Target.the("boton seleccionar talla").locatedBy("//select[@id='pa_talla']");
    public static final Target OP_TALLA=Target.the("seleccionar talla").locatedBy("//option[@class='attached enabled'][3]");
    public static final Target BTN_COMPRAR_AHORA=Target.the("comprar producto").locatedBy("//a[@class='buy_now_link']");
    public static final Target VLT_BUY=Target.the("Validar el producto zapato").locatedBy("(//th[text()='Producto'])");

    //------------------------------------------------------------------------------------------------------------------------------------------------
    public static  final Target A_AGREGATE_LIST =Target.the("opcion para agregar productos alista de favoritos").locatedBy("//a[@name='aadir-a-la-lista-de-deseos']");
    public static  final Target BAR_MENU =Target.the("opcion para ver opciones").locatedBy("//div[@id='burger']");
    public static  final Target A_MICUENTA =Target.the("ir al modulo mi_cuenta").locatedBy("(//a[@href='https://www.bon-bonite.com/mi-cuenta/])[2]'");
    public static  final Target A_LISTADE_DESEOS =Target.the("ir al modulo lista_deseos").locatedBy("//a[@href='https://www.bon-bonite.com/mi-cuenta/lista_deseos/]'");
    public static  final Target VERF_PRODUCTO=Target.the("verificar productos agregados").locatedBy("//a[text()='Tenis en cuero color blanco crema - 36]'");
}
