public class SchoolMain {
    public static void main(String[] args) {
        Subject[] subjects = {
            new Subject("Maths", 90),
            new Subject("Science", 85)
        };
        Student student = new Student("John", subjects);
        GradeCalculator gc = new GradeCalculator();
        String grade = gc.calculateGrade(student);
        System.out.println("Student: " + student.getName());
        for (Subject s : student.getSubjects()) {
            System.out.println(s.getName() + ": " + s.getMarks());
        }
        System.out.println("Grade: " + grade);
    }
}