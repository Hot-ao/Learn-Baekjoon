import java.util.Scanner;
	public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double temp;
		if (a<b) {
			temp=b;
			b=a;
			a=temp;
		}
		if (a<c) {
			temp=a;
			a=c;
			c=temp;
		}
		if (b<c) {
			temp=b;
			b=c;
			c=temp;
		}
		System.out.printf("%.0f %.0f %.0f",c,b,a);
	}	
}