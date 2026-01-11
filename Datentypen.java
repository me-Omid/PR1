import java.util.*;
public class Datentypen{
    public static void main(String[] args){



        Set<Set<String>> groups = new HashSet<>();

        Set<String> group04 = Set.of("Omid", "Luis", "Devick", "Prashant");
        Set<String> group01 = Set.of("Kevin", "Mathias", "Albert");

        groups.add(group04);
        groups.add(group01);



        for(Set<String> s:groups){
            System.out.println("Group: " + s);
        }



    }
}