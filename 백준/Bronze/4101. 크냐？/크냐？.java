import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(true){
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if (a==0&&b==0) break;
        if (a>b) System.out.println("Yes");
        else System.out.println("No");
        }
    }
}