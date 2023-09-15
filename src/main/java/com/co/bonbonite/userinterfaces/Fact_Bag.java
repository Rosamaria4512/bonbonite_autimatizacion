package com.co.bonbonite.userinterfaces;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

public class Fact_Bag  {
   public static final Target BTN_FINALIZAR_COMPRA =Target.the("finalizar compra").locatedBy("(//a[@href='https://www.bon-bonite.com/finalizar-compra/'])[2]");
   public static final Target BTN_CONTINUAR_COMPRA =Target.the("continuar compra").locatedBy("//button[@class='resume-cta cta-step']");
   //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
   public static final Target TXT_FORM_ID = Target.the("id form").locatedBy("//input[@name='username']");
   public static final Target TXT_FORM_PASS = Target.the("id form").locatedBy("//input[@name='password']");
   public static final Target TXT_FORM_CHEK = Target.the("id form").locatedBy("(//input[@type='checkbox'])[1]");
   public static final Target TXT_FORM_BUTTON_SEND = Target.the("id form").locatedBy("(//button[@type='submit'])[1]");


   //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

   public static final Target BTN_INVITADO =Target.the("escribir nombre").locatedBy("(//a[@class='guest-cta'])[1]");

   public static final Target TXT_NOMBRE =Target.the("escribir nombre").locatedBy("//input[@name='billing_first_name']");
   public static final Target TXT_APELLIDOS =Target.the("escribir apellidos").locatedBy("//input[@name='billing_last_name']");
   public static final Target SLT_GENERO =Target.the("escribir apellidos").locatedBy("//select[@name='billing_gender']");
   public static final Target OP_GENERO =Target.the("seleccionar sexo").locatedBy("//option[@value='option_1']");
   public static final Target SLT_ID =Target.the("seleccionar sexo").locatedBy("//select[@name='billing_tipo_documento']");
   public static final Target OP_ID =Target.the("seleccionar sexo").locatedBy("//option[@value='CC']");
   public static final Target TXT_ID =Target.the("seleccionar sexo").locatedBy("//input[@name='billing_user_login']");
   public static final Target TXT_CORREO =Target.the("seleccionar sexo").locatedBy("//input[@name='billing_email']");
   public static final Target TXT_TELEFONO =Target.the("seleccionar sexo").locatedBy("//input[@name='billing_phone']");

   public static final Target SLT_PAIS =Target.the("seleccionar pais").locatedBy("(//span[@class='select2-selection__rendered'])[1]");
   public static final Target OP_PAIS =Target.the("op pais").locatedBy("(//option[@value='CO'])[1]");

   public static final Target SLT_DEPARTAMENTO =Target.the("seleccionar departamento").locatedBy("(//span[@class=\"select2-selection__rendered\"])[2]");
   public static final Target OP_DEPARTAMENTO =Target.the("op departamento").locatedBy("//*[@id='billing_state']/option[11]");

   public static final Target SLT_CITY=Target.the("seleccionar city").locatedBy("(//span[@class=\"select2-selection__rendered\"])[3]");
   public static final Target OP_CITY =Target.the("op city").locatedBy("//option[@value='Popayán']");

   public static final Target TXT_DIRECCION =Target.the("escribir direccion").locatedBy("//input[@name='billing_address_1']");
   public static final Target TXT_CODE_ZIP =Target.the("escribir direccion").locatedBy("//input[@name='billing_postcode']");
   public static final Target CHK_1 =Target.the("autorizar 1").locatedBy("//*[@id='newsletter_authorization']");
   public static final Target CHK_2 =Target.the("autorizar 2").locatedBy("//*[@id='terms']");
   public static final Target BTN_NEW_ACOUNT =Target.the("autorizar 1").locatedBy("//input[@name='createaccount']");
   public static final Target TXT_USER =Target.the("Crear user").locatedBy("//input[@name='account_username']");
   public static final Target TXT_PASS =Target.the("Crear pass").locatedBy("//input[@name='account_password']");
   public static final Target BTN_COMPAR =Target.the("REALIZAR COMPRA").locatedBy("//*[@id='place_order']");

   //-------------------------------------------------------------------------------------------------------------------------------------------------------------------

   public static final Target VALIDATE_COMPRA=Target.the("Validar compra").locatedBy("//*[text()='COP']");

}
