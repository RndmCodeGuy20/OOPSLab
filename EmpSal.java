import java.io.*;
import java.util.*;

/**
 * @author Shantanu Mane E-85
 * 
 * @version 2.0.21
 * @brief Write a java program that reads a file containing data for 5 employees having empid, name and type of employee (permanent or adhoc) in an arraylist.
 * 
 * @copyright @RndmCodeGuy20
 */

class Emp {

    String name, type;
    int perks, id = 0;

    Emp(String id, String name, String type) {
        this.id = Integer.valueOf(id);
        this.name = name;
        this.type = type;
    }

    void calcPerk() {
        if (type.toLowerCase().equals("P")) {
            perks += 5000;
        } else if (type.equals("A")) {
            perks += 1000;
        }
    }
}

class sortById implements Comparator<Emp> {
    public int compare(Emp a, Emp b) {
        return a.id - b.id;
    }
}

public class EmpSal {

    public static void printFileContent(String fileAddress) throws Exception {
        FileReader fRead = new FileReader(fileAddress);
        BufferedReader bRead = new BufferedReader(fRead);

        String s;
        while ((s = bRead.readLine()) != null) {
            System.out.println(s);
        }
        System.out.println();
        bRead.close();
    }

    public static void main(String[] args) throws Exception {

        ArrayList<Emp> aList = new ArrayList<Emp>();

        FileReader fRead = new FileReader("Emp.txt");
        BufferedReader bRead = new BufferedReader(fRead);

        System.out.println("\nPrevious records : \n");
        EmpSal.printFileContent("Emp.txt");

        String s;
        while ((s = bRead.readLine()) != null) {
            String arr[] = s.split(" ");
            Emp e = new Emp(arr[0], arr[1], arr[2]);
            e.calcPerk();
            aList.add(e);
        }
        bRead.close();

        Collections.sort(aList, new sortById());
        FileWriter fWrite = new FileWriter("Employee.txt");

        fWrite.write("ID\tName\tType\tPerks\n");
        for (Emp i : aList) {
            fWrite.write(i.id + "\t" + i.name + "\t" + i.type + "\t" + i.perks + "\n");
        }
        
        fWrite.close();

        System.out.println("New records : \n");
        EmpSal.printFileContent("Employee.txt");
    }
}
/*
    *OUTPUT
PS D:\OOPSLab> javac .\EmpSal.java
PS D:\OOPSLab> java EmpSal        

Previous records :

85 Michael P
86 Dwight A
87 Jim A
88 Pam P
89 Ryan A

New records : 

ID      Name    Type    Perks
85      Michael P       5000
86      Dwight  A       1000
87      Jim     A       1000
88      Pam     P       5000
89      Ryan    A       1000
*/