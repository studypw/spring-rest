package com.spring.study.services;

import com.spring.study.entity.Employee;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.HttpMethod.POST;

/**
 * Created by rameshkale on 26/02/17.
 */
@RestController
public class SampleRestService {
    List<Employee> employees = new ArrayList<>();

    public SampleRestService(){


        Employee employee1 = new Employee();
        employee1.setId(1);
        employee1.setName("Poonam");
        employee1.setSalary(20000);


        employees.add(employee1);

        Employee employee2 = new Employee();
        employee2.setId(2);
        employee2.setName("Anwesh");
        employee2.setSalary(10000);

        employees.add(employee2);
    }


    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }


    @RequestMapping("/employees")
    public List<Employee> getEmployeesById(@RequestParam Integer id){
        System.out.println("Query param - id = " + id);
        return employees;
    }

    @RequestMapping("/employees/{id}")
    public Employee getEmployees(@PathVariable Integer id){
        System.out.println("id = " + id);
        System.out.println("employees = " + employees);
        return employees.get(id);
    }

    @RequestMapping(value = "/employees", method = RequestMethod.POST, consumes = "application/json")
    public List<Employee> addEmployee(@RequestBody Employee employee){

        employees.add(employee);
        return employees;
    }


}
