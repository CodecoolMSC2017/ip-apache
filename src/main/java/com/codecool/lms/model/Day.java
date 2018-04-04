package com.codecool.lms.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Day {

    private String date;
    private List<Student> students;

    public Day( List<Student> students,String date) {
        this.date = date;
        this.students = students;
    }

    public String getDate() {
        return date;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
