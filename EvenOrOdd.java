import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        while (true) {
            int number = a.nextInt();
            if (number % 2 == 0) {
                System.out.println("Number is EVEN");
            } else
                System.out.println("Number is ODD");
            System.out.println("Enter number again");
        }
    }

}
