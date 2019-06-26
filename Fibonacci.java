package neps;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		int n = inp.nextInt();
		int a = 1, b = 0, c = 0;
		
		for (int i = 0; i < n; i++) {
			
			System.out.print(c +" ");
			c = a + b;
			a = b;
			b = c;
		}
	}
}