//Warmup 8-23-22
//TE
//CIT-63

import java.util.Scanner;

public class Warmup {
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

        if (num1 > num2){
            System.out.println("\n" + num1 + " is greater than " + num2 + "!");
            System.out.println("\nNum1 is greater than num2!");
        } else {
            System.out.println("\n" + num2 + " is greater than " + num1 + "!");
            System.out.println("\nNum2 is greater than num1!");
        }

        for (int i = 0; i < 10; i++){
            System.out.println("\nNum1 = " + num1 + " and the value of i is: " + i);
        }

        int myControlLoopVariable = 0;

        while (myControlLoopVariable < 10){
            System.out.println("\nNum1 = " + num1 + " and the value of myControlLoopVariable is: " + myControlLoopVariable);
            myControlLoopVariable++;
        }
    }
}
