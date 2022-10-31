package com.example.hrapp.pojo;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Message {

    private long id;

    private String contentOfMessage;

}
