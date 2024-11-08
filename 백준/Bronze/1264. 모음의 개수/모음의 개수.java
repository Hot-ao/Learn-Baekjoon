import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String sentence = "";
		char vowel[] = {'a','e','i','o','u'};
		int count;
		
		while(true) {
			sentence = sc.nextLine();
			if (sentence.equals("#")) break;
			count=0;
			sentence = sentence.toLowerCase();
			for (int i=0;i<sentence.length();i++) {
				char c = sentence.charAt(i);
				for (char s : vowel) {
					if(c==s) count++;
				}
			}
			System.out.println(count);
		}
		
	}
}