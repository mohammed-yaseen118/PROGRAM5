class Course {
    String name;
    int marks;

    Course(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}
class Student {
    String name = "Pawan";
    String program = "BCA";
    int semester = 4;
    Course[] courses = {
        new Course("C++", 45),
        new Course("DevOps", 85),
        new Course("PALR", 50)
    };

    void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Program: " + program);
        System.out.println("Semester: " + semester);
        System.out.println("Courses Registered:");
        for (Course c : courses) {
            System.out.println("  - " + c.name);
        }
    }
    void displayLowMarks() {
        System.out.println("\nCourses with marks < 40:");
        for (Course c : courses) {
            if (c.marks < 40) {
                System.out.println("  " + c.name + ": " + c.marks);
            }
        }
    }
}
public class StudentRegistration {
    public static void main(String[] args) {
        Student s = new Student();
        s.displayInfo();
        s.displayLowMarks();
    }
}

