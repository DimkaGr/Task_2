package by.epam.task.entity;

import by.epam.task.notification.Observer;

import java.util.HashMap;
import java.util.Map;

public class Warehouse implements Observer{
    private static final Warehouse REPOSITORY=new Warehouse();
    private  Map<Integer,OvalContainer>ovalMap=new HashMap<Integer,OvalContainer>();
    private Warehouse(){
    }
    public static Warehouse getInstance(){
        return REPOSITORY;
    }

    public Map getOvalMap(){
        return ovalMap;
    }

    public void makeChanges(Oval oval){
        for(Map.Entry entry:ovalMap.entrySet()){
            if(entry.getKey().equals(oval.getId())&&((OvalContainer)entry.getValue()).getOval().equals(oval)){
                ovalMap.remove(oval.getId());
                ovalMap.put(oval.getId(),new OvalContainer(oval));
                break;
            }
        }
    }
}
