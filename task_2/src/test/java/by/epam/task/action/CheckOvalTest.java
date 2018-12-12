package by.epam.task.action;

import by.epam.task.entity.Point;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CheckOvalTest {
    @Test
    public void isOval() throws Exception {
        assertFalse(CheckOval.isOval(new Point(2,3),new Point(2,4)));
    }

    @Test
    public void isCircle() throws Exception {
        assertTrue(CheckOval.isCircle(2,2));
    }

}