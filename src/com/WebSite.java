package com;

import com.classJump.course.Course;
import com.classJump.stuff.Teacher;
import java.util.ArrayList;

public class WebSite {


    private ArrayList<Teacher> teach;

    public WebSite() {
        teach = new ArrayList<>();
    }

  

    public  ArrayList<Teacher> getTeach() {
        return teach;
    }

  

    @Override
    public String toString() {
        return "ClassJumpDto{"  + ", teach=" + teach + '}';
    }
    

    public boolean register(String name, String email, String pass, ArrayList<Course> course) {
        

        if (searchRegisteration(name, email) !=null) {
            return false;
        }
        
        Teacher td = new Teacher(name, email, pass, course);
        this.getTeach().add(td);
        
        return true;

    }
//

    public boolean login(String name, String pass) {

        if(searchlogin(name, pass) !=null) {
            return true;

        }

        return false;

    }

    public Teacher searchRegisteration(String name, String email) {
        for (int i = 0; i < this.getTeach().size(); i++) {

            if (this.getTeach().get(i).getName().equalsIgnoreCase(name)
                    && this.getTeach().get(i).getPassword().equals(email)) {
                return this.getTeach().get(i);

            }
        }
        return null;
    }

    public Teacher searchlogin(String name, String pass) {
       for (int i = 0; i < this.getTeach().size(); i++) {

            if (this.getTeach().get(i).getName().equalsIgnoreCase(name)
                    && this.getTeach().get(i).getPassword().equals(pass)) {
                return this.getTeach().get(i);

            }
        }
        return null;
    }
}
