package oop.modeling1.student;

public class Main {

    public static void main(String[] args) {
        Student pero = new Student("Pero", "Petrov", "IV-1", 10, 18, 5);
        pero.printDetails();

        Student petrana = new Student("Petrana", "Petrovska", "IV-5", 1, 17, 4.3);
        petrana.printDetails();
    }
}
