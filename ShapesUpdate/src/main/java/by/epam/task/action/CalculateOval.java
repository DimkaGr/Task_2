package by.epam.task.action;

import by.epam.task.entity.Oval;

public class CalculateOval {
    public double square(Oval oval){
        return oval.getA()*oval.getB()*Math.PI;
    }
    public double perimeter(Oval oval){
        return 2*Math.PI*Math.sqrt((oval.getA()*oval.getA()+oval.getB()*oval.getB())/2);
    }
}
