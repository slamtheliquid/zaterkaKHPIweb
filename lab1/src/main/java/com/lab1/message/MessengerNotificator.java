package com.lab1.message;

import com.lab1.entity.User;

public class MessengerNotificator implements Notificator {

    @Override
    public void notify(User user, String message) {
        System.out.println("notification was sent by messenger to ==> " + user + ":");
        System.out.println(message);
    }
}
