import java.util.Scanner;

public class oven {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		int C = sc.nextInt();
		
		H=H+C/60;
		M=M+C%60;
		
		if(M>59){
			H++;
			M=M-60;
		}
		if(H>23) {
			H=H-24;
		}
		System.out.println(H+" "+M);
			
	
	}

}
