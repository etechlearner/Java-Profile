package com.ms.profilejava.message;

public interface MessagesFactory {
    public Messages get(MessageType messageType);
}