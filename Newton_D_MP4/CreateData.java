/**
 * Name: Divi Newton
 * Student ID: 2440117
 * Chapman Email: dnewton@chapman.edu
 * Course number and section: CPSC-231-02
 * Assignment or exercise number: MP4: File Matching
 */

import java.io.IOException; // imports IO Exception
import java.io.FileWriter; // imports File Writer

// Public class for creating default files and testing file match capabilities.
public class CreateData {
    public static void main(String[] args) throws IOException {
        // creates new file named trans.txt
        FileWriter writeTrans = new FileWriter("trans.txt");

        // writes given data into the file, closes it, and prints a consol message
        writeTrans.write(100 + " " + 27.14 + "\n" + 300 + " " + 62.11 + "\n" + 400 + " " + 100.56 + "\n" + 900 + " " + 82.17);
        writeTrans.close();
        System.out.println("Created trans.txt file with pre-filled information.");

        // creates new file named oldmast.txt
        FileWriter writeMast = new FileWriter("oldmast.txt");

        // writes given data into the file, closes it, and prints a consol message
        writeMast.write(100 + " Alan Jones " + 348.17 + "\n" + 300 + " Mary Smith " + 27.19 + "\n" + 500 + " Sam Sharp " + 0.00 + "\n" + 700 + " Suzy Green " + -14.22);
        writeMast.close();
        System.out.println("Created oldmast.txt file with pre-filled information.");

        // creates new instance of filematch and uses it to compare the two files and make newmast and log files
        new FileMatch().compareFiles();
        System.out.println("Compaired files and created newmast.txt and log.txt.");
    }
}