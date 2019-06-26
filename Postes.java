package neps;
import java.util.Scanner;

public class Postes {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		int s = 0;
		int c = 0;
		int a = 0;
		
		for (int i = 0; i < n; i++) {
			a = inp.nextInt();
			if (a < 50) {
				s++;
			}else if (a >= 50 && a < 85) {
				c++;
			}
		}
		System.out.print(s+ " "+ c);

	}

}
