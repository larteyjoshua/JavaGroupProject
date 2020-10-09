import java.util.*;
public class Lecture {
    ArrayList<Student> studentsList;

    public Lecture(ArrayList<Student> studentsList) {
        this.studentsList = studentsList;
    }

    public void Enter(Student level200) {
        studentsList.add(level200);
        System.out.println("Students" + " " + studentsList);
    }

    public double getHighestAverageGrade() {
        Double highest = 0.0;
        for (Student s : studentsList) {
            if (s.getAverageGrade() > highest) {
                highest = s.getAverageGrade();
            }
        }
        return highest;
    }
}
