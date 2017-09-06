package com.kodilla.good.patterns.challenges.ishop;

public class User {
    private String name;
    private String surname;
    private String userEMail;
    private String userAdress;
    private int userID;

    public User(String name, String surname, String userEMail, String userAdress, int userID) {
        this.name = name;
        this.surname = surname;
        this.userEMail = userEMail;
        this.userAdress = userAdress;
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getUserEMail() {
        return userEMail;
    }

    public String getUserAdress() {
        return userAdress;
    }

    public int getUserID() {
        return userID;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", userEMail='" + userEMail + '\'' +
                ", userAdress='" + userAdress + '\'' +
                ", userID=" + userID +
                '}';
    }
}
