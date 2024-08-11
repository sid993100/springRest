package com.springrest.springRest.controller;

import com.springrest.springRest.entities.Courses;
import com.springrest.springRest.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private CourseService coursesService;

    @GetMapping("/home")
    public String home(){
        return "This is home";
    }

//    --------get courses----
    @GetMapping("/courses")
    public List<Courses> getCourses(){
        return  this.coursesService.getCourses();
    }

//    ------------get courses by id--------------
    @GetMapping("/courses/{courseId}")
    public Courses getCourse(@PathVariable String courseId){
        return  this.coursesService.getCourse(Long.parseLong(courseId));
    }

//    ----add or post-----
    @PostMapping("/courses")
    public Courses addCourse(@RequestBody Courses course){
        return this.coursesService.addCourse(course);
    }

//    ----------------update-----------
    @PutMapping("/courses")
    public Courses updateCourse(@RequestBody Courses course){
        return this.coursesService.updateCourse(course);
    }

}
