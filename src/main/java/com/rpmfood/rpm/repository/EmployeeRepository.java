package com.rpmfood.rpm.repository;

import com.rpmfood.rpm.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Employee> listEmployee() {
        StringBuilder sb = new StringBuilder();
        sb.append("select * from employee ");

        List<Employee> result = jdbcTemplate.query(sb.toString(), new BeanPropertyRowMapper(Employee.class));
        return result;
    }
}
