import java.util.*;


public class stadt_land_zuordnung{
    public static void main(String[] args){

        HashMap<String, Set<String>> stadt = new HashMap<>();
        Set<String> de = new HashSet<>();
        de.add("Berlin");
        de.add("München");
        de.add("Hamburg");
        de.add("Bonn");
        de.add("Hameln");
        de.add("Hannover");
        Set<String> fr = new HashSet<>();
        fr.add("Paris");
        fr.add("Lyon");
        fr.add("Strassburg");
        fr.add("Tours");

        stadt.put("Deutschland", de);
        stadt.put("Frankreich", fr);

        Scanner cs = new Scanner(System.in);
        while(true){
            System.out.print("Geben sie einen Stadt Namen ein und ich sage ihnen wo es liegt: ");
            String user_question = cs.nextLine();

            if(user_question.equals("exit")){
                break;
            }else if(de.contains(user_question)){
                System.out.println(user_question + " Liegt in Deutschland");
            }else if(fr.contains(user_question)){
                System.out.println(user_question + " Liegt in Frankreich");
            }else{
                System.out.println(user_question + " Liegt weder in Deutschland noch in Frankreich");
            }
        }
    }
}