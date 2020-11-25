package com.example.datlichkham.model;

public class Doctor {
    String userName, pass, email, level;

    public Doctor() {
    }

    public Doctor(String userName, String pass, String email, String level) {
        this.userName = userName;
        this.pass = pass;
        this.email = email;
        this.level = level;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
