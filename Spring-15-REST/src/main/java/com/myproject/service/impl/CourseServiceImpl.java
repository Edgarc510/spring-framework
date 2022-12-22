package com.myproject.service.impl;

import com.myproject.dto.CourseDTO;
import com.myproject.entity.Course;
import com.myproject.repository.CourseRepository;
import com.myproject.service.CourseService;
import com.myproject.util.MapperUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService {

    private CourseRepository courseRepository;

    private final MapperUtil mapperUtil;

    public CourseServiceImpl(CourseRepository courseRepository, MapperUtil mapperUtil) {
        this.courseRepository = courseRepository;
        this.mapperUtil = mapperUtil;
    }


    @Override
    public CourseDTO createCourse(CourseDTO courseDTO) {
        return null;
    }

    @Override
    public CourseDTO getCourseById(long courseId) {
        Course course = courseRepository.findById(courseId).get();
        CourseDTO courseDTO = mapperUtil.convert(course, new CourseDTO());
        return courseDTO;
    }

    @Override
    public List<CourseDTO> getCoursesByCategory(String category) {
        List<Course> list = courseRepository.findAllByCategoryIgnoreCase(category);
        return list.stream().map(obj -> mapperUtil.convert(obj,new CourseDTO())).collect(Collectors.toList());
    }

    @Override
    public List<CourseDTO> getCourses() {
        List<Course> list = courseRepository.findAll();
        return list.stream().map(obj -> mapperUtil.convert(obj, new CourseDTO())).collect(Collectors.toList());
    }

    @Override
    public void updateCourse(Long courseId, CourseDTO courseDTO) {

    }

    @Override
    public void deleteCourseById(long courseId) {

    }

    @Override
    public void deleteCourses() {

    }


}
