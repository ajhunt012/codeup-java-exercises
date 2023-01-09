package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Student {
    private final String name;
    private final ArrayList<Integer> grades;
    private final HashMap<String, String> attendance;

    // constructor to set name and initialize grades and attendance
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
        this.attendance = new HashMap<>();
    }

    // method to get student's name
    public String getName() {
        return this.name;
    }

    // method to add grade to grades list
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    // method to get average of student's grades
    public double getGradeAverage() {
        int sum = 0;
        for (int grade : this.grades) {
            sum += grade;
        }
        return (double) sum / this.grades.size();
    }

    // method to record attendance for a particular date
    public void recordAttendance(String date, String value) {
        if (value.equals("A") || value.equals("P")) {
            this.attendance.put(date, value);
        }
    }

    // method to calculate attendance percentage
    public double getAttendancePercentage() {
        int absences = 0;
        for (String value : this.attendance.values()) {
            if (value.equals("A")) {
                absences++;
            }
        }
        return (double) (this.attendance.size() - absences) / this.attendance.size();
    }

    // method to get list of dates when student was absent
    public List<String> getAbsences() {
        List<String> absences = new ArrayList<>();
        for (String date : this.attendance.keySet()) {
            if (this.attendance.get(date).equals("A")) {
                absences.add(date);
            }
        }
        return absences;
    }
}
