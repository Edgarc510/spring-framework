package com.myproject.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
public class Cinema extends BaseEntity{

    private String name;
    private String sponsored_name;

//    private Location location;


}
