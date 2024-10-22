import java.util.Scanner;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int Integer[] = new int [9];
		int max = 0;
		int index=0;
		
		for (int i=0;i<9;i++) {
			Integer[i] = sc.nextInt();
			if (Integer[i]>max) {
				max = Integer[i];
				index = i;
			}
		}
		System.out.println(max);
		System.out.println(index+1);
	}
}