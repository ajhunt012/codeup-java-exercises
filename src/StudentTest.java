public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("John");
        student1.addGrade(90);
        student1.addGrade(85);
        student1.addGrade(95);
        System.out.println(student1.getName()); // should print "John"
        System.out.println(student1.getGradeAverage()); // should print 90.0

        Student student2 = new Student("Jane");
        student2.addGrade(80);
        student2.addGrade(75);
        student2.addGrade(100);
        System.out.println(student2.getName()); // should print "Jane"
        System.out.println(student2.getGradeAverage()); // should print 85.0
    }
}
