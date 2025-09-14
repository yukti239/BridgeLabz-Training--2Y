public class StudentReport {
    String name;
    int rollNumber;
    double marks;
    
    StudentReport(String name, int roll, double marks) {
        this.name = name;
        this.rollNumber = roll;
        this.marks = marks;
    }
    
    String grade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 50) return "C";
        else return "F";
    }
    
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade());
    }
    
    public static void main(String[] args) {
        StudentReport s = new StudentReport("Alice", 12, 85);
        s.display();
    }
}