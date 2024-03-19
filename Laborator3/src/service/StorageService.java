package service;
import model.*;

import java.util.ArrayList;
import java.util.Scanner;

public class StorageService {
    private ArrayList<Student> students;
    private ArrayList<Professor> professors;
    public StorageService() {
        this.students = new ArrayList<Student>();
        this.professors = new ArrayList<Professor>();
    }
    public boolean IsProf(String name){
        for(Professor prof: professors){
            if(name.equals(prof.getName())) {
                return true;
            }
        }
        return false;
    }
    public boolean IsStudent(String name){
        for(Student stud: students){
            if(name.equals(stud.getName())) {
                return true;
            }
        }
        return false;
    }

    public void Create(){
        Scanner read = new Scanner(System.in);
        String name,phoneNumber,email,course;
        int studentnr, year, cls;
        float avgMark;

        System.out.println("Comand received: create\n");
        System.out.println("Enter the type of person:");
        String personType = read.nextLine();

        ///MODIFICARE: daca numele tipului este gresit iesim din metoda
        /*if ("professor".equals(personType) || !"student".equals(personType)) {
            System.out.println("Incorrect name!");
            return;
        }*/

        System.out.println("Command received: " + personType);

        System.out.println("name:\n");
        name = read.nextLine();
        if (IsProf(name) || IsStudent(name)) {
            System.out.println("Already existing!");
            return;
        }

        System.out.println("phone number:\n");
        phoneNumber = read.nextLine();
        System.out.println("email:\n");
        email = read.nextLine();

        if ("student".equals(personType)) {
            System.out.println("student number:\n");
            studentnr = read.nextInt();
            System.out.println("average mark:\n");
            avgMark = read.nextFloat();
            System.out.println("class:\n");
            cls = read.nextInt();

            Student studentNou = new Student(name, phoneNumber, email, studentnr, avgMark, cls);
            this.students.add(studentNou);

            System.out.println("Successfully added student!");

        } else if ("professor".equals(personType)) {
            System.out.println("course:\n");
            course = read.nextLine();
            System.out.println("year:\n");
            year = read.nextInt();

            Professor profNou = new Professor(name, phoneNumber, email, course, year);
            this.professors.add(profNou);
            System.out.println("Successfully added professor!");
        }
        else System.out.println("Invalid command! Try writing 'student' or 'professor'");
    }


    public void Delete() {
        System.out.println("Command received: delete");
        System.out.println("Enter the name:");
        Scanner read = new Scanner(System.in);
        String name = read.nextLine();
        boolean found = false;
        //cautam prin toti studentii si il stergem pe cel de la pozitia i (daca numele e egal cu cel din input)
        for (int i=0; i<=students.size();i++) {
            if (name.equals(students.get(i).getName())) {
                students.remove(i);
                found = true;
                break; //daca l gasim, iesim din for
            }
        }
        // cautam in profesori daca nu gasim in studenti
        if (!found) {
            for (int i=0; i<=professors.size();i++) {
                if (name.equals(professors.get(i).getName())) {
                    professors.remove(i);
                    found = true;
                    break;
                }
            }
        }
        if (!found) System.out.println("Not existing!");
        else System.out.println("Removed successfully!");
    }

    public void Update(){
        System.out.println("Comand received: new\n");
        System.out.println("Enter the name:\n");
        Scanner read = new Scanner(System.in);
        String name= read.nextLine();
        String phoneNumber,email,course,namenew;
        int studentnr, year, cls;
        float avgMark;

        boolean found=false;
        for(Student student: students){

            if(name.equals(student.getName())) {
                System.out.println("New name:\n");
                name = read.nextLine();
                System.out.println("New phone number:\n");
                phoneNumber = read.nextLine();
                System.out.println("New email:\n");
                email = read.nextLine();
                System.out.println("New student number:\n");
                studentnr = read.nextInt();
                System.out.println("New average mark:\n");
                avgMark = read.nextFloat();
                System.out.println("New class:\n");
                cls = read.nextInt();

                student.setName(name);
                student.setPhoneNumber(phoneNumber);
                student.setEmailAddress(email);
                student.setStudentNumber(studentnr);
                student.setAverageMark(avgMark);
                student.setClass(cls);
                found = true;
                System.out.println("Successfully updated student!");
            }
        }
        if(!found){//daca nu l am gasit in studenti, cautam in profesori
            for(Professor prof: professors){
                if(name.equals(prof.getName())) {
                    System.out.println("New name:\n");
                    namenew = read.nextLine();
                    System.out.println("New phone number:\n");
                    phoneNumber = read.nextLine();
                    System.out.println("New email:\n");
                    email = read.nextLine();
                    System.out.println("New course:\n");
                    course = read.nextLine();
                    System.out.println("New year:\n");
                    year = read.nextInt();

                    prof.setName(namenew);
                    prof.setPhoneNumber(phoneNumber);
                    prof.setEmailAddress(email);
                    prof.setCourse(course);
                    prof.setYear(year);

                    found = true;
                    System.out.println("Successfully updated professor!");
                }
            }
        }
        if(!found) System.out.println("Not existing!"); ///daca nu e nici printre profesori, inseamna ca nu exista

    }
    public void Read(){
        System.out.println("Comand received: read\n");
        System.out.println("Enter the name:\n");
        Scanner read = new Scanner(System.in);
        String name= read.nextLine();
        boolean found=false;
        for(Student student: students){
            if(name.equals(student.getName())) {
                System.out.println("name: "+student.getName()+
                        "\nphone number: "+student.getPhoneNumber()+
                        "\nemail: "+student.getEmailAddress()+
                        "\nstudent number: "+student.getStudentNumber()+
                        "\nstudent average mark: "+student.getAverageMark()+
                        "\nclass: "+student.getterClass());
                found = true;
                return;
            }
        }
        if(!found){//daca nu l am gasit in studenti, cautam in profesori
            for(Professor prof: professors){
                if(name.equals(prof.getName())) {
                    System.out.println("name: "+prof.getName()+
                            "\nphone number: "+prof.getPhoneNumber()+
                            "\nemail: "+prof.getEmailAddress()+
                            "\ncourse: "+prof.getCourse()+
                            "\nyear: "+prof.getYear());
                    found = true;
                }
            }
        }
        if(!found) System.out.println("Not existing!"); ///daca nu e nici printre profesori, inseamna ca nu exista
    }

}
