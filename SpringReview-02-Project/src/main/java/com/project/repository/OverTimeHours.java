package com.project.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Qualifier("OT")
@Component
public class OverTimeHours implements  HoursRepository{

    public int getHours(){
        return 15;
    }
}
