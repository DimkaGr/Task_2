package by.epam.task.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Point {
    private static final Logger log= LogManager.getLogger(Point.class);
    private double xAxis;
    private double yAxis;

    public Point(){
        xAxis=0;
        yAxis=0;
    }
    public Point(double xAxis,double yAxis){
        this.xAxis=xAxis;
        this.yAxis=yAxis;
    }
    public Point(List<Double> arr){
        xAxis=arr.get(0);
        yAxis=arr.get(1);
    }

    public double getXAxis(){
        return xAxis;
    }
    public double getYAxis(){
        return yAxis;
    }
    @Override
    public boolean equals(Object o){
        if(o==this){
            return true;
        }
        if(o==null||o.getClass()!=this.getClass()){
            return false;
        }
        Point pt=(Point)o;
        return(pt.getYAxis()==xAxis)&&(pt.getYAxis()==yAxis);
    }
    @Override
    public int hashCode(){
        final int prime=31;
        int result=1;
        result=prime*result+(int)xAxis;
        result=prime*result+(int)yAxis;
        return result;
    }
    @Override
    public String toString(){
        return "Point [xAxis="+xAxis
                +", yAxis="+yAxis+"]";
    }
}
