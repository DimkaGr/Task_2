package by.epam.task.entity;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class OvalTest {
    private Oval oval;

    @BeforeClass
    private void create(){
         oval=new Oval(1.0,2.0,3.0,4.0,"oval");
    }

    @Test
    public void getXCenter() throws Exception {
        assertEquals(oval.getXCenter(),1.0);
    }

    @Test
    public void getYCenter() throws Exception {
        assertEquals(oval.getYCenter(),2.0);
    }

    @Test
    public void getA() throws Exception {
        assertEquals(oval.getA(),3.0);
    }

    @Test
    public void getB() throws Exception {
        assertEquals(oval.getB(),4.0);
    }

    @Test
    public void getName() throws  Exception {
        assertEquals(oval.getName(),"oval");
    }
}