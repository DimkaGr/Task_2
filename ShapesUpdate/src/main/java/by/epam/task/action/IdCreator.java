package by.epam.task.action;

import java.util.Calendar;

public class IdCreator {
    private static int counter=1;
    public static int makeId(){
        Calendar day=Calendar.getInstance();
        counter++;
        return day.get(Calendar.DAY_OF_MONTH)*(int)(Math.random()+1)*10000+counter;
    }
}
