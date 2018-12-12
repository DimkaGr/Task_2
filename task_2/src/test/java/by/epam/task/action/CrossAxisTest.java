package by.epam.task.action;

import by.epam.task.entity.Oval;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CrossAxisTest {
    @Test
    public void testIsCrossed() throws Exception {
        Oval oval=new Oval(5.0,5.0,10.0,3.0);
        assertTrue(CrossAxis.isCrossed(oval,5));
    }

}