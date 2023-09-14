package com.co.bonbonite.models;

public class Facturation {
    private String id;
    private String pass;
    private String name;
    private String surname;
    private String n_documento;
    private String email;
    private String phone;
    private String adrres;
    private String code_zip;

    public Facturation(String id, String pass, String name, String surname, String n_documento, String email, String phone, String adrres, String code_zip) {
        this.id = id;
        this.pass = pass;
        this.name = name;
        this.surname = surname;
        this.n_documento = n_documento;
        this.email = email;
        this.phone = phone;
        this.adrres = adrres;
        this.code_zip = code_zip;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getN_documento() {
        return n_documento;
    }

    public void setN_documento(String n_documento) {
        this.n_documento = n_documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdrres() {
        return adrres;
    }

    public void setAdrres(String adrres) {
        this.adrres = adrres;
    }

    public String getCode_zip() {
        return code_zip;
    }

    public void setCode_zip(String code_zip) {
        this.code_zip = code_zip;
    }
}


