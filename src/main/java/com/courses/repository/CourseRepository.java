package com.courses.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.courses.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
