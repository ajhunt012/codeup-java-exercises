package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("John");
        student1.addGrade(90);
        student1.addGrade(80);
        student1.addGrade(70);

        System.out.println("Name: " + student1.getName());
        System.out.println("Average: " + student1.getGradeAverage());

        student1.recordAttendance("2022-01-01", "P");
        student1.recordAttendance("2022-01-02", "A");
        student1.recordAttendance("2022-01-03", "P");
        System.out.println("Attendance Percentage: " + student1.getAttendancePercentage());
        System.out.println("Absences: " + student1.getAbsences());
    }
}
