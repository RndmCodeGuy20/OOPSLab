import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

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
