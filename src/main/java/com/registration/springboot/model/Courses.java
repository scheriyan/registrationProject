package com.registration.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "courses")
public class Courses {

    private long id;
    private String courseName;
    private String time;
    private String semester;
 
    public Courses() {
  
    }
 
    public Courses(String courseName, String time, String semester) {
         this.courseName = courseName;
         this.time = time;
         this.semester = semester;
    }
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
        public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
 
    @Column(name = "course_name", nullable = false)
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
 
    @Column(name = "time", nullable = false)
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
 
    @Column(name = "semester", nullable = false)
    public String getSemester() {
        return semester;
    }
    public void setSemester(String semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", courseName=" + courseName + ", time=" + time + ", semester=" + semester
       + "]";
    }
 
}