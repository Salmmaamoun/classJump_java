package com.classJump.course;

public class Sheet {

    private int number;
    private String describtion;
    private String fileNameSheet;

    public Sheet(int number, String describtion, String fileNameSheet) {
        this.number = number;
        this.describtion = describtion;
        this.fileNameSheet = fileNameSheet;
    }

   

    public String getFileNameSheet() {
        return fileNameSheet;
    }

    public void setFileNameSheet(String fileNameSheet) {
        this.fileNameSheet = fileNameSheet;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDescribtion() {
        return describtion;
    }

    public void setDescribtion(String describtion) {
        this.describtion = describtion;
    }

    @Override
    public String toString() {
        return "SheetDto{" + "number=" + number + ", describtion=" + describtion + ", fileNameSheet=" + fileNameSheet + '}';
    }
    

}
