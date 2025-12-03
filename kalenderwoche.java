import java.util.Scanner;
public class kalenderwoche{

	public static void main(String[] args){
	
		kalenderwoche_ausgeben();
	}
	
	public static void kalenderwoche_ausgeben(){
	
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("KW?");
			int kw = sc.nextInt();
			int P2 = 1;
			int P3 = 2;
			int P4 = 3;
			int P5 = 4;
			int P1 = 5;
			if(kw > 52 || kw < 1){
				System.out.println("Falsche KW");
			}else{

			}
		}
		
		
		
	}
	
}