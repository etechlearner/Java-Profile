package com.ms.profilejava.message;

public class LogMessage implements Messages {
    @Override
    public void message(String str) {
        System.out.println("Write Log Message :: " + str);
    }

    @Override
    public String get(String str) {
        return str;
    }
}
