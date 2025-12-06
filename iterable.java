import java.util.*;
public class iterable{
    public static void main(String[] args){

        ArrayList<String> einkaufsliste = new ArrayList<String>();

        for(String s: eingabe()){
            einkaufsliste.add(s);
        }

        System.out.println(einkaufsliste);



    }
    public static Iterable<String> eingabe(){
        Scanner sc = new Scanner(System.in);
        HashSet<String> einkaufsliste = new HashSet<String>();
        while(sc.hasNextLine()){
            String einkauf = sc.nextLine();
            if(einkauf.equals("nichts")){
                break;
            }
            einkaufsliste.add(einkauf);
        }
        return einkaufsliste;
    }
}