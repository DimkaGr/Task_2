package by.epam.task.action;

import by.epam.task.entity.Oval;
import by.epam.task.entity.Point;

public class CheckOval {
    public boolean isOval(Point a, Point b){
        return !(a.getXAxis()==b.getXAxis()||a.getYAxis()==b.getYAxis());
    }
    public boolean isCircle(Oval oval){
        return oval.getA()==oval.getB();
    }
}
