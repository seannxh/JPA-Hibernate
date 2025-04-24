package com.springboot.jpahibernate.learn_jpa_hibernate.jdbc;

import com.springboot.jpahibernate.learn_jpa_hibernate.jpa.JpaRepository;
import com.springboot.jpahibernate.learn_jpa_hibernate.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJDBCCommandLine implements CommandLineRunner {
//    @Autowired
//    private JdbcRespository repository;

//    @Autowired
//    private JpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Learn JPA", "in28minutes"));
        repository.save(new Course(2, "Learn JDBC", "in28minutes"));
        repository.save(new Course(3, "Learn Docker", "in28minutes"));


        repository.deleteById(1l);

        System.out.println(repository.findById(3l));
    }
}
