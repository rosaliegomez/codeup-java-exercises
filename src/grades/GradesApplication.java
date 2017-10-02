package grades;

import util.Input;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.*;

public class GradesApplication {


    public static void main(String[] args) {
Input input = new Input();
        HashMap<String, Student> students = new HashMap<String, Student>();


        Student student1 = new Student("Zach");
    student1.addGrade(90);
    student1.addGrade(100);
    student1.addGrade(99);
    students.put("ZachAttack", student1);

    Student student2 = new Student("Kelly");
    student2.addGrade(70);
    student2.addGrade(80);
    student2.addGrade(80);
    students.put("BaysideTiger", student2);

    Student student3 = new Student("A.C");
    student3.addGrade(70);
    student3.addGrade(75);
    student3.addGrade(71);
    students.put("SlaterTime94", student3);

    Student student4 = new Student("Lisa");
    student4.addGrade(80);
    student4.addGrade(81);
    student4.addGrade(85);
    students.put("TurtleDove", student4);


        System.out.println("Welcome!");
        System.out.println("Here are the github usernames of out students:");

        for(String username : students.keySet()){
            System.out.print("|" + username + "| ");
        }

        System.out.println();
        do {
            String pickStudent = input.getString("Which student would you like to see more information on?");

            if (students.get(pickStudent) == null) {
                System.out.println("No student with that name");
            } else {
                System.out.println("Name: " + students.get(pickStudent).getName() + "- Github Username: " + pickStudent + " Current Average: " + students.get(pickStudent).getGradeAverage());
            }
        }while (input.yesNo("Would you like to continue??"));

        System.out.println("Goodbye, and have a wonderful day!");

        //Returns all grades and then the grade point average.
        for (Student aStudent: students.values() ){
            System.out.println(aStudent.getName() + "'s grades: "  + aStudent.getGrades() + " Current average: " + aStudent.getGradeAverage());
        }
//Returns usernames along with all their grades.
        for(Student student: students.values()){
            System.out.println(student.getName() + "'s grades:");
            for (double grade: student.getGrades()){
                System.out.println(grade);
            }
        }
        for(Student student: students.values()){
            System.out.println(student.getName());
                System.out.println(student.getGradeAverage());

        }
        for(Student student: students.values()){
            System.out.println(student.getName());
            for(String username: students.keySet()){
                System.out.println(username);
            }
        }

        }

    }





