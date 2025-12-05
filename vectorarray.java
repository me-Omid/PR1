import java.util.*;
public class vectorarray{
    public static void main(String[] args){
        Double[][] temp = new Double[3][3];
        temp[0][0] = 1.0;
        temp[1][0] = 2.0;
        temp[2][0] = 3.0;
        temp[1][1] = 3.0;

        System.out.println(Arrays.deepToString(temp));

        for(int i = 0; i < temp.length; i++){
            for(int j = 0; j < temp[i].length; j++){
                System.out.print(temp[i][j] + " ");
            }
            System.out.println("");
        }

    }
}