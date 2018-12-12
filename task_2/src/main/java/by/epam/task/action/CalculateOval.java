package by.epam.task.action;

public class CalculateOval {
    public static double square(double a,double b){
        return a*b*Math.PI;
    }
    public static double perimeter(double a,double b){
        return 2*Math.PI*Math.sqrt((a*a+b*b)/2);
    }
}
