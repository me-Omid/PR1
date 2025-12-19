public class zweidemensionalearray{
    public static void main(String[] args){
        char[][] zweidemensional = new char[2][];
        zweidemensional[0] = new char[]{'H','A'};
        zweidemensional[1] = new char[]{'W','E'};

        for(char[] arr : zweidemensional){
            for(char c : arr){
                System.out.print(c + " ");
            }
            System.out.println("");

        }


    }
}