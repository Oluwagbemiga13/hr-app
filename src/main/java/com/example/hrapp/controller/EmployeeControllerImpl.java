package com.example.hrapp.controller;

import com.example.hrapp.pojo.Employee;
import com.example.hrapp.service.EmployeeService;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class EmployeeControllerImpl implements EmployeeController{
    private final EmployeeService employeeService;

    @Override
    public Optional<Employee> findById(long id) {
        return employeeService.findById(id);
    }

    @Override
    public List<Employee> findAll(int size, int page) {
        return employeeService.findAll(size,page);
    }

    @Override
    public Employee insertEmployee(Employee employee) {
        return employeeService.insertEmployee(employee);
    }
}
