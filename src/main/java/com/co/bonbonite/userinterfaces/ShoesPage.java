package com.co.bonbonite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ShoesPage {
    public static final Target SVG_LOGIN=Target.the("icono para ir al login").locatedBy("//div[@class=\"myaccount\"]");
    public static final Target TXT_USER=Target.the("t USER").locatedBy("//input[@id=\"username\"]");
    public static final Target TXT_PASS=Target.the("t USER").locatedBy("//input[@id=\"password\"]");
    public static final Target BTN_LOGIN=Target.the("t USER").locatedBy("(//button[@type=\"submit\"])[1]");
    //------------------------------------------------------------------------------------------------------------------------------------------------
    public static final Target BTN_SHOES=Target.the("t USER").locatedBy("(//li[@id=\"menu-item-10\"])");
    public static final Target BTN_SHOES_TYPE=Target.the("t USER").locatedBy("(//a[@href=\"https://www.bon-bonite.com/categoria-producto/zapatos-mujer/tenis/\"])[2]");
    public static final Target BTN_IMG_SHOES=Target.the("t USER").locatedBy("(//a[@class=\"woocommerce-LoopProduct-link woocommerce-loop-product__link\"])[5]");
    public static final Target SLT_TALLA=Target.the("t USER").locatedBy("//select[@id=\"pa_talla\"]");
    public static final Target OP_TALLA=Target.the("t USER").locatedBy("//option[@class=\"attached enabled\"][3]");
    public static final Target BTN_COMPRAR_AHORA=Target.the("t USER").locatedBy("//a[@class=\"buy_now_link\"]");
    public static final Target VLT_BUY=Target.the("t USER").locatedBy("(//th[text()=\"Producto\"])");



}
