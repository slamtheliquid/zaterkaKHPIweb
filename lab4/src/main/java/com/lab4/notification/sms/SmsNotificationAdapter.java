package com.lab4.notification.sms;

import com.lab4.notification.Notification;

public class SmsNotificationAdapter implements Notification {

    private final Sms sms;
    private String phone;
    private String sender;

    public SmsNotificationAdapter(Sms sms, String phone, String sender) {
        this.sms = sms;
        this.phone = phone;
        this.sender = sender;
    }

    public void send(String title, String message) {
        sms.sendSms(phone, sender, title, message);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}
