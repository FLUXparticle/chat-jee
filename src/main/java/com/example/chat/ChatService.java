package com.example.chat;

import jakarta.enterprise.context.*;
import jakarta.enterprise.event.*;
import jakarta.inject.*;
import org.slf4j.*;

/**
 * Service-Klasse für die Verwaltung von WebSocket-Sessions und das Senden von Nachrichten.
 */
@ApplicationScoped
public class ChatService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChatService.class);

    @Inject
    private Event<ChatMessageEvent> chatEvent;

    @Inject
    private ChatLogger chatLogger;

    /**
     * Sendet eine Nachricht als Event und loggt sie.
     *
     * @param message Die Nachricht.
     * @param sender Der Absender.
     */
    public void sendMessage(String message, String sender) {
        ChatMessageEvent event = new ChatMessageEvent(message, sender);
        chatEvent.fire(event); // Event auslösen
        chatLogger.logMessage(event);
    }

}
