package com.classJump.course;

import java.util.ArrayList;

public class Course {

    private String name;
    private String describtion;

    private ArrayList<Sheet> sheet;
    private ArrayList<Lecture> lec;

    public Course(String name, String describtion, ArrayList<Sheet> sheet, ArrayList<Lecture> lec) {
        this.name = name;
        this.describtion = describtion;
        this.sheet = sheet;
        this.lec = lec;
    }

  

    public ArrayList<Sheet> getSheet() {
        return sheet;
    }

    public void setSheet(ArrayList<Sheet> sheet) {
        this.sheet = sheet;
    }

    public ArrayList<Lecture> getLec() {
        return lec;
    }

    public void setLec(ArrayList<Lecture> lec) {
        this.lec = lec;
    }

   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribtion() {
        return describtion;
    }

    public void setDescribtion(String describtion) {
        this.describtion = describtion;
    }
    
     @Override
    public String toString() {
        return "Course{" + "name=" + name + ", describtion=" + describtion + ", sheet=" + sheet + ", lec=" + lec + '}';
    }

    public boolean addLecture(Lecture lec) {
        if(!this.lec.contains(lec)){
            this.lec.add(lec);
            return true;
        }
        return false;

    }

    public boolean removeLecture(Lecture lec) {
       if(this.lec.contains(lec)){
           this.lec.remove(lec);
           return true;
       }
        return false;
    }

    public boolean  addSheet(Sheet sheet) {
        if(!this.sheet.contains(sheet)){
           this.sheet.add(sheet);
           return true;
       }
        return false;

    }

    public boolean removeSheet(Sheet sheet) {
       if(this.sheet.contains(sheet)){
           this.sheet.remove(sheet);
           return true;
       }
        return false;

    }
}
