import java.util.Arrays;
import java.util.Scanner;
public class WarmUp {
    static void listAnimals(){
        int n = 0;
        System.out.println("\nGreetings from the listAnimals() method!\n");
        String[] animals = {"lion", "tiger", "pig"};

        n = animals.length;

        for (int i = 0; i < n; i++){
            System.out.println("\nIn the loop of listAnimals() and..");
            System.out.println("i = " + i);
            System.out.println("and the animal at element " + i + " is " + animals[i]);
        }
        System.out.println("\nThe animals array is " + n + " elements long.");

    }

    static void createAnimalList(String an1, String an2){
        System.out.println("\nGreetings from the listAnimals() method!\n");
        System.out.println("The first animal is: " + an1);
        System.out.println("The second animal is: " + an2);

        String[] argh = new String[2];
        argh[0] = an1;
        argh[1] = an2;

        System.out.println(Arrays.toString(argh));
    }



    public static void main(String[] args){
        listAnimals();
        createAnimalList("Frog", "Dog");
    }
}
