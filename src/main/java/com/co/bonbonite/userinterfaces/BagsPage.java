package com.co.bonbonite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class BagsPage {
  public static final Target A_BOLSO=Target.the("ir al modulo de bolsos").locatedBy("(//a[@href='https://www.bon-bonite.com/categoria-producto/bolsos-mujer/'])[1]");
  public static final Target TYPE_BOLSO=Target.the("ir al tipos de bolsos").locatedBy("//a[@href='https://www.bon-bonite.com/categoria-producto/bolsos-mujer/bomboneras-bolsos/']");
  public static final Target SLT_BOLSO=Target.the("seleccionar bolsos").locatedBy("(//a[@class='woocommerce-LoopProduct-link woocommerce-loop-product__link'])[2]");
  public static final Target BUY_BOLSO=Target.the("comprar bolsos").locatedBy("//div[@class='buy_now_button enabled']");

  //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  public static final Target AGRT_LIST_DESEOS=Target.the("Agregar a la lista").locatedBy("//a[@name='aadir-a-la-lista-de-deseos']");
  public static final Target BRN_PERFIL=Target.the("menu desplegable").locatedBy("//div[@class='myaccount']");

  public static final Target OPT_LIST=Target.the("ir a lista de deseos").locatedBy("//a[@href='https://www.bon-bonite.com/mi-cuenta/lista_deseos/']");
  public static final Target VRF_PRODUCT=Target.the("verificar el producto").locatedBy("//span[text()='Añadir al carrito']");

}
