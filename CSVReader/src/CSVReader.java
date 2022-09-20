import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
    public static void main(String[] args){
        String path = "C:/Users/Toby/Desktop/Programming/CIT Projects/CSVReader/CrimeData.csv";
        String line = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null){
                String[] values = line.split(",");
                System.out.println("Date: " + values[3] + ", Crime description: " + values[9]);
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
