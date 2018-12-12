package by.epam.task.action;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class ReadFromFileTest {
    @Test
    public void read() throws Exception {
        String fileName="test.txt";
        List<String> list=new ArrayList();
        list.add("1.0 2.0 3.0 4.0");
        list.add("1l0 4.0");
        list.add("1.0 2.0");
        assertEquals(ReadFromFile.read(fileName),list);
    }
}