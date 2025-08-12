import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int a,b;
        int c;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        a=scanner.nextInt();
        System.out.println("Enter second number");
        b= scanner.nextInt();
        System.out.println("Enter the sign");
        c=scanner.nextInt();

        switch (c) {
            case 1:
                System.out.println("Sum is " + (a + b));
                break;
            case 2:
                System.out.println("Difference is " + (a - b));
                break;
            case 3:
                System.out.println("Multiplication is "+(a*b));
                break;
            case 4:
                System.out.println("Division is "+(a/b));
                break;
            default:
                System.out.println("Invalid sign");
                break;
        }
    }
}
