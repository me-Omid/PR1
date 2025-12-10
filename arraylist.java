import java.util.ArrayList;
public class arraylist{
    public static void main(String[] args){
        ArrayList<String> hauptstaete = new ArrayList<String>();

        hauptstaete.add("Berlin");
        hauptstaete.add("Paris");
        hauptstaete.add("Kabul");
        hauptstaete.add("Rom");
        hauptstaete.add("Wien");

        for(int i = 0; i < hauptstaete.size(); i++){
            System.out.println(hauptstaete.get(i));
        }

    }
}
