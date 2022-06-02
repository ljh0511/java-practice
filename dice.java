import java.util.Scanner;

public class dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if(A==B && B==C && C==A) {
			System.out.println(10000+(A*1000));
		}else if(A==B || C==A) {
			System.out.println(1000+(A*100));
		}else if (B==C) {
			System.out.println(1000+(B*100));
		}else {
			
		}

	}

}
