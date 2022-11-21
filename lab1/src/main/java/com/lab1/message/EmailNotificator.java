package com.lab1.message;

import com.lab1.entity.User;

public class EmailNotificator implements Notificator {

    @Override
    public void notify(User user, String message) {
        System.out.println("notification was sent by email to ==> " + user + ":");
        System.out.println(message);
    }
}
