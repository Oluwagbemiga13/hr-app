package com.example.hrapp.controller;


import com.example.hrapp.pojo.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import java.util.List;
import java.util.Optional;

public interface EmployeeController {

    @GetMapping(value = "/employee/{id}")
    //@Path(value = "{id}")
    public Optional<Employee> findById(@PathVariable long id);


    public List<Employee> findAll(@QueryParam("size") int size,@QueryParam("page") int page);

    public Employee insertEmployee(Employee employee);
}
