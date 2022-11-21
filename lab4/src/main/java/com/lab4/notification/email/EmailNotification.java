package com.lab4.notification.email;

import com.lab4.notification.Notification;

public class EmailNotification implements Notification {

    private final String adminEmail;

    public EmailNotification(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public void send(String title, String message) {
        System.out.println("sent email titled '" + title + "' to '" + adminEmail + "';\n message: '" + message + "'.");
    }
}
