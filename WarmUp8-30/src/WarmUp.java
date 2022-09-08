import java.util.Scanner;
import static java.lang.System.out;

// WARNING: This code has bugs! You must debug this code to have a successful java program!!
//

// Demonstrate your mastery of intelliJ by...
//    1) adding, editing, deleting source files in a project
//    2) create a new java class file with intelliJ and add it to your project
//    3) create a new project and.. add, edit, delete, save, open new *.cpp files -- where are your source files saved?
//    4) break intelliJ and fix ix
//    5) break intelliJ again and fix it again!
//
// Code up a method
//    1) get your method working
//    2) code up a multi-parameter method and use it in a java program!
//    advanced) get two ints from the user and output the sum of the two numbers
//    advanced02) code up a method that use "overloading"

// References:
// https://www.w3schools.com/java/java_methods.asp
// https://www.w3schools.com/java/java_methods_param.asp
// https://www.w3schools.com/java/java_methods_overloading.asp

public class WarmUp {
    static void anyMethodName() {
        System.out.println("\n\nHello from anyMethodName()!");
    }

    static int addTwoNumbers(int num1, int numTwo) {
        // declare and initialize a local variable to use in this method
        int result = 0;

        // process the input
        result = num1 + numTwo;

        // return the result of processing!
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // variable declaration section
        int num1;
        int num2;

        System.out.println("\n\nWelcome to WarmUp 30 Aug 22!\n\n");

        anyMethodName();
        out.println("Please enter the first number you would like to add:");
        num1 = input.nextInt();
        out.println("Please enter the second number you would like to add:");
        num2 = input.nextInt();
        out.println("\nThe sum of two numbers is: " + addTwoNumbers(num1, num2) + "\n\n");

    }
}