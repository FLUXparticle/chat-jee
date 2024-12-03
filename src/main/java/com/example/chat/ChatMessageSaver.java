package com.example.chat;

import jakarta.enterprise.context.*;
import jakarta.enterprise.event.*;
import org.slf4j.*;

/**
 * Observer zum Speichern von Nachrichten.
 */
@ApplicationScoped
public class ChatMessageSaver {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChatMessageSaver.class);

    public void saveMessage(@Observes ChatMessageEvent event) {
        LOGGER.info("Nachricht: {}", event);
    }

}
