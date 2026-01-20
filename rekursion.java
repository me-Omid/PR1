public class rekursion {
    
    public static void main(String[] args){

        System.out.println(fakulaet(3));

        runterzaelen(5);

        sternchenrekursion(5);
        System.out.println("");  

        mal2(8);

    }
    public static int fakulaet(int bis){
        if(bis <= 1){
            return 1;
        }
        else{
            return  bis + fakulaet(bis - 1);
        }
    }

    public static void runterzaelen(int von){
        System.out.println(von);
        if(von == 0){
            System.out.println(0);
        }
        else{
            runterzaelen(von - 1);
        }
    }

    public static void sternchenrekursion(int anzahl){
        if(anzahl == 1){
            System.out.print("*");
        }
        else{
            System.out.print("*");
            sternchenrekursion(anzahl - 1);
        }
    }

    public static void mal2(int startwert){
        if(startwert > 1000){
            System.out.println(startwert);
        }
        else{
            System.out.println(startwert);
            mal2(startwert * 2);
        }
    }
}

