import java.util.Scanner;

class Student {
    private String name;
    private int marks;

    // Constructor 1: name only
    public Student(String name) {
        this.name = name;
        this.marks = 0;
    }

    // Constructor 2: name and marks
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public char calculateGrade() {
        if(marks >= 90) return 'A';
        else if(marks >= 75) return 'B';
        else if(marks >= 60) return 'C';
        else if(marks >= 40) return 'D';
        else return 'F';
    }

    public void displayResult() {
        System.out.println("Name: " + name + ", Marks: " + marks + ", Grade: " + calculateGrade());
    }
}

public class StudentRanker {
    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        s1.setMarks(88);

        Student s2 = new Student("Bob", 72);

        s1.displayResult();
        s2.displayResult();
    }
}
