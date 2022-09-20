import java.util.Scanner;

public class WarmUp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] anTypes = {"Lion", "Bear", "Tiger"};
        String[][] myZooAnimals = new String[3][3];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.println("Please enter the name for " + anTypes[i] + " number: " + (j+1));
                myZooAnimals[i][j] = input.nextLine();
            }
        }
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.println(anTypes[i] + " number " + (j+1) + " is named " + myZooAnimals[i][j] + ".");
            }
        }
    }
}
