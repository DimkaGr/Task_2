package by.epam.task.access;

import by.epam.task.entity.Oval;
import by.epam.task.entity.OvalContainer;
import by.epam.task.entity.Warehouse;

import java.util.*;

public class DaoImpl implements Dao{

    private List<Oval> list=new ArrayList();
    private static Warehouse REPOSITORY=Warehouse.getInstance();
    private static Map<Integer,OvalContainer> map=REPOSITORY.getOvalMap();
    private Oval oval=null;
    private final static int ID_COMP=1;
    private final static int NAME_COMP=2;
    private final static int SQUARE_COMP=3;
    private final static int PERIMETER_COMP=4;

    public void addObject(Oval o) {
        map.put(o.getId(),new OvalContainer(o));
    }


    public void deleteObject(Oval o) {
        Integer id=o.getId();
        for(Map.Entry entry:map.entrySet()){
            if((entry.getKey().equals(id))&&((OvalContainer)entry.getValue()).getOval().equals(oval)){
                map.remove(id);
                break;
            }
        }
    }
    public List getByID(Integer id) {
        for(Map.Entry entry:map.entrySet()){
            if(entry.getKey().equals(id)){
                list.add(((OvalContainer)entry.getValue()).getOval());
            }
        }
        return list;
    }

    public List getByName(String str) {
        for(Map.Entry<Integer,OvalContainer> entry:map.entrySet()){
            oval=((OvalContainer)entry.getValue()).getOval();
            if(oval.getName().equals(str)) {
                list.add(oval);
            }
        }
        return list;
    }

    public List getByCoordinate(double x, double y) {
        for(Map.Entry entry:map.entrySet()){
            oval=((OvalContainer)entry.getValue()).getOval();
            if(oval.getXCenter()==x&&oval.getYCenter()==y){
                list.add(oval);
            }
        }
        return list;
    }

    public List getBySquare(double min, double max) {
        for(Map.Entry entry:map.entrySet()){
            double square=((OvalContainer)entry.getValue()).getSquare();
            if(square<max&&square>min){
                list.add(((OvalContainer)entry.getValue()).getOval());
            }
        }
        return list;
    }

    public List getByPerimeter(double min, double max) {
        for(Map.Entry entry:map.entrySet()){
            double perimeter=((OvalContainer)entry.getValue()).getPerimeter();
            if(perimeter<max&&perimeter>min){
                list.add(((OvalContainer)entry.getValue()).getOval());
            }
        }
        return list;
    }

    public List getByDistance(double dist) {
        for(Map.Entry entry:map.entrySet()){
            oval=((OvalContainer)entry.getValue()).getOval();
            if(Math.sqrt(Math.pow(oval.getXCenter(),2)+Math.pow(oval.getYCenter(),2))<dist){
                list.add(oval);
            }
        }
        return list;
    }

    public void sortById(){
        map=sortByParameter(map,1);
    }

    public void sortByName(){
        map=sortByParameter(map,2);
    }

    public void sortBySquare(){
        map=sortByParameter(map,3);
    }

    public void sortByPerimeter(){
        map=sortByParameter(map,4);
    }

    public Map<Integer,OvalContainer> sortByParameter(Map<Integer,OvalContainer>unsortedMap, final int parameter){
        List<Map.Entry<Integer,OvalContainer>>list=new ArrayList(unsortedMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer,OvalContainer>>(){
            public int compare(Map.Entry<Integer,OvalContainer>a,Map.Entry<Integer,OvalContainer>b){
                switch(parameter){
                    case ID_COMP:
                        return a.getKey().compareTo(b.getKey());
                    case NAME_COMP:
                        return (a.getValue()).getOval().getName()
                                .compareTo(((OvalContainer)b.getValue()).getOval().getName());
                    case SQUARE_COMP:
                        if (((OvalContainer)a.getValue()).getSquare()<((OvalContainer)b.getValue()).getSquare()){
                            return -1;
                        }
                        else if(((OvalContainer)a.getValue()).getSquare()>((OvalContainer)b.getValue()).getSquare()){
                            return 1;
                        }else return 0;
                    case PERIMETER_COMP:
                        if (((OvalContainer)a.getValue()).getPerimeter()<((OvalContainer)b.getValue()).getPerimeter()){
                            return -1;
                        }
                        else if(((OvalContainer)a.getValue()).getPerimeter()>((OvalContainer)b.getValue()).getPerimeter()){
                            return 1;
                        }else return 0;
                        default: return 0;
                }
            }
        });
        Map<Integer,OvalContainer>sortedMap=new HashMap();
        for(Map.Entry<Integer,OvalContainer>entry:list){
            map.put(entry.getKey(),entry.getValue());
        }
        return sortedMap;
    }
}
