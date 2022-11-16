package com.myproject.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
public class Location extends BaseEntity{

    private String name;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private String country;
    private String city;
    private String state;
    private String postalCode;
    private String address;


}
