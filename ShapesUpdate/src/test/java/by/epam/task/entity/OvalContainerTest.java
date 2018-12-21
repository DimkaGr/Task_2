package by.epam.task.entity;

import by.epam.task.action.CalculateOval;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class OvalContainerTest {
    Oval oval;
    OvalContainer container;

    @BeforeClass
    public void create(){
        oval=new Oval(1.0,2.0,3.0,4.0,"oval");
        container=new OvalContainer(oval);
    }

    @Test
    public void getOval() throws Exception {
        assertEquals((container.getOval()),oval);
    }

    @Test
    public void getSquare() throws Exception {
        CalculateOval calc=new CalculateOval();
        assertEquals((container.getSquare()),calc.square(oval));
    }

    @Test
    public void getPerimeter() throws Exception {
        CalculateOval calc=new CalculateOval();
        assertEquals((container.getPerimeter()),calc.perimeter(oval));
    }

    @Test
    public void getName() throws Exception {
        assertEquals(oval.getName(),"oval");
    }
}