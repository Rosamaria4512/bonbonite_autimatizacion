package com.co.bonbonite.models;

public class LoginIncorrectlyModels {
    private String nameuser;
    private String passworduser;

    public LoginIncorrectlyModels(String nameuser, String passworduser) {
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
