package com.example.hrapp.service;

import com.example.hrapp.pojo.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MessageService {

   public Message getHelloWorld(){
       return Message.builder().id(0).contentOfMessage("HelloWorld").build();
   }

   public Message getAnotherMessage(){
       return Message.builder().contentOfMessage("Another Message").build();
   }
}
