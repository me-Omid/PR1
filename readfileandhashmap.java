import java.io.*;
import java.util.*;

public class readfileandhashmap{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("file.txt"));
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        while(sc.hasNextLine()){
            String word = sc.next();
            if(map.containsKey(word)){
                int count = map.get(word);
                count++;
                map.put(word, count);
            }   
            else{
                map.put(word, 1);
            }
        }
        sc.close();

        System.out.println(map);
    }
}