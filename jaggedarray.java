import java.util.Scanner;
public class jaggedarray{
    public static void main(String[] args){
        pascaldreieck();
    }
    public static void pascaldreieck(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Wieviele Zeilen? ");
        int zeilen = sc.nextInt();
        //int[][] pascal = new int[zeilen][];
        for(int i = 0; i < zeilen; i++){
            for(int j = 0; j < i; j++){
                System.out.print(i);
            }

            System.out.println("");
        }

    }
}