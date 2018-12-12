package by.epam.task.action;

import by.epam.task.entity.Point;

public class CheckOval {
    public static boolean isOval(Point a, Point b){
        return !(a.getXAxis()==b.getXAxis()||a.getYAxis()==b.getYAxis());
    }
    public static boolean isCircle(double a,double b){
        return a==b;
    }
}
