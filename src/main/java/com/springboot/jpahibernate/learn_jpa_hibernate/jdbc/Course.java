package com.springboot.jpahibernate.learn_jpa_hibernate.jdbc;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity //can map entity ()
public class Course {
    //Mapping this to the table
    @Id
    private long id;
    @Column(name="name")
    private String name;
    @Column(name="author")//can map my bean to a different name in the database then actually used
    private String author;

    public Course() {
        
    }
    public Course(long id, String name, String author) {
        super();
        this.id = id;
        this.name = name;
        this.author = author;
        
    }

    public long getId() {
        return id;
    }

    public String name(){
        return name;

    }

    public String author(){
        return author;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public Object getName() {
        return name;
    }

    public Object getAuthor() {
        return author;
    }
    //Constructor
    //TO String

}
