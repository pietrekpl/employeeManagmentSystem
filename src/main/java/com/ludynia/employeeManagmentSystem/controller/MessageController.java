package com.ludynia.employeeManagmentSystem.controller;


import com.ludynia.employeeManagmentSystem.model.Chat;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {

    @MessageMapping("send-msg-at")
    @SendTo("/topic/receive-msg-at")
    public Chat chatWithUser(Chat chat) {
        return chat;
    }

}
