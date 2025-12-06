import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
public class listuserinput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> einkaufsliste = new ArrayList<String>();

        while(sc.hasNextLine()){
            String einkaufslisteinput = sc.nextLine();
            if(einkaufslisteinput.equals("exit")){
                break;
            }else{
                einkaufsliste.add(einkaufslisteinput);
            }
        }

        if(!einkaufsliste.contains("Milch")){
            einkaufsliste.add("Milch");
        }

        Iterator<String> itr = einkaufsliste.iterator();

        // Mit Itteratoren kann man eine Liste verändern während man sie ausließt 
        while(itr.hasNext()){
            String produkt = itr.next();
            System.out.println(produkt);
            if(produkt.equals("Ungesund")){
                itr.remove();
            }   
        }

        

        

        System.out.println(einkaufsliste);
    }
}