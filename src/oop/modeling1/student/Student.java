package oop.modeling1.student;

public class Student {
    private String name;
    private String surname;
    private String grade;
    private int studentNumber;
    private int age;
    private double averageGrade;

    public Student(String name, String surname, String grade, int studentNumber, int age, double averageGrade) {
        this.name = name;
        this.surname = surname;
        this.grade = grade;
        this.studentNumber = studentNumber;
        this.age = age;
        this.averageGrade = averageGrade;
    }

    public void printDetails() {
        System.out.println("name = " + name);
        System.out.println("surname = " + surname);
        System.out.println("grade = " + grade);
        System.out.println("studentNumber = " + studentNumber);
        System.out.println("age = " + age);
        boolean hasStraightA = averageGrade == 5;
        if (hasStraightA){
            String msg = "Student " + name + " " + surname + " has straight A's!";
            System.out.println(msg);
        } else {
            System.out.println("averageGrade = " + averageGrade);
        }
    }
}
