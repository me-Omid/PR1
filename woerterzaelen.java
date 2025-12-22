import java.util.*;
import java.io.*;

public class woerterzaelen{
    public static void main(String[] args){

        HashMap<String, Integer> anzahl = new HashMap<>();
        Scanner cs = null;
        try{
            cs = new Scanner(new File("files/inhaltwoerter.txt"));
            System.out.println("Datei gefunden!!");
        }catch(FileNotFoundException e){
            System.out.println("Datei nicht gefunden!!");
            System.exit(0);
        }

        while(cs.hasNext()){
            String wort = cs.next();
            if(anzahl.containsKey(wort)){
                int erhoeht = anzahl.get(wort) + 1;
                anzahl.put(wort, erhoeht);
            }else{
                anzahl.put(wort, 1);
            }
        }

        for(String s: anzahl.keySet()){
            System.out.println(s + " : " + anzahl.get(s));
        }

        System.out.println(anzahl);



    }
}