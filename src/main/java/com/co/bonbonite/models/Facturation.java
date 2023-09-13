package com.co.bonbonite.models;

public class Facturation {
    private  String Nombres;
    private  String Apellidos;
    private  String N_DOCUMENTO;
    private  String EMAIL;
    private  String TELEFONO;
    private  String DIRECCION;
    private  String CODIGO_POSTAL;

    public Facturation(String nombres, String apellidos, String n_DOCUMENTO, String EMAIL, String TELEFONO, String DIRECCION, String CODIGO_POSTAL) {
        this.Nombres = nombres;
        this.Apellidos = apellidos;
        this.N_DOCUMENTO = n_DOCUMENTO;
        this.EMAIL = EMAIL;
        this.TELEFONO = TELEFONO;
        this.DIRECCION = DIRECCION;
        this.CODIGO_POSTAL = CODIGO_POSTAL;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getN_DOCUMENTO() {
        return N_DOCUMENTO;
    }

    public void setN_DOCUMENTO(String n_DOCUMENTO) {
        N_DOCUMENTO = n_DOCUMENTO;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getTELEFONO() {
        return TELEFONO;
    }

    public void setTELEFONO(String TELEFONO) {
        this.TELEFONO = TELEFONO;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public void setDIRECCION(String DIRECCION) {
        this.DIRECCION = DIRECCION;
    }

    public String getCODIGO_POSTAL() {
        return CODIGO_POSTAL;
    }

    public void setCODIGO_POSTAL(String CODIGO_POSTAL) {
        this.CODIGO_POSTAL = CODIGO_POSTAL;
    }
}
