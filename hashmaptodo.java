// NICHT BEENDET ____________________ :/
import java.util.*;
import java.io.*;

public class hashmaptodo{
    public static void main(String[] args){
        Scanner cs = null;
        File todos = new File("./files/todos.txt");
        try{
            cs = new Scanner(todos);
        }catch(FileNotFoundException e){
            System.out.println("Datei wurde leider nicht gefunden");
        }

        Scanner user_cs = new Scanner(System.in);
        while(true){
            String user_input = user_cs.nextLine();
            if(user_input.equals("exit")){
                break;
            }else{
                user_input.printf(user_input);
            }
        }
        while(cs.hasNext()){
            System.out.println(cs.next());
        }


    }
}