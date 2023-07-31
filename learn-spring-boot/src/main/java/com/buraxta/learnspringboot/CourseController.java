package com.buraxta.learnspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
    @GetMapping
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1l, "AWS", "x"),
                new Course(2l, "DevOps", "x"),
                new Course(3l, "aaaaaaaa", "x")
        );

    }
}
