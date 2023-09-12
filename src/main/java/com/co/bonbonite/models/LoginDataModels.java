package com.co.bonbonite.models;

public class LoginDataModels {

    private String nameuser;
    private String passworduser;

    public LoginDataModels(String nameuser, String passworduser) {
        this.nameuser = nameuser;
        this.passworduser = passworduser;
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
}
