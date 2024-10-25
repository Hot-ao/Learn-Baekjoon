import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int list_N[] = new int[N];
		
		for (int i=0;i<N;i++) {
			list_N[i]=sc.nextInt();
		}
		
		int max = list_N[0];
		int min = list_N[0];
	
		for (int i=0;i<N;i++) {
			if(list_N[i]>max) max = list_N[i];
			if(list_N[i]<min) min = list_N[i];
		}
		System.out.println(min+" "+max);
	}
}