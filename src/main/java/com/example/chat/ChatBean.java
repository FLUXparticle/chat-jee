package com.example.chat;

import jakarta.faces.view.*;
import jakarta.inject.*;
import org.slf4j.*;

import java.io.*;

/**
 * Managed Bean für die Chat-Funktionalität.
 * Verwaltet Benutzerinteraktionen und kommuniziert mit dem ChatService.
 */
@Named
@ViewScoped
public class ChatBean implements Serializable {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChatBean.class);

    @Inject
    private ChatService chatService;

    private String message = "";

    /**
     * Sendet eine Nachricht über den ChatService.
     */
    public void sendMessage() {
        if (message != null && !message.trim().isEmpty()) {
            LOGGER.info("Nachricht von Benutzer gesendet: {}", message);
            String sender = Thread.currentThread().getName();
            chatService.sendMessage(message, sender);
            message = ""; // Eingabefeld nach dem Senden leeren
        } else {
            LOGGER.warn("Leere Nachricht wurde versucht zu senden");
        }
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
