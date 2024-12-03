package com.example.chat;

import jakarta.annotation.*;
import jakarta.enterprise.context.*;
import jakarta.enterprise.inject.*;

import java.util.*;

/**
 * Alternative-Implementierung des Chat-Loggers für Tests.
 */
@ApplicationScoped
@Alternative
@Priority(1) // Priorität, um diese Implementierung während der Tests zu bevorzugen
public class TestChatLogger implements ChatLogger {

    private final List<String> loggedMessages = new ArrayList<>();

    @Override
    public void logMessage(ChatMessageEvent event) {
        loggedMessages.add(event.getSender() + ": " + event.getMessage());
    }

    public List<String> getLoggedMessages() {
        return loggedMessages;
    }

}
