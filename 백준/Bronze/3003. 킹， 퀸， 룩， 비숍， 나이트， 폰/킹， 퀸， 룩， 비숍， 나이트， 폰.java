import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
        int stand[] = {1,1,2,2,2,8};
        int minsu[] = new int [6];
        int result[] = new int [6];
        
        for(int i=0;i<6;i++){
            minsu[i] = sc.nextInt();
            result[i]=stand[i]-minsu[i];
        }
        for(int i=0;i<6;i++){
            if(i==5) {
                System.out.println(result[i]);
                break;
            }
            System.out.print(result[i]+" ");
        }        	
	}
}