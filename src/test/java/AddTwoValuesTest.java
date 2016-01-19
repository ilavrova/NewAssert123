import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by m18 on 14.01.2016.
 */
public class AddTwoValuesTest {

    @Before
    public void consolePrint() {
        System.out.println("Tests started!!! ");

    }

    @Test
    public void testaddTwoPositiveValues() {
        // Class for testing
        Calc calc = new Calc();

        // Method to check
        Assert.assertEquals ("22 + 10 must be 32", 32, calc.add (22, 10));

    }
    @Test
    public void testsubPositiveValues() {
        // Class for testing
        Calc calc = new Calc();

        // Method to check
        Assert.assertEquals ("22 - 10 must be 12", 12, calc.sub (22, 10));

    }

    @Test
    public void testmultPositiveValues() {
        // Class for testing
        Calc calc = new Calc();

        // Method to check
        Assert.assertEquals ("2*5 must be 10", 10, calc.mult (2, 5));
    }
    @Test
    public void testdivPositiveValues() {
        // Class for testing
        Calc calc = new Calc();

        // Method to check
        Assert.assertEquals ("10/5 must be 2", 2, calc.div (10, 5));
    }
}