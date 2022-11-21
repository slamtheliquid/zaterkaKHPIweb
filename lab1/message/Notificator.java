package lab1.message;

import lab1.entity.User;

public interface Notificator {

    void notify(User user, String message);
}
