package com.example.hrapp.controller.inter;

import com.example.hrapp.pojo.Day;
import com.example.hrapp.pojo.Employee;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/timecard")
public interface ClockInController {

    @PostMapping(value = "/in/{id}", produces = "application/json")
    Employee clockIn(@PathVariable long id);

    @PostMapping(value = "/out/{id}", produces = "application/json")
    Employee clockOut(@PathVariable long id);
}
