import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class LabProgram {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);

      // Import file name
      String inputFileName;

      // For file reading or writing
      FileInputStream fileStream = null;
      Scanner fileScanner = null;

      // Read file name from keyboard
      inputFileName = scnr.next();

      // open the file
      fileStream = new FileInputStream(inputFileName);
      fileScanner = new Scanner(fileStream);

      // Edit strings and print
      while (fileScanner.hasNext()) {
         String newString = fileScanner.next().replace("_photo.jpg", "_info.txt");
         System.out.printf(newString + "\n");
     }

     // Closes scanners
     fileStream.close();
     scnr.close();
     fileScanner.close();
   }
}