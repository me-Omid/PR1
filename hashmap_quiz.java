
import java.util.*;

public class hashmap_quiz{
    public static void main(String[] args){

        int punkte = 0;

        HashMap<String, String> hauptstadt = new HashMap<>();
        hauptstadt.put("Deutschland", "Berlin");
        hauptstadt.put("Afghanistan", "Kabul");
        hauptstadt.put("Frankreich", "Paris");
        hauptstadt.put("Österreich", "Wien");

        while(true){
            Scanner cs = new Scanner(System.in);
            Set<String> laender = hauptstadt.keySet();
            for(String s: laender){
                System.out.println("Was ist der Hauptstadt von " + s + " ?");
                String user_input = cs.nextLine();
                if(user_input.equals("exit") || user_input.equals("") ){
                    break;
                }else if(user_input.equals(hauptstadt.get(s))){
                    System.out.println("Richtig!!!");
                    punkte++;
                }else{
                    System.out.println("Falsch!!! der Hauptstadt von " + s + " ist " + hauptstadt.get(s));
                    System.out.println("Allgemeintwissen btw :/");
                }
            }
            System.out.println("Sie haben von " + laender.size() + " Fragen " + punkte +" Frage Richig beantwortet!!!");
            break;

        }
    }
}