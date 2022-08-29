package com.project.repository;

import com.project.model.Employee;
import org.springframework.stereotype.Component;

@Component
public class DBEmployeeRepository implements EmployeeRepository {

    @Override
    public int getHourlyRate() {
        Employee employee = new Employee("Mine","IT",55);
        return employee.getHourlyRate();
    }
}
