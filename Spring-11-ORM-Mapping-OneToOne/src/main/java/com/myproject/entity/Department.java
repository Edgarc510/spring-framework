package com.myproject.entity;

import com.myproject.enums.Gender;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "departments")
@Data
@NoArgsConstructor
public class Department extends BaseEntity{


    private String department;
    private String division;

    public Department(String department, String division) {
        this.department = department;
        this.division = division;
    }
}
