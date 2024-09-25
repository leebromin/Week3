import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자 입력: ");
        int a = sc.nextInt();

        System.out.print("두 번째 숫자 입력: ");
        int b = sc.nextInt();

        System.out.print("연산자를 입력하시오 : ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case '-':
                System.out.println(a+" - "+b+" = "+(a-b));
                break;
            case '*':
                System.out.println(a+" * "+b+" = "+(a*b));
                break;
            case '/':
                System.out.println(a+" / "+b+" = "+(a/b));
                break;
            default:
                System.out.println("잘못 입력하셨습니다.");
        }
    }
}