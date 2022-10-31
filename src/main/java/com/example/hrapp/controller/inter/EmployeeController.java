package com.example.hrapp.controller.inter;


import com.example.hrapp.pojo.Employee;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/employee")
public interface EmployeeController {

    /**
     * když zavoláš http://localhost:8080/employee/10 - vrátí ti to objekt typu json,
     * který reprezentuje jednoduchého zaměstnance (Employee.java v pojo balíčku). Ve falešné DB je uloženo
     * 1000 lidí.
     * @param id 0-999
     * @return zaměstnace, není problém je udělat složitější,
     * pro přehlednost, jsem udělal jen dva atributy
     */

    @GetMapping(value = "/{id}", produces = "application/json")
    Employee findById(@PathVariable long id);

    /**
     * když zavoláš http://localhost:8080/employee/list/50/2 - vrátí ti to objekt typu json,
     * Vrátí stránku definované velikosti,  jako list jednotlivých jsonů
     * @param size velikost stránky
     * @param page stránka
     * @return
     */
    @GetMapping(value = "/list/{size}/{page}", produces = "application/json")
    List<Employee> findAll(@PathVariable int size,@PathVariable int page);

    /**
     * Když na http://localhost:8080/employee/put pošleš json ve tvaru :
     *{
     * "fullName": "Mr. Heike Witting"
     * }
     * vložíš do "DB" nového zaměstnance.
     * @param employee
     * @return zaměstnance, kterého jsi právě vložil
     */
    @PostMapping("/put")
    Employee insertEmployee(@RequestBody Employee employee);
}
