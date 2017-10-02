package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Double> grades;

    double total = 0;

    public Student (String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public ArrayList<Double> getGrades() {
        return grades;
    }

    public String getName(){
        return this.name;
    }

    public void addGrade(double grade){
       grades.add(grade);
    }

    public double getGradeAverage(){
        double average = 0;
        for(double grade: grades){
            average += grade;
        }
        return average / grades.size();
    }
public static void main(String[] args) {
    Student student = new Student("Jane");
    student.addGrade(97);
    student.addGrade(90);
    student.addGrade(80);

    System.out.println(student.getGradeAverage());
}
}
