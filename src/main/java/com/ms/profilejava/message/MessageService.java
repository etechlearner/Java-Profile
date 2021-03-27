package com.ms.profilejava.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Autowired
    private MessagesFactory messagesFactory;

    public void log(String messageString, MessageType messageType) {
        Messages messages = messagesFactory.get(messageType);
        System.out.println("MessageService . doMessage..  " + messages);
        messages.message(messageString);
    }

    public String get(String messageString, MessageType messageType) {
        Messages messages = messagesFactory.get(messageType);
        System.out.println("MessageService . doMessage..  " + messages);
        return messages.get(messageString);
    }



}