import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class LectureTest {

    @Test
    public void getHighestAverageGrade() {
        List<Double> AverageGrades = new ArrayList<>();
        AverageGrades.add(20.0);
        AverageGrades.add(23.0);
        AverageGrades.add(21.0);
        System.out.println(AverageGrades);
        System.out.println(Collections.max(AverageGrades));
   //assertEquals(getHighestAverageGrade(), 23.0);
    }
}