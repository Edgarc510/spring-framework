package com.myprojecct.repository;

import com.myprojecct.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    // you can create yor own methods here
    //custom methods
    //sql
}
