import java.util.*;

class Faculty {
    String name;
    Faculty(String name) {
        this.name = name;
    }
}

class DepartmentU {
    String name;
    DepartmentU(String name) {
        this.name = name;
    }
}

class University {
    String name;
    List<DepartmentU> departments = new ArrayList<>();
    University(String name) {
        this.name = name;
    }
    void addDepartment(DepartmentU d) {
        departments.add(d);
    }
}

public class SelfProblem2_UniversityFacultiesAndDepartments {
    public static void main(String[] args) {
        University u = new University("GlobalUni");
        DepartmentU d1 = new DepartmentU("CS");
        Faculty f1 = new Faculty("Dr. Smith");
        u.addDepartment(d1);
        System.out.println("University composition and aggregation demo complete");
    }
}