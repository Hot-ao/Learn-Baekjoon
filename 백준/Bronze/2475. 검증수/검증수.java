import java.util.Scanner;
	public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int serial=0;
		for (int i=0;i<5;i++) {
			int num = sc.nextInt();
			serial += Math.pow(num,2);			
		}
		System.out.println(serial%10);
		sc.close();
	}
}