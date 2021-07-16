package com.company;

import java.io.Serializable;

public class Admin implements Serializable {
    String login;
    String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Admin(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
