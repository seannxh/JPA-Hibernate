package com.springboot.jpahibernate.learn_jpa_hibernate.springdatajpa;

import com.springboot.jpahibernate.learn_jpa_hibernate.jdbc.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

}
