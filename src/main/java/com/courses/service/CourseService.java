package com.courses.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.courses.entity.Course;
import com.courses.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	public List<Course> getAllCourses() {
		return courseRepository.findAll();
	}

	public Course getCourseById(Long courseId) {
		return courseRepository.findById(courseId).orElse(null);
	}

	public Course saveCourse(Course course) {
		return courseRepository.save(course);
	}

	public Course updateCourse(Long courseId, Course updatedCourse) {
		Course existingCourse = courseRepository.findById(courseId).orElse(null);
		return courseRepository.save(existingCourse);
	}

	public void removeCourse(Long courseId) {
		courseRepository.deleteById(courseId);
	}
}
