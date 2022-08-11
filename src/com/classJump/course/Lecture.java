package com.classJump.course;

public class Lecture {

    private String name;
    private String describtion;
    private String fileNameLec;

    public Lecture(String name, String describtion, String fileNameLec) {
        this.name = name;
        this.describtion = describtion;
        this.fileNameLec = fileNameLec;
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

    public String getFileNameLec() {
        return fileNameLec;
    }

    public void setFileNameLec(String fileNameLec) {
        this.fileNameLec = fileNameLec;
    }

    @Override
    public String toString() {
        return "LectureDto{" + "name=" + name + ", describtion=" + describtion + ", fileNameLec=" + fileNameLec + '}';
    }

}
