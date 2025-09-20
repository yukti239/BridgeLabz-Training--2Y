import java.util.*;

class Course {
    String name;
    List<Student> students = new ArrayList<>();
    Course(String name) {
        this.name = name;
    }
    void addStudent(Student s) {
        students.add(s);
    }
}

class Student {
    String name;
    List<Course> courses = new ArrayList<>();
    Student(String name) {
        this.name = name;
    }
    void enroll(Course c) {
        courses.add(c);
        c.addStudent(this);
    }
}

class School {
    List<Student> students = new ArrayList<>();
    void addStudent(Student s) {
        students.add(s);
    }
}

public class SelfProblem1_SchoolAndStudents {
    public static void main(String[] args) {
        School school = new School();
        Student s1 = new Student("Tom");
        Course c1 = new Course("Math");
        s1.enroll(c1);
        school.addStudent(s1);
        System.out.println("School and student-course association demo complete");
    }
}