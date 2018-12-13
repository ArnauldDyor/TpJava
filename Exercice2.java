package tpjava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Exercice2 {

    public static void main(String[] args){
        BufferedReader reader = null;
        String line = null;
        try {
            reader = new BufferedReader(new FileReader("/home/arnauld/IdeaProjects/TpJava/src/tpjava/file.txt"));
            line =  reader.readLine();

           ArrayList <String> listString = new ArrayList();
            /*list.add(line.split(":"));*/

            while(line != null){
                String[] list = line.split(":");
                listString.add(list[1]);
                 
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch ( IOException e) {
            e.printStackTrace();
        }



        //System.out.println("time to say goodbye");
    }
}
