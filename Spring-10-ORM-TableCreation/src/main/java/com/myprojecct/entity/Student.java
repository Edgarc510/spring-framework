package com.myprojecct.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    private Long Idl;
    private String firstName;
    private String lastName;
    private String email;
}
