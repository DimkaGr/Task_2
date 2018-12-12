package by.epam.task.action;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalculateOvalTest {

    @Test
    public void testSquare() throws Exception {
        double sq=2*7*Math.PI;
        assertEquals(CalculateOval.square(2,7),sq);
    }

    @Test
    public void testPerimeter() throws Exception {
        double per=2*Math.PI*Math.sqrt((3*3+5*5)/2);
        assertEquals(CalculateOval.perimeter(3,5),per);
    }

}