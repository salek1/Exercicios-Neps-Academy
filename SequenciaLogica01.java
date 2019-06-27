package neps;
public class SequenciaLogica01 {

	public static void main(String[] args) {
		
		int a = 0;
		
		for (int b = 1; b <= 47 ; b++) {
			
			if (b % 3 == 0) {
				a+=2;
				continue;
			}
			System.out.println("a = "+ a+" <->"+" b = "+ b);
		}
	}
}