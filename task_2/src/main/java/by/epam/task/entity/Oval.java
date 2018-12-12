package by.epam.task.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Oval {
    private static final Logger log= LogManager.getLogger(Point.class);
    private double xCenter;
    private double yCenter;
    private double a;
    private double b;

    public Oval(){
        xCenter=0;
        yCenter=0;
        a=1;
        b=1;
    }
    public Oval(double xCenter,double yCenter){
        this.xCenter=xCenter;
        this.yCenter=yCenter;
        a=0;
        b=0;
    }
    public Oval(double xCenter,double yCenter,double a,double b){
        this.xCenter=xCenter;
        this.yCenter=yCenter;
        this.a=a;
        this.b=b;
    }
    public Oval(List<Double> arr){
        xCenter=arr.get(0);
        yCenter=arr.get(1);
        a=arr.get(2);
        b=arr.get(3);
    }
    public void setOval(double xCenter,double yCenter,double a, double b){
        this.xCenter=xCenter;
        this.yCenter=yCenter;
        this.a=a;
        this.b=b;
    }
    public double getXCenter(){
        return xCenter;
    }
    public double getYCenter(){
        return yCenter;
    }
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    @Override
    public boolean equals(Object o){
        if(o==this){
            return true;
        }
        if(o==null||o.getClass()!=this.getClass()){
            return false;
        }
        Oval ov=(Oval)o;
        return (ov.getA()==getA())&&(ov.getB()==getB())&&
                (ov.getXCenter()==getXCenter())&&(ov.getYCenter()==getYCenter());
    }
    @Override
    public int hashCode(){
        final int prime=31;
        int result=1;
        result=prime*result+(int)xCenter;
        result=prime*result+(int)yCenter;
        result=prime*result+(int)a;
        result=prime*result+(int)b;
        return result;
    }
    @Override
    public String toString(){
        return "Oval [xCenter="+xCenter
                +", yCenter="+yCenter
                +", a="+a
                +", b="+b+"]";
    }
}
