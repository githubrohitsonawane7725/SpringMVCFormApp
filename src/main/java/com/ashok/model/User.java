package com.ashok.model;

public class User {

    private String uname;
    private String pwd;
    private String email;
    private Long phno;
    private String gender;

    // Constructor, getters, and setters omitted for brevity

    public String toHTML() {
        StringBuilder html = new StringBuilder();

        html.append("<div>");
        html.append("<p>Username: ").append(uname).append("</p>");
        html.append("<p>Password: ").append(pwd).append("</p>");
        html.append("<p>Email: ").append(email).append("</p>");
        html.append("<p>Phone Number: ").append(phno).append("</p>");
        html.append("<p>Gender: ").append(gender).append("</p>");
        html.append("</div>");

        return html.toString();
    }
}




