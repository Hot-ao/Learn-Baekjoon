import java.util.Scanner;
	public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double grade[] = new double [N];
		double max = 0;
		double sum=0;
		for(int i=0;i<N;i++) {
			grade[i] = sc.nextDouble();
			if(grade[i]>max) max = grade[i];
		}
		for(int i=0;i<N;i++) {
			grade[i]=grade[i]/max*100;
			sum+=grade[i];
		}
		System.out.printf("%f",sum/N);
		sc.close();
	}
}