package com.springrest.springRest.services;

import com.springrest.springRest.dao.CourseDao;
import com.springrest.springRest.entities.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl extends CourseService {

    @Autowired
    private CourseDao courseDao;

//    List<Courses> list;

    public CourseServiceImpl() {
//        list = new ArrayList<>();
//        list.add(new Courses(145, "java", "Sping java course"));
    }

    @Override
    public List<Courses> getCourses() {
        return courseDao.findAll();
    }

    @Override
    public Courses getCourse(long courseId) {
//        Courses c = null;
//        for (Courses course : list) {
//            if (course.getId() == courseId) {
//                c = course;
//                break;
//            }
//        }
        return courseDao.getOne(courseId);
    }

    public Courses addCourse(Courses course) {
//        list.add(course);

        courseDao.save(course);
        return course;
    }

    @Override
    public Courses updateCourse(Courses course){
//        list.forEach(e -> {
//            if(e.getId() == course.getId()){
//                e.setTitle(course.getTitle());
//                e.setDescription(course.getDescription());
//            }
//        });

        courseDao.save(course);
        return course;
    }
}


