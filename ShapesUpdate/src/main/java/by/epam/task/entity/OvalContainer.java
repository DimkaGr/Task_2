package by.epam.task.entity;

import by.epam.task.action.CalculateOval;

public class OvalContainer {
    private Oval oval;
    private double square;
    private double perimeter;
    private CalculateOval calc =new CalculateOval();

    public OvalContainer(){}
    public OvalContainer(Oval o){
        this.oval=o;
        this.square=calc.square(o);
        this.perimeter=calc.perimeter(o);
    }

    public Oval getOval() {
        return oval;
    }

    public void setOval(Oval oval) {
        this.oval = oval;
        this.square=calc.square(oval);
        this.perimeter=calc.perimeter(oval);
    }

    public double getSquare() {
        return square;
    }

    public double getPerimeter() {
        return perimeter;
    }
}
