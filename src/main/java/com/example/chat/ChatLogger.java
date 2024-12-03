package com.example.chat;

/**
 * Interface für Chat-Logger.
 */
public interface ChatLogger {
    void logMessage(ChatMessageEvent event);
}