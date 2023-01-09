package com.myproject.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.myproject.enums.UserRole;
import lombok.*;


import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "account_details")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer"},ignoreUnknown = true)//ignoreUnknown will ignore anything not included in the class fields, security related
public class Account extends BaseEntity{

    private String name;
    @JsonIgnore
    private String address;
    private String country;
    private String state;
    private String city;
    private Integer age;
    @Column(name = "postal_code")
    private String postalCode;

    @Enumerated(EnumType.STRING)
    private UserRole role = UserRole.USER;

    @OneToOne(mappedBy = "account")
    @JsonBackReference //is the back part of reference - it will be omitted from serialization
    private User user;

}
