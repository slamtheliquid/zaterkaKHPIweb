package com.lab1.message;

import com.lab1.entity.User;

public interface Notificator {

    void notify(User user, String message);
}
