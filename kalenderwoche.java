import java.util.Scanner;
public class kalenderwoche{

	public static void main(String[] args){
	
		kalenderwoche_ausgeben();
	}
	
	public static void kalenderwoche_ausgeben(){
	
		Scanner sc = new Scanner(System.in);
		int kalenderwoche;
		while(true){
			System.out.print("KW?");
			int kw = sc.nextInt();
			if(kw > 52 || kw < 1){
				System.out.println("Falsche KW");
			}else{
				kalenderwoche = kw;
				break;
			}
		}
		int[] p1 = new int[]{5,10,15,20,25,30,35,40,45,50};
		for(int i = 0; i < p1.length; i++){
			if(p1[i] == kalenderwoche){
				System.out.println("Person 1");
			}
		}
		
		
	}
	
}