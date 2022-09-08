//Java Code Challenge 8-23-22
//Toby Ens

import java.util.Scanner;

public class CodeChallenge {
    public static void main(String[] args){
        int num1;
        int num2;
        int num3;

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Please enter a value for num1:");
        num1 = inputScanner.nextInt();

        System.out.println("Enter a second integer:");
        num2 = inputScanner.nextInt();

        System.out.println("And one last integer:");
        num3 = inputScanner.nextInt();

        System.out.println("Thank you for entering the numbers: " + num1 + ", " + num2 + ", and " + num3 + ".");

        if (num1 > num2 && num1 > num3){
            System.out.println("Num1 equals " + num1 + " and is the largest integer!");
        } else if (num2 > num3) {
            System.out.println("Num2 equals " + num2 + " and is the largest integer!");
        } else {
            System.out.println("Num3 equals " + num3 + " and is the largest integer!");
        }
    }
}
