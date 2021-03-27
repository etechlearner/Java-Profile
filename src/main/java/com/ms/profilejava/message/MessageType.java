package com.ms.profilejava.message;

public enum MessageType {

    LOG("logMessage"), RESPONSE("responseMessage");

    private final String value;

    MessageType(String input) {
        this.value = input;
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}