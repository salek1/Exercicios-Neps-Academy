package neps;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] v = new int[n];
        int a = 0, b = 0;
        
        for (int i = 0; i < n; i++) {
            
            v[i] = inp.nextInt();
            
            if (i == 0) {
                a = v[0];
                b = v[0];
            }
            if (v[i] > a) {
                a = v[i];
            }else if (v[i] < b) {
                b = v[i];
            }
        }
        System.out.println(a);
        System.out.println(b);
   }
}
