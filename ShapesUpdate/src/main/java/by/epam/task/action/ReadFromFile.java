package by.epam.task.action;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ReadFromFile {
    private static final Logger LOG= LogManager.getLogger(ReadFromFile.class);
    public static List read(String fileName){
        List<String> list=new ArrayList();
        FileReader instream=null;
        try {
            instream = new FileReader(fileName);
            String tmp;
            BufferedReader buffer = null;
            try {
                buffer = new BufferedReader(instream);
                while ((tmp = buffer.readLine()) != null) {
                    list.add(tmp);
                }
            } catch (Exception e) {
                LOG.error("Exception massage");
            } finally {
                buffer.close();
            }
        }catch (FileNotFoundException e) {
            LOG.error("File " + fileName + " is not found");
        }catch(IOException ex){
            LOG.error("IOException massage");
        } finally {
            try {
                instream.close();
            }catch(NullPointerException e){
                LOG.error("Thread was not opened");
            }catch(IOException e){
                LOG.error("Couldn't close file "+fileName);
            }
        }
        return list;
    }
}
