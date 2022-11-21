package com.lab1.logger;

import java.sql.Timestamp;

public class ConsoleLogger implements Logger {

    @Override
    public void log(String log) {
        System.out.println(new Timestamp(System.currentTimeMillis()) + ": " + log);
    }
}
