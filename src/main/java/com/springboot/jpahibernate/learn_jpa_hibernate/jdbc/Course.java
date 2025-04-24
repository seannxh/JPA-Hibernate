package com.springboot.jpahibernate.learn_jpa_hibernate.jdbc;

public class Course {
    private long id;
    private String name;
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
