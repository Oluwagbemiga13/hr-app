package com.example.hrapp.controller;

import com.example.hrapp.pojo.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
@ApplicationPath("/message")
public interface MessageController {

    @GET
    @Path("/get")
    Message helloWorld();

}
