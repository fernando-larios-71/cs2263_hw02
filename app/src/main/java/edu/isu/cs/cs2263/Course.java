package edu.isu.cs.cs2263;

import java.util.ArrayList;
import java.util.Vector;


public class Course {
    //variables
    private String num;
    private String subject;
    private String title;


    public Course(String num, String subject, String title){
        this.num = num;
        this.subject = subject;
        this.title = title;
    }

    public  String getNum(){
        return num;
    }
    public String getSubject(){
        return subject;
    }
    public String getTitle(){
        return title;
    }

    public void setNum(String num){
        this.num = num;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public String toString(){
        return getNum() + getSubject() + getTitle();
    }

}
