import java.io.IOException;
import java.io.FileInputStream;
import java.util.Scanner;

public class ReadTextFile {
    public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);

        // Input file name
        String inputFileName;

        // This is for file input
        String fileRecord;
        FileInputStream fileStream = null;
        Scanner fileScanner = null;

        // Get the file name from keyboard
        inputFileName = scnr.next();

        // Open the input file
        fileStream = new FileInputStream(inputFileName);
        fileScanner = new Scanner(fileStream);

        // Read each line from the file
        while (fileScanner.hasNext()) {
            System.out.printf("%-10d%-12s%-12s%10.2f%n", fileScanner.nextInt(), fileScanner.next(), fileScanner.next(), fileScanner.nextDouble());
        }

        fileStream.close();
    }
}
