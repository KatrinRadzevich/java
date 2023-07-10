package org.example.OOP.Lesson1.HomeWork;

public class User extends Basket {
    private String logging;
    private String password;

    public User(String logging, String password, String name, Integer boughtItems) {
        this.logging = logging;
        this.password = password;
        super.name = name;
        super.boughtItems = boughtItems;
    }

    public String getLogging() {
        return logging;
    }

    public void setLogging(String logging) {
        this.logging = logging;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "logging = '" + logging + '\'' +
                ", password = '" + password + '\'' +
                ",name = " + name +
                ", boughtItems = " + boughtItems;
    }
}
