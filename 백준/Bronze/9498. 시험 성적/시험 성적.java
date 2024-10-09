import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        String grade;

        switch(score/10) {
        	case 10:
        	case 9:	grade="A"; break;
        	case 8:	grade="B"; break;
        	case 7:	grade="C"; break;
        	case 6:	grade="D"; break;
        	default:	grade="F";
        }
        
        System.out.println(grade);
        
        scanner.close();
    }
}

/*
    *switch 조건문에 score/10&10 이라고 했었음
        score가 int에 대하여 정수/정수 = 정수(소수점 이하 탈락) 이므로 굳이 나머지를 생각할 필요가 없었음
        또한, score/10%10을 하고, case 10 이 아닌 case 0이라면, score가 한자리 수 일 때, 10으로 나눠 0이 되고, 10으로 나눈 나머지도 0이 되므로 한자리 점수인데 A가 나오는 경우가 생김
    *정수/정수 = 정수(소수점 이하 탈락)***
*/
