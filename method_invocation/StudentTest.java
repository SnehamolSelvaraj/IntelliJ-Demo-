class Student {
    String name;
    int marks;

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Alice";
        s.marks = 88;
        s.displayDetails();  // method invocation
    }
}
