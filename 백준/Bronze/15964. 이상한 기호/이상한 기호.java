import java.util.Scanner;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		System.out.printf("%.0f",a*a-b*b);
	}
}