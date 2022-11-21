package com.lab4.notification.slack;

public class SlackImplementor implements Slack {

    private final String login;
    private final String apiKey;

    public SlackImplementor(String login, String apiKey) {
        this.login = login;
        this.apiKey = apiKey;
    }

    public void sendMessage(String chatId, String title, String message) {
        System.out.println("user (slack) '" + login + "', api key: '" + apiKey + "' in '" + chatId + "' sent message titled '" + title + "';\n message: '" + message + "'.");
    }

    public String getLogin() {
        return login;
    }

    public String getApiKey() {
        return apiKey;
    }
}
