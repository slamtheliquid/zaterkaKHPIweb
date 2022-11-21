package com.lab4.notification.sms;

public interface Sms {
    void sendSms(String phone, String sender, String title, String message);
}
