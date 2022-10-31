package com.example.hrapp.controller;

import com.example.hrapp.pojo.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
@RequestMapping("/message")
public interface MessageController {
    /**
     * Když zavoláš http://localhost:8080/message/get, dostaneš helloworld odpověď jako json,
     * který jsem definoval jako Message v pojo balíčku.
     * @return
     */
    @GetMapping(value = "/get", produces = "application/json")
    @ResponseBody Message helloWorld();

    /**
     * to samý v bledě modrém.
     * @return
     */
    @GetMapping(value = "/znovu", produces = "application/json")
    @ResponseBody Message anotherMessage();

    /**
     * http://localhost:8080/message/text vrátí se ti jen text.
     * @return
     */
    @GetMapping(value = "/text")
    @ResponseBody String textMessage();

}
