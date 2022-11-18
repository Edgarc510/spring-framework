package com.myproject.bootstrap;

import com.myproject.repository.DepartmentRepository;
import com.myproject.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    private final RegionRepository regionRepository;
    private final DepartmentRepository departmentRepository;

    public DataGenerator(RegionRepository regionRepository, DepartmentRepository departmentRepository) {
        this.regionRepository = regionRepository;
        this.departmentRepository = departmentRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("------------------REGION START--------------------");

        System.out.println("findByCountry = " + regionRepository.findByCountry("Canada"));

        System.out.println("findDistinctByCountry = " + regionRepository.findDistinctByCountry("Canada"));

        System.out.println("findByCountryContaining = " + regionRepository.findByCountryContaining("United"));

        System.out.println("findByCountryContainingOrderByCountry = " + regionRepository.findByCountryContainingOrderByCountry("Asia"));

        System.out.println("findTopByCountry = " + regionRepository.findTop2ByCountry("Canada"));

        System.out.println("------------------REGION END--------------------");

        System.out.println();

        System.out.println("------------------DEPARTMENTS START--------------------");

        System.out.println(departmentRepository.findByDepartment("Toys"));
        System.out.println(departmentRepository.findByDivision("Kids"));
        System.out.println(departmentRepository.findDistinctTop3ByDivisionContains("Hea"));


        System.out.println("------------------DEPARTMENTS END--------------------");
    }
}
