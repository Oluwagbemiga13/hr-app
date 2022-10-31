package com.example.hrapp.controller.impl;

import com.example.hrapp.controller.inter.MessageController;
import com.example.hrapp.pojo.Message;
import com.example.hrapp.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
@RequiredArgsConstructor
public class MessageControllerImpl  implements MessageController {

    private final MessageService messageService;

    @Override
    public Message helloWorld(){
        return messageService.getHelloWorld();
    }

    @Override
    public Message anotherMessage() {
        return messageService.getAnotherMessage();
    }

    @Override
    public String textMessage() {
        return "Plain_text_nothing_else. Good luck Carlos! Time: " + LocalTime.now();
    }
}
