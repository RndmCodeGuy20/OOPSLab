import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Shantanu Mane E-85
 * 
 * @version 2.0.21
 * @brief Count number of sentences in file.
 * 
 * @copyright @RndmCodeGuy20
 */
public class LineCount {
    public static void main(String[] args) throws IOException {
        String line;
        int lineCount = 0;

        FileReader fread = new FileReader("data.txt");
        BufferedReader bread = new BufferedReader(fread);

        while ((line = bread.readLine()) != null) {

            String lines[] = line.split("[?!.:]+");
            lineCount += lines.length;
        }

        System.out.println("Number of words present in given file : " + lineCount);

        fread.close();
        bread.close();
    }
}

/**
 * PS C:\OOPSLab> javac .\LineCount.java 
 * PS C:\OOPSLab> java LineCount
 * Number of words present in given file : 2
 */