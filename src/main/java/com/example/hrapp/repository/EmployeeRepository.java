package com.example.hrapp.repository;

import com.example.hrapp.pojo.Employee;
import com.github.javafaker.Faker;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

@RequiredArgsConstructor
@Repository
public class EmployeeRepository {

    private Map<Long, Employee> employeeMap;

    private Faker faker;

    /**
     * Method for filling "DataBase" with fake employees.
     */
    @PostConstruct
    public void init() {
        faker = new Faker();

        employeeMap = LongStream.range(0, 1000)
                .mapToObj(i -> Employee
                        .builder()
                        .id(i)
                        .fullName(faker.name().fullName())
                        .build())
                .collect(Collectors.toMap(Employee::getId, employee -> employee));

    }

    /**
     * Method for finding Employee by their id
     * @param id of Employee
     * @return Optional of Employee
     */
    public Optional<Employee> findById(long id) {
        return Optional.of(employeeMap.get(id));
    }

    public List<Employee> findAll(int size, int page){
        return this.employeeMap
                .values()
                .stream()
                .sorted(Comparator.comparing(Employee::getId))
                .skip((long) page * size)
                .limit(size)
                .toList();
    }

    /**
     * Basic method for getting size of "Database"
     * @return size of employeeMap
     */
    public int count(){
        return this.employeeMap.size();
    }

    /**
     * Method for inserting Employee to "Database", id is generated automatically
     * @param employee that needs to be inserted
     * @return employee that just been inserted
     */
    public Employee insertEmployee(Employee employee){

        employeeMap.put(employee.getId(), employee);
        return employee;
    }
}
