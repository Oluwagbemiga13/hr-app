package com.example.hrapp.pojo;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Builder
@Data
public class Day {

    private final long id;

    private Date date;

}
