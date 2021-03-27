package com.ms.profilejava.message;

public class ResponseMessage implements Messages {
    @Override
    public void message(String str) {
        System.out.println("Write Response Message :: " + str);
    }

    @Override
    public String get(String str) {
        return str;
    }
}
