package by.epam.task.validate;


import java.util.ArrayList;
import java.util.List;

import by.epam.task.entity.Oval;
import by.epam.task.entity.Point;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DataValidator{
    private static final Logger log= LogManager.getLogger(DataValidator.class);
    public static boolean isDigits(String str){
        char ch[]={'1','2','3','4','5','6','7','8','9','0','.','-'};
        boolean flag=false;
        for(int i=0; i<str.length(); i++){
            flag=false;
            if(str.charAt(i)==' '&&i!=0){
                flag=true;
                continue;
            }
            for(int j=0; j<12; j++){
                if(str.charAt(i)==ch[j]) {
                    flag =true;
                    break;
                }
            }
            if(!flag){
                log.warn("Data is not digit");
                return flag;
            }
        }
        return flag;
    }
    public static List toDigits(String str, Object o){
        List<Double> arr=new ArrayList<Double>();
        StringBuilder string;
        str=str.trim();
        try {
            if (DataValidator.isDigits(str)) {
                str += " ";
                string = new StringBuilder("");
                boolean negative=false;
                int i=0;
                    for (int j = 0; j < str.length(); j++) {
                        if(str.charAt(j)=='-'){
                            negative=true;
                            continue;
                        }
                        if (str.charAt(j) == ' ') {
                            arr.add( Double.parseDouble(string.toString()));
                            if(negative){
                                double temp=arr.remove(i);
                                arr.add(temp*-1);
                            }
                            string.delete(0, string.length());
                            negative=false;
                            i++;
                            continue;
                        }
                        string.append(str.charAt(j));
                    }
            } else return null;
            if(!isValid(arr,o)){
                throw new ValidationException();
            }
        }catch(ValidationException e){

        }
        return arr;
    }
    public static boolean isValid(List<Double> arr,Object o){
        if ((o instanceof Oval) && (arr.size()!=4||arr.get(2) <= 0.0 || arr.get(3) <= 0.0)) {
            log.error("Data is not valid, can't create oval");
            return false;
        }
        else if(o instanceof Point &&arr.size()!=2){
            log.error("Data is not valid, can't create point");
            return false;
        }
        else return true;
    }
}
