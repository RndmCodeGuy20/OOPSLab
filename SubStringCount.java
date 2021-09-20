import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Shantanu Mane E-85
 * 
 * @version 2.0.21
 * @brief Count the number of occurrences of substring.
 * 
 * @copyright @RndmCodeGuy20
 * 
 * 
 * @TestInput What is the example of simple paragraph? The trouble is that no
 *            one knows what a belief is, no one knows what a fact is, and no
 *            one knows what sort of agreement between them would make a belief
 *            true. Let us begin with belief.” This is another example of a good
 *            paragraph. It has also discussed a single point that is knowledge
 *            and then elaborated it further.
 */

public class SubStringCount {
    public static void main(String[] args) throws IOException {
        /**
         * TODO : Use scanner to input substring (search) TODO : filepath in string TODO
         * : Use file and bufferreader
         */

        String testString;
        String filePath = "SubString.txt";

        String strLine;
        int numRead = 0;

        Scanner scan = new Scanner(System.in);
        testString = scan.nextLine();

        FileReader fread = new FileReader(filePath);
        BufferedReader bread = new BufferedReader(fread);

        while ((strLine = bread.readLine()) != null) {
            strLine = strLine + " ";

            String strArr[] = strLine.split(testString);

            if (strArr.length > 1) {
                numRead += strArr.length - 1;
            } else {
                if (strLine == testString) {
                    numRead++;
                }
            }
        }

        System.out.println(numRead);

        scan.close();
        bread.close();
        fread.close();
    }
}

/**
 * PS C:\OOPSLab> javac .\SubStringCount.java 
 * PS C:\OOPSLab> java SubStringCount
 * me 
 * 1
 * 
 * PS C:\OOPSLab> javac .\SubStringCount.java 
 * PS C:\OOPSLab> java SubStringCount
 * one 
 * 3
 */