package com.co.bonbonite.models;

public class BetsDataModuls {

    private String nameuser;
    private String passworduser;
    private String name;
    private String lastname;
    private String identification;
    private String phone;
    private String depto;
    private String city;
    private String addrees;
    private String codigo;

    public BetsDataModuls(String nameuser, String passworduser, String name, String lastname, String identification, String phone, String depto, String city, String addrees, String codigo) {
        this.nameuser = nameuser;
        this.passworduser = passworduser;
        this.name = name;
        this.lastname = lastname;
        this.identification = identification;
        this.phone = phone;
        this.depto = depto;
        this.city = city;
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

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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
