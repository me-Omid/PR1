import java.util.*;
public class collections{
    public static void main(String[] args){
        Set<String> namen = new HashSet<String>();
        namen.add("Omid");
        namen.add("Kevin");

        System.out.println("HashSet: " + namen);

        HashMap<String, Integer> alter = new HashMap<String, Integer>();

        alter.put("Omid", 21);
        alter.put("Kevin", 9);

        System.out.println("HashMap: " + "Omid ist " + alter.get("Omid"));


        Set<Set<String>> gruppen = new HashSet<Set<String>>();

        Set<String> gruppe1 = Set.of("Kevin", "Albert");
        Set<String> gruppe2 = Set.of("Omid", "Mathias");
        Set<String> gruppe3 = Set.of("Bowl", "David");
        Set<String> gruppe4 = Set.of("Alberto", "Luis");

        gruppen.add(gruppe1);
        gruppen.add(gruppe2);
        gruppen.add(gruppe3);
        gruppen.add(gruppe4);

        int zahl = 1;
        for(Set<String> s : gruppen){
            System.out.println("Gruppe "+ zahl + " " + s);
            zahl++;
        }



        int[] zahlen = new int[5];
        zahlen[0] = 1;
        zahlen[1] = 2;
        zahlen[2] = 3;
        zahlen[3] = 4;
        zahlen[4] = 5;

        System.out.println("Hier werden die Zahlen aus dem Array ausgegeben nach der Reinfolge: ");
        for(int i = 0; i < zahlen.length; i++){
            System.out.println(zahlen[i]);
        }

    }
}