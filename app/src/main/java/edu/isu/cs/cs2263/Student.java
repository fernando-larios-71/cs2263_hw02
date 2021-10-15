package edu.isu.cs.cs2263;

public class Student {
//variables
    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getfirstName(){
        return firstName;
    }
    public String getlastName(){
        return lastName;
    }

    public void setfirstName(String firstName){
        this.firstName = firstName;
    }
    public void setlastName(String lastName){
        this.lastName = lastName;
    }
    public String toString(){
        return getfirstName() + getlastName();
    }

}



