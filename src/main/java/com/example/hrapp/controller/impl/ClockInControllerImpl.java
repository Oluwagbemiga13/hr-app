package com.example.hrapp.controller.impl;

import com.example.hrapp.controller.inter.ClockInController;
import com.example.hrapp.pojo.Employee;
import com.example.hrapp.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/timecard")
public class ClockInControllerImpl implements ClockInController {

    private final EmployeeService employeeService;

    @Override
    public Employee clockIn(long id) {

        return employeeService.startDay(employeeService.findById(id));
    }

    @Override
    public Employee clockOut(long id) {
        return employeeService.endDay(employeeService.findById(id));
    }
}
