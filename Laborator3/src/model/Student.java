package model;

public class Student extends Person{
    private int StudentNumber;
    private float AverageMark;
    private int Class;
    public Student(String Name, String PhoneNumber, String EmailAddress, int StudentNumber, float AverageMark, int Class){
        super(Name,PhoneNumber,EmailAddress);
        this.StudentNumber=StudentNumber;
        this.AverageMark=AverageMark;
        this.Class=Class;
    }

    public void setStudentNumber(int studentNumber) {StudentNumber = studentNumber;}

    public void setAverageMark(float averageMark) {AverageMark = averageMark;}

    public void setClass(int aClass) {Class = aClass;}

    public int getStudentNumber() {return StudentNumber;}

    public float getAverageMark() {return AverageMark;}

    public int getterClass() {return Class;}
}
