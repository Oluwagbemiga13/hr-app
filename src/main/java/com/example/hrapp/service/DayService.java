package com.example.hrapp.service;

import com.example.hrapp.pojo.Day;
import com.example.hrapp.pojo.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Service
public class DayService {

    public void countWorkHours(Day day){
        day.setDuration(Duration.between(day.getBeginningOfDay(), day.getEndOfDay()));
    }

    public Day startDay(){
        return Day.builder().date(LocalDate.now()).beginningOfDay(LocalTime.now()).build();
    }



}
