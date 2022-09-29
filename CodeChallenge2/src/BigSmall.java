import java.util.Scanner;

public class BigSmall {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int[] numbers = new int[20];
        int numbersEntered = 0;
        String input;
        String output;

        int currentNum;
        int min;
        int max;

        System.out.println("\nWelcome to the BigAndSmall numbers game! You can enter up to 20 numbers, and the program will tell you the largest and smallest numbers you entered!");

        while (numbersEntered < 20){
            System.out.println("\nPlease enter an integer or the text \"done\" if you are finished.");
            input = myScanner.nextLine();
            try {
                if (input.equalsIgnoreCase("done")){
                    break;
                }
                int intInput = Integer.parseInt(input);
                numbers[numbersEntered] = intInput;
                numbersEntered++;
            } catch (Exception e){
                System.out.println("Please input a number instead!");
            }
        }

        min = numbers[0];
        max = numbers[0];
        output = "You entered these numbers: ";

        for (int i = 0; i < numbersEntered; i++){
            currentNum = numbers[i];
            min = Integer.min(min, currentNum);
            max = Integer.max(max, currentNum);
            output = output + currentNum + ", ";
        }
        output = output + "and these are the largest/smallest numbers:";
        System.out.println(output);
        System.out.println("Largest: " + max);
        System.out.println("Smallest: " + min);
    }
}
