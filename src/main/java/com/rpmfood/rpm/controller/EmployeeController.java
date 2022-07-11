package com.rpmfood.rpm.controller;

import com.rpmfood.rpm.model.Employee;
import com.rpmfood.rpm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/list")
    public ResponseEntity<List<Employee>> listEmployee() {
        List<Employee> employee = employeeService.listEmployee();
        System.out.println("comit branch develop");
        return  ResponseEntity.status(HttpStatus.OK).body(employee);
    }
}
