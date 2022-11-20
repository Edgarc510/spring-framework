package com.myproject.repository;

import com.myproject.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.stream.Stream;

public interface CourseRepository extends JpaRepository<Course,Long> {

    //find all courses by category
    //dry queries findBy find = select * by = where
    List<Course> findByCategory(String category);

    //find all courses by category and order the entities by name
    List<Course> findByCategoryOrderByName(String category);

    //checks if a course with the provided name exists, return true if course exists, false otherwise
    boolean existsByName(String name);

    //Return the count of courses for the provided category
    int countByCategory(String category);
    //find all the courses that start with the provided course name
    List<Course> findByNameStartsWith(String name);
    //find all courses by category and returns a stream
//    Stream<Course> streamByCategory(String category);

}
