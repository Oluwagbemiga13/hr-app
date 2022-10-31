package com.example.hrapp.controller;


import com.example.hrapp.pojo.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;


@RequestMapping("/employee")
public interface EmployeeController {

    @GetMapping(value = "/{id}", produces = "application/json")
    Employee findById(@PathVariable long id);


    @GetMapping(value = "/list/{size}/{page}", produces = "application/json")
    List<Employee> findAll(@PathVariable int size,@PathVariable int page);

    //TODO:
//    Employee insertEmployee(Employee employee);


}
