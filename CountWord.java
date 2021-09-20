import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Shantanu Mane E-85
 * 
 * @version 2.0.21
 * @brief Count the number of words in file.
 * 
 * @copyright @RndmCodeGuy20
 */
public class CountWord {
    public static void main(String[] args) throws IOException {

        String line;
        int wordCount = 0;

        FileReader fread = new FileReader("data.txt");
        BufferedReader bread = new BufferedReader(fread);

        while ((line = bread.readLine()) != null) {

            String words[] = line.split(" "); // ?Split the line read wrt to the parameter, space in this case.
            wordCount += words.length;

        }
        System.out.println("Number of words present in given file : " + wordCount);
        
        fread.close();
        bread.close();
    }
}

/**
 * PS C:\OOPSLab> javac .\CountWord.java      
 * PS C:\OOPSLab> java CountWord
 * Number of words present in given file : 10
 */