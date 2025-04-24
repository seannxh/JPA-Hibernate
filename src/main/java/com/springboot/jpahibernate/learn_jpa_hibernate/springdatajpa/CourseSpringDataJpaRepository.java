package com.springboot.jpahibernate.learn_jpa_hibernate.springdatajpa;

import com.springboot.jpahibernate.learn_jpa_hibernate.jdbc.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
    List<Course> findByAuthor(String author);
    List<Course> findByName(String name);
}
