package by.epam.task.action;

import by.epam.task.entity.Oval;

public class CrossAxis {
    public static boolean isCrossed(Oval oval, double dist){
        if(oval.getXCenter()==dist&&oval.getYCenter()==dist) {
            if (oval.getA()>Math.abs(oval.getXCenter()) && Math.abs(oval.getYCenter()) > oval.getB()) {
                return true;
            } else if (oval.getB()>Math.abs(oval.getYCenter()) && Math.abs(oval.getXCenter()) > oval.getA()) {
                return true;
            }
        }
        return false;
    }
}
