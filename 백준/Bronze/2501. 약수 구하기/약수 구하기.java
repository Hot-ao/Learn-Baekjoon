import java.util.Scanner;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		ArrayList<Integer>  Divisor = new ArrayList<Integer>();
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		for (int i=1;i<=N;i++) {
			if(N%i==0) Divisor.add(i);
		}
		if(K-1>=Divisor.size()) System.out.println("0");
		else	System.out.println(Divisor.get(K-1));
	}
}