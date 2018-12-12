package by.epam.task.validate;

import by.epam.task.entity.Oval;
import by.epam.task.entity.Point;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class DataValidatorTest {
    @Test
    public void isDigits() throws Exception {
        assertTrue(DataValidator.isDigits("1.0 2.0"));
    }

    @Test
    public void toDigits() throws Exception{
        List<Double>list=new ArrayList();
        list.add(1.0);
        list.add(2.0);
        list.add(1.0);
        list.add(6.0);
        assertEquals(DataValidator.toDigits("1.0 2.0 1.0 6.0",new Oval()),list);
    }

    @Test
    public void isValid() throws Exception {
        List<Double>list =new ArrayList();
        list.add(1.0);
        list.add(2.0);
        assertTrue(DataValidator.isValid(list,new Point()));
    }
}