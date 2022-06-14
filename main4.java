import java.util.Scanner;

public class main4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		int num[] = new int[c];
		
		for(int i = 0; i<c; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			num[i] = a + b;	
		}
		
		for(int j: num) {
			System.out.println(j);
		}

	}

}
