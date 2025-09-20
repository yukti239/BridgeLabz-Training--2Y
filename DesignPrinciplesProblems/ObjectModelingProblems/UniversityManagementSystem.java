import java.util.*;

class Professor {
    String name;
    Professor(String name) {
        this.name = name;
    }
}

class CourseU {
    String name;
    Professor professor;
    List<StudentU> students = new ArrayList<>();
    CourseU(String name) {
        this.name = name;
    }
    void assignProfessor(Professor p) {
        this.professor = p;
    }
    void enroll(StudentU s) {
        students.add(s);
    }
}

class StudentU {
    String name;
    List<CourseU> courses = new ArrayList<>();
    StudentU(String name) {
        this.name = name;
    }
    void enrollCourse(CourseU c) {
        courses.add(c);
        c.enroll(this);
    }
}

public class SelfProblem5_UniversityManagementSystem {
    public static void main(String[] args) {
        Professor prof = new Professor("Dr. John");
        StudentU s = new StudentU("Mike");
        CourseU c = new CourseU("AI");
        c.assignProfessor(prof);
        s.enrollCourse(c);
        System.out.println("University management system demo complete");
    }
}