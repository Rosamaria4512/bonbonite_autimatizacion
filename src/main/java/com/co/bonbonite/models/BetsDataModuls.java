package com.co.bonbonite.models;

public class BetsDataModuls {

    private String nameuser;
    private String passworduser;
    private String name;
    private String lastname;
    private String identification;
    private String phone;
    private String addrees;
    private String codigo;

    public BetsDataModuls(String nameuser, String passworduser, String name, String lastname, String identification, String phone, String addrees, String codigo) {
        this.nameuser = nameuser;
        this.passworduser = passworduser;
        this.name = name;
        this.lastname = lastname;
        this.identification = identification;
        this.phone = phone;
        this.addrees = addrees;
        this.codigo = codigo;
    }

    public String getNameuser() {
        return nameuser;
    }

    public void setNameuser(String nameuser) {
        this.nameuser = nameuser;
    }

    public String getPassworduser() {
        return passworduser;
    }

    public void setPassworduser(String passworduser) {
        this.passworduser = passworduser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddrees() {
        return addrees;
    }

    public void setAddrees(String addrees) {
        this.addrees = addrees;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
