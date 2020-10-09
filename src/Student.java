
import java.util.*;

public class Student {
    private List<Double> grades;

    public Student() {
        this.grades =new ArrayList<>();
    }

    public Double getAverageGrade()
    {
        double sum=0;
        for(int i=0; i<grades.size(); i++){

           sum = sum + grades.get(i);
           return sum;
        }
        double average=0;
        average= (sum/grades.size());
        return average;
    }
}
