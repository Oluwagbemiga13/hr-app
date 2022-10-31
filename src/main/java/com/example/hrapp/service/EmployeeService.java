package com.example.hrapp.service;

import com.example.hrapp.pojo.Day;
import com.example.hrapp.pojo.Employee;
import com.example.hrapp.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.joda.time.DateTimeZone;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeService {



    private final EmployeeRepository employeeRepository;
    private final DayService dayService;

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
        employee.setId(employeeRepository.count());
        employeeRepository.insertEmployee(employee);
        return employee;
    }

    public Employee startDay(Employee employee){
        if (!employee.getDayList().isEmpty()){
            employee.getDayList().add(dayService.startDay());
        }
        else {
            employee.setDayList(List.of(dayService.startDay()));
        }
        return employee;
    }

    public Employee endDay(Employee employee){
        List <Day> employeeDayList = employee.getDayList();
        Day currentDay = employeeDayList.get(employeeDayList.size() - 1);

        currentDay.setEndOfDay(LocalTime.now());
        dayService.countWorkHours(currentDay);

        return employee;
    }

}
