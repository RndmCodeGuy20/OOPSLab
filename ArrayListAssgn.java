import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * @author Shantanu Mane E-85
 * 
 * @version 1.0.2
 * @brief Practice assignment on ArrayList, sorting and reversing arrays.
 * 
 * @copyright @RndmCodeGuy20
 */

public class ArrayListAssgn {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<Integer>();

        array.add(new Integer(2));
        array.add(new Integer(5));
        array.add(new Integer(1));
        array.add(new Integer(4));
        array.add(new Integer(3));
        array.add(new Integer(6));

        Iterator iterator = array.iterator();

        System.out.println("Array List using Iterator : ");

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        Collections.reverse(array);
        System.out.println("\n\nReversed Array : ");
        dispArr(array);

        Collections.sort(array);
        System.out.println("\n\nSorted Array : ");
        dispArr(array);
    }

    public static void dispArr(ArrayList<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }
    }
}


/* 
        *OUTPUT

PS C:\OOPSLab> java ArrayListAssgn        

Array List using Iterator : 
2 5 1 4 3 6 

Reversed Array :
6 3 4 1 5 2

Sorted Array :
1 2 3 4 5 6
*/