package by.epam.task.entity;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class PointTest {

    @Test
    public void getXAxis() throws Exception {
        Point point=new Point();
        assertEquals(point.getXAxis(),0.0);
    }

    @Test
    public void getYAxis() throws Exception {
        Point point=new Point();
        assertEquals(point.getXAxis(),0.0);
    }
}