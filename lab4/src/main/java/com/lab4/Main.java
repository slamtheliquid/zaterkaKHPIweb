package com.lab4;

import com.lab4.notification.Notification;
import com.lab4.notification.email.EmailNotification;
import com.lab4.notification.slack.Slack;
import com.lab4.notification.slack.SlackImplementor;
import com.lab4.notification.slack.SlackNotificationAdapter;
import com.lab4.notification.sms.Sms;
import com.lab4.notification.sms.SmsImplementor;
import com.lab4.notification.sms.SmsNotificationAdapter;

public class Main {

    public static void main(String[] args) {
        Notification emailNotification = new EmailNotification("slamtheliquid@gmail.com");
        emailNotification.send("to:slamtheliquid", "message_example");

        Slack slack = new SlackImplementor("slamtheliquid-slack", "adfkskk1dFrdAsd2");
        Notification slackNotification = new SlackNotificationAdapter(slack, "chat_id");
        slackNotification.send("to:all", "message_example_slack");

        Sms sms = new SmsImplementor();
        Notification smsNotification = new SmsNotificationAdapter(sms, "+447975777666", "sender");
        smsNotification.send("to:+447975777666", "message_example_sms");
    }
}
