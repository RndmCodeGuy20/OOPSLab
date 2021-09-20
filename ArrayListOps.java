import java.util.ArrayList;
import java.util.Iterator;
import java.util.Comparator;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListOps {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayListOps arrayListOps = new ArrayListOps();

        int n, i = 0;
        String Name;

        ArrayList<String> originalList = new ArrayList<String>();
        ArrayList<String> reverseList = new ArrayList<String>();

        System.out.println("Enter the total number of students in class :");
        n = scan.nextInt();

        System.out.println("Enter the Names of Students: ");

        for (i = 0; i < n; i++) {
            System.out.println("Student : " + (i + 1));
            Name = scan.next();
            originalList.add(Name);
        }

        Iterator<String> it = originalList.iterator();
        System.out.println("List of Students: \n");
        while (it.hasNext()) {
            System.out.print(it.next() + "   ");
        }

        reverseList = arrayListOps.revArrayList(originalList);
        System.out.print("\n\nList of Students in reverse order: ");
        arrayListOps.dispEl(reverseList);

        Collections.sort(originalList);
        System.out.println("\n\nList of Students in Alphabetical Order: " + originalList);

        Comparator c = Collections.reverseOrder();
        Collections.sort(originalList, c);

        System.out.println("\nSorted list using Comparator : " + originalList);

        scan.close();
    }

    public ArrayList<String> revArrayList(ArrayList<String> ArrList) {
        ArrayList<String> revArrayList = new ArrayList<String>();

        for (int i = ArrList.size() - 1; i >= 0; i--) {
            revArrayList.add(ArrList.get(i));
        }
        return revArrayList;
    }

    public void dispEl(ArrayList<String> ArrList) {
        for (int i = 0; i < ArrList.size(); i++) {
            System.out.print(ArrList.get(i) + " ");
        }
    }
}










/**
 * Enter the total number of students in class : 4 
 * Enter the Names of Students:
 * Student : 1 Shantanu 
 * Student : 2 Shyam 
 * Student : 3 Ranjeet 
 * Student : 4 Amol
 * 
 * List of Students:
 * Shantanu Shyam Ranjeet Amol
 * 
 * List of Students in reverse order: Amol Ranjeet Shyam Shantanu
 * 
 * List of Students in Alphabetical Order: [Amol, Ranjeet, Shantanu, Shyam]
 * 
 * Sorted list using Comparator : [Shyam, Shantanu, Ranjeet, Amol]
 */