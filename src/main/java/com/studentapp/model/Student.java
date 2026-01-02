package com.studentapp.model;

public class Student {
    private int id;
    private String name;
    private String email;
    private int year;

    // Constructors
    public Student() {}

    public Student(String name, String email, int year) {
        this.name = name;
        this.email = email;
        this.year = year;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", email=" + email + ", year=" + year + "]";
    }
}