// User.java
package com.ashok.model;

public class User {

    private String username;
    private String password;
    private String email;

    // Constructors, getters, and setters

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
