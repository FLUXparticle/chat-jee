package com.example.chat;

import jakarta.enterprise.context.*;
import org.slf4j.*;

@ApplicationScoped
public class ChatPushBean {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChatPushBean.class);

    public void onChatMessage(ChatMessageEvent event) {
        String message = event.getMessage();
        LOGGER.info("Nachricht an Benutzer gesendet: {}", message);
    }

}
