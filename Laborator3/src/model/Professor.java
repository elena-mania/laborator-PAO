package model;

public class Professor extends Person{
    private String Course;
    private int Year;
    public Professor(String Name, String PhoneNumber, String EmailAddress, String Course, int Year){
        super(Name,PhoneNumber,EmailAddress);
        this.Course=Course;
        this.Year=Year;
    }

    public void setCourse(String course) {Course = course;}

    public void setYear(int year) {Year = year;}

    public String getCourse() {return Course;}

    public int getYear() {return Year;}
}
