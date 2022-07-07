package com.rpmfood.rpm.service;

import com.rpmfood.rpm.model.Employee;
import com.rpmfood.rpm.repository.EmployeeRepository;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @SneakyThrows
    public List<Employee> listEmployee() {
        return employeeRepository.listEmployee();
    }

}
