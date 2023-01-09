package com.myproject.entity;

import javax.persistence.*;
import javax.persistence.MappedSuperclass;

@MappedSuperclass

public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
