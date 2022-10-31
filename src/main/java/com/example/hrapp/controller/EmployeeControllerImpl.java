package com.example.hrapp.controller;

import com.example.hrapp.pojo.Employee;
import com.example.hrapp.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("/employee")
public class EmployeeControllerImpl implements EmployeeController{
    private final EmployeeService employeeService;

    @Override
    public Employee findById(long id) {
        return employeeService.findById(id);
    }

    @Override
    public List<Employee> findAll(int size, int page) {

        return employeeService.findAll(size,page);
    }

//    @Override
//    public Employee insertEmployee(Employee employee) {
//        return employeeService.insertEmployee(employee);
//    }
}
