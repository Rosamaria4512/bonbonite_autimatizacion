package com.co.bonbonite.userinterfaces;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

public class Fact_Bag  {
   public static final Target BTN_FINALIZAR_COMPRA =Target.the("finalizar compra").locatedBy("//a[@class='checkout-button button alt wc-forward']");
   public static final Target BTN_CONTINUAR_COMPRA =Target.the("continuar compra").locatedBy("//button[@class='resume-cta cta-step']");
   public static final Target TXT_NOMBRE =Target.the("escribir nombre").locatedBy("//input[@name='billing_first_name']");
   public static final Target TXT_APELLIDOS =Target.the("escribir apellidos").locatedBy("//input[@name='billing_last_name']");
   public static final Target SLT_GENERO =Target.the("escribir apellidos").locatedBy("//select[@name='billing_gender']");
   public static final Target OP_GENERO =Target.the("seleccionar sexo").locatedBy("//option[@value='option_1']");
   public static final Target SLT_ID =Target.the("seleccionar sexo").locatedBy("//select[@name='billing_tipo_documento']");
   public static final Target OP_ID =Target.the("seleccionar sexo").locatedBy("//option[@value='CC']");
   public static final Target TXT_ID =Target.the("seleccionar sexo").locatedBy("//input[@name='billing_user_login']");
   public static final Target TXT_CORREO =Target.the("seleccionar sexo").locatedBy("//input[@name='billing_email']");
   public static final Target TXT_TELEFONO =Target.the("seleccionar sexo").locatedBy("//input[@name='billing_phone']");

   public static final Target SLT_PAIS =Target.the("seleccionar pais").locatedBy("//Select[@name='billing_country']");
   public static final Target OP_PAIS =Target.the("op pais").locatedBy("(//option[@value='CO'])[1]");

   public static final Target SLT_DEPARTAMENTO =Target.the("seleccionar departamento").locatedBy("//Select[@name='billing_state']");
   public static final Target OP_DEPARTAMENTO =Target.the("op departamento").locatedBy("(//option[@value='CAU'])[1]");

   public static final Target SLT_CITY=Target.the("seleccionar city").locatedBy("//select[@name='billing_city']");
   public static final Target OP_CITY =Target.the("op city").locatedBy("//option[@value='La Ceja']");

   public static final Target TXT_DIRECCION =Target.the("escribir direccion").locatedBy("//input[@name='billing_address_1']");
   public static final Target TXT_CODE_ZIP =Target.the("escribir direccion").locatedBy("//input[@name='billing_postcode']");
   public static final Target BTN_COMPAR =Target.the("REALIZAR COMPRA").locatedBy("//button[@class='button alt']");



}
