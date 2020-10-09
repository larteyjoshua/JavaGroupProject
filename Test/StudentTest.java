import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void getAvergeGrade() {
        List<Double> grades = new ArrayList<>();
        grades.add(20.0);
        grades.add(23.0);
        grades.add(21.0);
        System.out.println(grades);
    }
}