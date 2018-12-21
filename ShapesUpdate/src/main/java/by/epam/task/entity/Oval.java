package by.epam.task.entity;


import by.epam.task.action.IdCreator;
import by.epam.task.notification.Observable;
import by.epam.task.notification.Observer;

import java.util.List;

public class Oval implements Observable{
    private double xCenter;
    private double yCenter;
    private double a;
    private double b;
    private String name;
    private final int id;
    private Observer REPOSITORY=Warehouse.getInstance();

    public Oval(){
        xCenter=0;
        yCenter=0;
        a=0;
        b=0;
        name="";
        id= IdCreator.makeId();
    }
    public Oval(double xCenter,double yCenter){
        this.xCenter=xCenter;
        this.yCenter=yCenter;
        a=0;
        b=0;
        name="";
        id= IdCreator.makeId();
    }
    public Oval(double xCenter,double yCenter,double a,double b,String name){
        this.xCenter=xCenter;
        this.yCenter=yCenter;
        this.a=a;
        this.b=b;
        this.name=name;
        id= IdCreator.makeId();
    }
    public Oval(List<Double> arr,String name){
        xCenter=arr.get(0);
        yCenter=arr.get(1);
        a=arr.get(2);
        b=arr.get(3);
        this.name=name;
        id= IdCreator.makeId();
    }
    public void setOval(double xCenter,double yCenter,double a,double b,String name){
        this.xCenter=xCenter;
        this.yCenter=yCenter;
        this.a=a;
        this.b=b;
        this.name=name;
        notifyAboutChanges(getOval());
    }

    public void setxCenter(double xCenter) {
        this.xCenter = xCenter;
        notifyAboutChanges(getOval());
    }

    public void setyCenter(double yCenter) {
        this.yCenter = yCenter;
        notifyAboutChanges(getOval());
    }

    public void setA(double a) {
        this.a = a;
        notifyAboutChanges(getOval());
    }

    public void setB(double b) {
        this.b = b;
        notifyAboutChanges(getOval());
    }

    public void setName(String name) {
        this.name = name;
        notifyAboutChanges(getOval());
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
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public Oval getOval(){
        return this;
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
        return (ov.getA()==getA())&&(ov.getB()==getB())&&(ov.getName()==getName())&&
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
        result=prime*result+id;
        result=prime*result+name.hashCode();
        return result;
    }
    @Override
    public String toString(){
        return "Oval [xCenter="+xCenter
                +", yCenter="+yCenter
                +", a="+a
                +", b="+b
                +", name="+name
                +", id="+id+"]";
    }
    public void notifyAboutChanges(Oval oval){
        REPOSITORY.makeChanges(oval);
    }
}
