import java.util.Arrays;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int student[] = new int [30];
		int come[] = new int [28];		
		int skip = 0;
		
		for (int i=0;i<30;i++) {
			student[i] = i+1;
		}
		
		for (int i=0;i<28;i++) {
			come[i] = sc.nextInt();
		}
		Arrays.sort(come);
		 
		for (int i=0;i<28;i++) {
			if(student[i+skip]!=come[i]) {
				System.out.println(student[i+skip]);
				skip++;
			}
		}
		if(skip==0) System.out.printf("29\n30");
		else if(skip==1) System.out.printf("30");
		sc.close();
	}
}