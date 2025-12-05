import java.util.Scanner;
import java.util.ArrayList;
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

        System.out.println(einkaufsliste);
    }
}