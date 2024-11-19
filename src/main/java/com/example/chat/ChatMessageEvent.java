package com.example.chat;

/**
 * Ereignis-Klasse für Chat-Nachrichten.
 */
public class ChatMessageEvent {

    private final String message;

    private final String sender;

    public ChatMessageEvent(String message, String sender) {
        this.message = message;
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public String getSender() {
        return sender;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ChatMessageEvent{");
        sb.append("message='").append(message).append('\'');
        sb.append(", sender='").append(sender).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
