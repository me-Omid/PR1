import java.util.*;
public class Maps{
    public static void main(String args[])
    {
        Map<String, Integer> name_alter = new HashMap();

        name_alter.put("Omid", 20);
        name_alter.put("Kevin", 19);
        name_alter.put("Murat", 23);

        System.out.println(name_alter.get("Omid"));

        Set<String> namen = name_alter.keySet();
        for (String s: namen){
            System.out.println("Die Eingetragene Person mit dem Namen " + s + " ist im alter von " + name_alter.get(s));
        }

        name_alter.remove("Murat");
        Set<String> namen = name_alter.keySet();
        for (String s: namen){
            System.out.println("Die Eingetragene Person mit dem Namen " + s + " ist im alter von " + name_alter.get(s));
        }


    }
} 