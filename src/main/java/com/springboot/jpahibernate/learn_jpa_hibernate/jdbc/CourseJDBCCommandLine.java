package com.springboot.jpahibernate.learn_jpa_hibernate.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJDBCCommandLine implements CommandLineRunner {
    @Autowired
    private JdbcRespository repository;
    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn AWS", "in28minutes"));
        repository.insert(new Course(2, "Learn Spring Boot", "in28minutes"));


        repository.delete(1);

        System.out.println(repository.find(2));
    }
}
