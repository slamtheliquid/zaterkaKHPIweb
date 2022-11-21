package com.lab3.entity;

public class LinkedInSM implements SocialMedia {

    private final String email;
    private final String password;

    public LinkedInSM(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void publishMessage(String message) {
        System.out.println(email + " posted in li: " + message);
    }
}
