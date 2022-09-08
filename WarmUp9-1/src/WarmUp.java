import java.util.Scanner;

import static java.lang.System.out;

public class WarmUp {
    //method to find day of week that corresponds to the number you pass in
    static String dayOfWeek(int dayNum){
        //declare string that will be returned
        String weekDay;
        //set weekDay variable to the proper string using a switch statement
        switch (dayNum){
            case 1:
                weekDay = "Monday";
                break;
            case 2:
                weekDay = "Tuesday";
                break;
            case 3:
                weekDay = "Wednesday";
                break;
            case 4:
                weekDay = "Thursday";
                break;
            case 5:
                weekDay = "Friday";
                break;
            case 6:
                weekDay = "Saturday";
                break;
            case 7:
                weekDay = "Sunday";
                break;
        //default output if the int passed in isn't between 1-7
            default:
                weekDay = "That number does not correspond to a day of the week, please enter a number between 1-7.";
                break;
        }
        return weekDay;
    }

    //method to find the largest of 3 integers
    static int numberCompare(int n1, int n2, int n3){
        //declare variables
        int largest;
        //logic to find the largest
        if (n1 > n2 && n1 > n3){
            largest = n1;
        } else if (n2 > n3){
            largest = n2;
        } else {
            largest = n3;
        }
        return largest;
    }

    public static void main(String[] args){
        //variable declaration
        int num1;
        int num2;
        int num3;
        int weekNum;

        //initialize scanner
        Scanner inputDevice = new Scanner(System.in);

        //get 3 integers from user
        out.println("\n\nWelcome to the integer comparison and day of week printer!\n\nPlease enter your first integer:");
        num1 = inputDevice.nextInt();
        out.println("Ok, your first integer is " + num1 + ", please enter your second:");
        num2 = inputDevice.nextInt();
        out.println("Ok, your second integer is " + num2 + ", please enter your second:");
        num3 = inputDevice.nextInt();

        //get the number for the weekday from the user
        out.println("Ok, your final integer is " + num3 + ".\n\nNow enter an integer between 1 and 7 for the day of the week:");
        weekNum = inputDevice.nextInt();

        //output the information from the user by calling the previously created methods
        out.println("\n\nThe largest number that you inputted was " + numberCompare(num1, num2, num3) + ", and the day of week corresponding to " + weekNum + " was " + dayOfWeek(weekNum) + ".\nThank you for using this program.");
    }
}
