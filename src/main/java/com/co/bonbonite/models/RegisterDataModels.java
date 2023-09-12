package com.co.bonbonite.models;

public class RegisterDataModels {

    private String nameuser;
    private String emaiuser;
    private String passworduser;

    public RegisterDataModels(String nameuser, String emaiuser, String passworduser) {
        this.nameuser = nameuser;
        this.emaiuser = emaiuser;
        this.passworduser = passworduser;
    }

    public String getNameuser() {
        return nameuser;
    }

    public void setNameuser(String nameuser) {
        this.nameuser = nameuser;
    }

    public String getEmaiuser() {
        return emaiuser;
    }

    public void setEmaiuser(String emaiuser) {
        this.emaiuser = emaiuser;
    }

    public String getPassworduser() {
        return passworduser;
    }

    public void setPassworduser(String passworduser) {
        this.passworduser = passworduser;
    }
}
