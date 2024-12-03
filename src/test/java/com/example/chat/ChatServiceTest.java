package com.example.chat;

import jakarta.inject.*;
import org.jboss.weld.junit5.auto.*;
import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

@EnableAutoWeld
public class ChatServiceTest {

    @Inject
    private ChatService chatService;

    @Inject
    private TestChatLogger testChatLogger;

    @Test
    public void testAlternativeChatLogger() {
        // Sende eine Nachricht
        chatService.sendMessage("Hallo Welt", "Tester");

        // Prüfe, ob die Nachricht korrekt geloggt wurde
        List<String> loggedMessages = testChatLogger.getLoggedMessages();
        assertEquals(1, loggedMessages.size());
        assertEquals("Tester: Hallo Welt", loggedMessages.get(0));
    }

}
