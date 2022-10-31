package com.example.hrapp.service;

import com.example.hrapp.pojo.Employee;
import com.example.hrapp.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    /**
     * Method for finding Employee by their id
     * @param id of Employee
     * @return Optional of Employee
     */
    public Employee findById(long id) {
        if(employeeRepository.findById(id).isPresent()){
            return employeeRepository.findById(id).get();
        }
        throw new RuntimeException("Null pointer - TODO");
    }

    public List<Employee> findAll(int size, int page){
        return employeeRepository.findAll(size, page);
    }

    /**
     * Basic method for getting size of "Database"
     * @return size of employeeMap
     */


    /**
     * Method for inserting Employee to "Database", id is generated automatically
     * @param employee that needs to be inserted
     * @return employee that just been inserted
     */
    public Employee insertEmployee(Employee employee){
        employeeRepository.insertEmployee(employee);
        return employee;
    }
}
