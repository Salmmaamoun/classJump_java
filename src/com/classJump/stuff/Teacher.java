package com.classJump.stuff;

import com.classJump.course.Course;
import java.util.ArrayList;

public class Teacher {

    private String name;
    private String email;
    private String password;
    private ArrayList<Course> course;

    public Teacher(String name, String email, String password, ArrayList<Course> course) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.course = course;
        this.course = new ArrayList<>();
    }

    public Teacher(String name, String password) {
        this.name = name;
        this.password = password;
        this.course = new ArrayList<>();
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Course> getCourse() {
        return course;
    }

    public void setCourse(ArrayList<Course> course) {
        this.course = course;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "TeacherDto{" + "name=" + name + ", email=" + email + ", password=" + password + '}';
    }

    public boolean addCourse(Course cd) {

        if (!this.course.contains(cd)) {
            this.course.add(cd);
            return true;
        }
        return true;
    }

    public boolean remove(Course c) {
        if (this.course.contains(c)) {
            course.remove(c);
            return true;
        }
        return false;
    }

}
