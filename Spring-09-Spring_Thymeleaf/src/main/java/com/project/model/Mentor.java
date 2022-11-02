package com.project.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mentor {

    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String batch;
    private String graduated;
    private String company;
}
