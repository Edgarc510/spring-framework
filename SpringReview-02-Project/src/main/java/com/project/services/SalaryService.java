package com.project.services;

import com.project.repository.EmployeeRepository;
import com.project.repository.HoursRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class SalaryService {

    EmployeeRepository employeeRepository;
    HoursRepository hoursRepository;

    public SalaryService(EmployeeRepository employeeRepository,  @Qualifier("RH") HoursRepository hoursRepository) {
        this.employeeRepository = employeeRepository;
        this.hoursRepository = hoursRepository;
    }

    public void calculateRegularSalary(){
        System.out.println(employeeRepository.getHourlyRate()*hoursRepository.getHours());

    }

}
