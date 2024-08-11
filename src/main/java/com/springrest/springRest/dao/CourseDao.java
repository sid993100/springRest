package com.springrest.springRest.dao;

import com.springrest.springRest.entities.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Courses, Long> {

}
