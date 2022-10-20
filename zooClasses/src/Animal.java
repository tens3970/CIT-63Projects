import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Animal {
    static int numOfAnimals = 0;
    String species;
    public Animal(){
        numOfAnimals++;
    }

    public void makeNoise() {
    }

    public static void main(String[] args) {

        //Set up file io
        HashMap<Integer, Animal> allAnimals = new HashMap<Integer, Animal>();
        String arrivingDataFilePath = new File("").getAbsolutePath();
        arrivingDataFilePath = arrivingDataFilePath.concat("\\src\\arrivingAnimals.txt");
        try {
            File dataFile = new File(arrivingDataFilePath);
            Scanner scanner = new Scanner(dataFile);


            //Read through file
            while (scanner.hasNextLine()){
                String data = scanner.nextLine();

                //Make a new animal for each line
                Animal currentAnimal;
                switch (data.split(" ")[4]){
                    case "hyena," -> currentAnimal = new Hyena(data);
                    case "lion," -> currentAnimal = new Lion(data);
                    case "bear," -> currentAnimal = new Bear(data);
                    case "tiger," -> currentAnimal = new Tiger(data);
                    default -> currentAnimal = new Animal();
                }


                //Add that animal to the hashmap
                allAnimals.put(numOfAnimals-1, currentAnimal);
            }
            scanner.close();

        } catch (FileNotFoundException e){
            System.out.println("Couldn't find file.");
            e.printStackTrace();
        }

        //Print out the noises all the animals make
        System.out.println("There is a total of " + numOfAnimals + " animals.");
        for (int i = 0; i < numOfAnimals; i++){
            System.out.println("\nAnimal #" + i + " is a " + allAnimals.get(i).species);
            allAnimals.get(i).makeNoise();
        }

    }
}
