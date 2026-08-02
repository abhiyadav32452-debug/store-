package If_Else;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        double n = sc.nextDouble();
        if (n % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
            System.out.println("Abhinav");
        }
    }
}
