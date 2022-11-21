package com.lab4.notification.sms;

public class SmsImplementor implements Sms {

    public void sendSms(String phone, String sender, String title, String message) {
        System.out.println("sms was sent to the number: '" + phone + "' from '" + sender + "' titled '" + title + "';\n message: '" + message + "'.");
    }
}
