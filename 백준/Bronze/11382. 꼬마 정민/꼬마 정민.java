import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        long y = scanner.nextLong();
        long z = scanner.nextLong();
        
        System.out.println(x+y+z);
        scanner.close();
    }
}

/*
    *런타임 오류가 계속해서 났음;
        이유는 입력 값이 10의 12제곱으로 int로는 받지 못하는 큰 값
        따라서 int가 아닌 long으로 받아야함
    *앞으로 런타임 오류가 뜬다면 입력 값의 범위를 확인하고, long으로 바꿔서 해보기
        큰 값이라 함은 지수가 마구마구 붙어 있는 거라고 생각하면 되지 않을까 싶음
*/
