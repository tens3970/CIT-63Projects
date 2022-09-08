// Test.java
// tE 8/16/22
// Warmup demo for CIT-63 class

//import statements
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        //defining variables
        int firstNum = 0;
        int secondNum = 0;
        //creating the scanner object
        Scanner inputObject = new Scanner(System.in);
        //asking for the user's name
        System.out.println("Welcome to the integer multiplication program, what is your name?");
        String name = inputObject.nextLine();
        //asks for the two input numbers, if an integer is not given it notifies the user and reruns
        for (boolean success = false; !success;) {
            //attempts to get int inputs from user
            try {
                System.out.println("Alright " + name + ", please input the first number you would like to multiply:");
                firstNum = inputObject.nextInt();
                System.out.println(firstNum + " is a great choice, please input the second number you would like to multiply:");
                secondNum = inputObject.nextInt();
                //sets success value to true to notify the loop it can move on
                success = true;
            } catch (Exception e) {
                //in the case that an integer isn't given, prints error message to the user and restarts the loop
                System.out.println("I want a number not a piece of text. Please try again.");
                inputObject.nextLine();
            }
        }
        //prints out the user's name and the product of the two numbers
        System.out.print("Ok " + name + ", the product of your numbers is: " + (firstNum * secondNum));
        //checks how the two numbers compare to each other and shares that comparison with the user
        if (firstNum == secondNum){
            System.out.println(", and your numbers were both equal!");
        } else if (firstNum > secondNum) {
            System.out.println(", and your first number: " + firstNum + ", was larger!");
        } else {
            System.out.println(", and your second number: " + secondNum + ", was larger!");
        }

    }
}
