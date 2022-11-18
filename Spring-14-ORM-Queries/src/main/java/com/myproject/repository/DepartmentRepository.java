package com.myproject.repository;

import com.myproject.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department,Long> {

    //Display all departments in the furniture department

    List<Department> findByDepartment(String department);

    //Display all department in the health division
    List<Department> findByDivision(String division);
    List<Department> findByDivisionIs(String division);
    List<Department> findByDivisionEquals(String division);

    //Display top 3 departments with division includes 'Hea' without duplicates
    List<Department>findDistinctTop3ByDivisionContains(String contains);



}
