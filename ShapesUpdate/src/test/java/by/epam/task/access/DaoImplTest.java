package by.epam.task.access;

import by.epam.task.entity.Oval;
import by.epam.task.entity.OvalContainer;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.testng.Assert.*;

public class DaoImplTest {
    Map<Integer,OvalContainer>ovalMap;
    Oval oval1;
    Oval oval2;
    Oval oval3;
    Oval oval4;
    DaoImpl dao;

    @BeforeClass
    public void create(){
        ovalMap=new HashMap();
        oval1=new Oval(1,2,3,4,"oval1");
        oval2=new Oval(3,3,3,8,"oval2");
        oval3=new Oval(2,2,2,2,"oval3");
        oval4=new Oval(10,4,5,7,"oval4");
        dao=new DaoImpl();
        dao.addObject(oval1);
        dao.addObject(oval2);
        dao.addObject(oval3);
        dao.addObject(oval4);
    }


    @Test
    public void getByName() throws Exception {
        List list=dao.getByName("oval1");
        assertEquals(list.get(0),oval1);
    }

    @Test
    public void getByCoordinate() throws Exception {
        List list=dao.getByCoordinate(3,3);
        assertEquals(list.get(0),oval2);
    }

    @Test
    public void getBySquare() throws Exception {
        List list=dao.getBySquare(3,20);
        assertEquals(list.get(0),oval3);
    }

    @Test
    public void getByPerimeter() throws Exception {
        List list=dao.getByPerimeter(38,50);
        assertEquals(list.get(0),oval4);
    }

    @Test
    public void getByDistance() throws Exception {
        List list=dao.getByDistance(3);
        assertEquals(list.get(0),oval1);
    }

}