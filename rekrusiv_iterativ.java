public class rekrusiv_iterativ{
    public static void main(String args[]){
        //System.out.println(iterativ(2,23));
        rekrusiv_sterne(1);
        rekrusiv_sterne(2);
        rekrusiv_sterne(3);
        rekrusiv_sterne(4);
    }


// Potenzen
    /* public static double iterativ(int zahl, int potenz){
        double ergebnis = zahl;
        for(int i = 1; i < potenz; i++){
            ergebnis = ergebnis * zahl;
        }
        return ergebnis;
    }

   /* public static double rekrusiv(int zahl, int potenz){
        double ergebnis = zahl;
        if(potenz == 1){
            return zahl;
        }
        else{
            return rekrusiv(ergebnis);
        }
    } */


// Sterne Potenzen

    public static void rekrusiv_sterne(int potenz){
        if(potenz == 0){
            System.out.println("*");
        }
        else if(potenz >= 2){
            System.out.print("**");
            rekrusiv_sterne(potenz - 1);
        }else{
            System.out.println("**");
        }
    }
}