package com.myproject.controller;

import com.myproject.dto.CourseDTO;
import com.myproject.service.CourseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/courses")
public class CourseController {


    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public List<CourseDTO> getAllCourses(){
        List<CourseDTO> list = courseService.getCourses();
        return list;

    }
    @GetMapping("{id}")
    public CourseDTO getCourseById(@PathVariable("id") Long courseId){
        CourseDTO course = courseService.getCourseById(courseId);
        return course;
    }
    @GetMapping("category/{name}")
    public List<CourseDTO> getCourseByCategory(@PathVariable("name")String category){
        return courseService.getCoursesByCategory(category);
    }
//    @GetMapping("{id}")
//    public CourseDTO getCourseById(@PathVariable("id") Long courseId){
//        return courseService.getCourseById(courseId);
//    }
//
//    @GetMapping("category/{name}")
//    public List<CourseDTO> getCourseByCategory(@PathVariable("name") String category){
//        return courseService.getCoursesByCategory(category);
//
//    }
//
//    @PostMapping
//    public CourseDTO createCourse(@RequestBody CourseDTO course){
//        return courseService.createCourse(course);
//    }
//
//    @PutMapping("{id}")
//    public void updateCourse(@PathVariable("id") Long courseId,@RequestBody CourseDTO course){
//        courseService.updateCourse(courseId,course);
//    }
//
//    @DeleteMapping("{id}")
//    public void deleteCourseById(@PathVariable("id") Long courseId){
//        courseService.deleteCourseById(courseId);
//    }
//
//    @DeleteMapping
//    public void deleteCourses(){
//        courseService.deleteCourses();
//    }
}
