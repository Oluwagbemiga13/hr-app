package com.example.hrapp.pojo;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Builder
@Data
@Getter
public class Employee {

    private long id;

    private String fullName;



}
