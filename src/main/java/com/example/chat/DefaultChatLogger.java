package com.example.chat;

import jakarta.enterprise.context.*;
import org.slf4j.*;

/**
 * Standard-Implementierung des Chat-Loggers.
 */
@ApplicationScoped
public class DefaultChatLogger implements ChatLogger {

    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultChatLogger.class);

    @Override
    public void logMessage(ChatMessageEvent event) {
        LOGGER.info("Nachricht von {}: {}", event.getSender(), event.getMessage());
    }
}