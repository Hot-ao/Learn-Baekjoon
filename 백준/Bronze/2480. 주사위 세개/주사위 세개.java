import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int max = 0;
		int X=0;
		int result=0;

		if(a==b&&b==c) result = 10000+a*1000;
		else if(a!=b&&b!=c&&a!=c) {
			max = (a>b?a:b)>c?(a>b?a:b):c;
			result = max*100;
		}
		else {
			X = a==b?a:c;
			X = b==c?b:a;
			result = 1000+X*100;
		}
		System.out.println(result);
		
	}
}