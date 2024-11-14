import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		if(str.equals(" ")) {
			System.out.println("0");
			return;
		}
		
		String tokens[] = str.trim().split(" ");
		System.out.println(tokens.length);
	}
}