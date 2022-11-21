package com.lab4.notification.slack;

import com.lab4.notification.Notification;

public class SlackNotificationAdapter implements Notification {

    private final Slack slack;
    private String chatId;

    public SlackNotificationAdapter(Slack slack, String chatId) {
        this.slack = slack;
        this.chatId = chatId;
    }

    public void send(String title, String message) {
        slack.sendMessage(chatId, title, message);
    }

    public String getChatId() {
        return chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }
}
