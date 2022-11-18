package com.myproject.repository;

import com.myproject.entity.Employee;
import net.bytebuddy.asm.Advice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    //Display all employees with email address
    List<Employee> findByEmail(String email);

    //Display all employees with first name '' and last name  ' ' also show all employees with an email address
    List<Employee> findByFirstNameAndLastNameOrEmail(String firstName,String lastName,String email);

    //Display all employees that firstName is not ' '
    List<Employee> findByFirstNameNot(String name);

    //Display all employees where last name starts with ' '
    List<Employee> findByLastNameStartingWith(String lastName);

    //Display all employees with salaries higher than ' '
    List<Employee> findBySalaryGreaterThan(Integer salary);

    //Display all employees with the salaries less than ' '
    List<Employee> findBySalaryLessThanEqual(Integer salary);

    //Display all employees that has been hired between ' ' and ''
    List<Employee> findByHireDateBetween(LocalDate startDate, LocalDate endDate);

    //Display all employees where salaries greater and equal to ' ' in order
    List<Employee> findBySalaryGreaterThanEqualOrdeOrderBySalaryDesc(Integer salary);

    //Display top unique 3 employees that is making less than ''
    List<Employee> findDistinctByTop3BySalaryLessThan(Integer Salary);

    //Display all employees that do not have email address
    List<Employee> findByEmailIsNull();



}
