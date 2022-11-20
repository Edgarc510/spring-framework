package com.myproject.bootstrap;

import com.myproject.repository.CourseRepository;
import com.myproject.repository.DepartmentRepository;
import com.myproject.repository.EmployeeRepository;
import com.myproject.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    private final RegionRepository regionRepository;
    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;

    private final CourseRepository courseRepository;


    public DataGenerator(RegionRepository regionRepository, DepartmentRepository departmentRepository, EmployeeRepository employeeRepository, CourseRepository courseRepository) {
        this.regionRepository = regionRepository;
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
        this.courseRepository = courseRepository;
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

        System.out.println("------------------EMPLOYEE START--------------------");
        System.out.println("get employee detail =" + employeeRepository.getEmployeeDetail());
        System.out.println("get employee salary =" + employeeRepository.getEmployeeSalary());

        System.out.println("------------------EMPLOYEE END--------------------");

        System.out.println();

        System.out.println("------------------COURSE START--------------------");
        System.out.println("courseRepository.findByCategory = " + courseRepository.findByCategory("Spring"));
        courseRepository.findByCategory("Spring").forEach(System.out::println);
        System.out.println("--------------------------------------------------------------");
        courseRepository.findByCategoryOrderByName("Spring").forEach(System.out::println);
        System.out.println("courseRepository.existsByName(\"JavaScript for all\") = " + courseRepository.existsByName("JavaScript for all"));
        System.out.println("courseRepository.existsByName(\"Spring\") = " + courseRepository.countByCategory("Spring"));
        System.out.println("courseRepository.findByNameStartsWith(\"Scalable\") = " + courseRepository.findByNameStartsWith("Scalable"));
//        courseRepository.streamByCategory("Spring").forEach(System.out::println);

        System.out.println("------------------COURSE END--------------------");

    }
}
