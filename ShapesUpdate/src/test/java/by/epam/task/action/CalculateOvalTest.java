package by.epam.task.action;

import by.epam.task.entity.Oval;
import org.junit.Before;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalculateOvalTest {
    Oval oval;
    CalculateOval calc;

    @BeforeClass
    public void create(){
        oval=new Oval(1,2,3,5,"oval");
        calc=new CalculateOval();
    }

    @Test
    public void testSquare() throws Exception {
        double sq=3*5*Math.PI;
        assertEquals(calc.square(oval),sq);
    }

    @Test
    public void testPerimeter() throws Exception {
        double per=2*Math.PI*Math.sqrt((3*3+5*5)/2);
        assertEquals(calc.perimeter(oval),per);
    }

}