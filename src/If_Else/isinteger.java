package If_Else;

import java.util.Scanner;

public class isinteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter CP:");
        int cp = sc.nextInt();
            System.out.println("Even SP");
            int sp = sc.nextInt();
            if(sp >= cp) System.out.println("Profit");
            else System.out.println("Loss");
        }
    }
