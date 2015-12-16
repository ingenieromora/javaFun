package studentCorrelationExercise;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.*;


/**
 * @author leandro.mora
 */
public class StudentCorrelationTest {
    BufferedReader testBr;

    @Before
    public void setup() throws FileNotFoundException {
        testBr = new BufferedReader(new FileReader(new File("src/test/resources/inputDataSet.csv")));
    }


    @Test
    public void correlationTestUsing20Students(){
        StudentCorrelation studentCorrelation = new StudentCorrelation();

        String expectedOutput = "0.89\n" + "0.92\n" + "0.81";

        try {
            String currentOutput = studentCorrelation.calculateCorrelation(testBr);
            Assert.assertEquals(expectedOutput, currentOutput);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
