import java.util.Scanner;
	public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Num[] = new int [N];
		int count=0;	//약수 개수
		int prime=0;	//소수 개수
		for(int i=0;i<N;i++) {
			Num[i]=sc.nextInt();
		}
		for(int i=0;i<N;i++) {
			count = 0;
			for(int j=1;j<=Num[i];j++) {
				if(Num[i]%j==0) count++;
			}
			if(count==2) prime++;
		}
		System.out.println(prime);
		sc.close();
	}
}