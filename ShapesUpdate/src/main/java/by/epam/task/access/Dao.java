package by.epam.task.access;

import by.epam.task.entity.Oval;
import java.util.List;

public interface Dao {
    public void addObject(Oval o);
    public void deleteObject(Oval o);

    public List getByID(Integer id);
    public List getByName(String str);
    public List getByCoordinate(double x,double y);
    public List getBySquare(double min,double max);
    public List getByPerimeter(double min,double max);
    public List getByDistance(double dist);
}
