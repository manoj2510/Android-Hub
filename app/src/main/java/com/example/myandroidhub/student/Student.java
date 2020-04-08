package com.example.myandroidhub.student;

public class Student
{
    private String id, marks;
    private String name,surname;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Student(String id, String marks, String name, String surname) {
        this.id = id;
        this.marks = marks;
        this.name = name;
        this.surname = surname;
    }
}
