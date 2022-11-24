package com.example.hrapp.pojo;

import lombok.Builder;
import lombok.Data;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;


@Builder
@Data
public class Day {

//test
    private final long id;

    private LocalDate date;

    private LocalTime beginningOfDay;

    private LocalTime endOfDay;

    private Duration duration;



}
