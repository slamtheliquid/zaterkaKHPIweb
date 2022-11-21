package com.lab4.notification.slack;

public interface Slack {
    void sendMessage(String chatId, String title, String message);
}
