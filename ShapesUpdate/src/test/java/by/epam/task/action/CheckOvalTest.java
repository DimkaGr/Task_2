package by.epam.task.action;

import by.epam.task.entity.Oval;
import by.epam.task.entity.Point;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CheckOvalTest {

    @Test
    public void isOval() throws Exception {
        CheckOval check=new CheckOval();
        assertFalse(check.isOval(new Point(2,3),new Point(2,4)));
    }

    @Test
    public void isCircle() throws Exception {
        CheckOval check=new CheckOval();
        Oval oval=new Oval(2,2,2,2,"oval");
        assertTrue(check.isCircle(oval));
    }

}