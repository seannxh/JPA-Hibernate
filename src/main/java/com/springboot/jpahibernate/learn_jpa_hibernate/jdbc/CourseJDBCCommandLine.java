package com.springboot.jpahibernate.learn_jpa_hibernate.jdbc;

import com.springboot.jpahibernate.learn_jpa_hibernate.jpa.JpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJDBCCommandLine implements CommandLineRunner {
//    @Autowired
//    private JdbcRespository repository;

    @Autowired
    private JpaRepository repository;
    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn JPA", "in28minutes"));
        repository.insert(new Course(2, "Learn JDBC", "in28minutes"));


        repository.deleteById(1);

        System.out.println(repository.fineById(2));
    }
}
