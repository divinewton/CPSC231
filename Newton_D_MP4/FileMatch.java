/**
 * Name: Divi Newton
 * Student ID: 2440117
 * Chapman Email: dnewton@chapman.edu
 * Course number and section: CPSC-231-02
 * Assignment or exercise number: MP4: File Matching
 */

import java.io.IOException;  // imports IO Exception
import java.io.FileInputStream; // imports file input stream
import java.util.Scanner; // imports scanner
import java.util.ArrayList; // imports array list
import java.io.FileWriter; // imports file writer

// Public class for comparing files and writing new files.
public class FileMatch {
    ArrayList<Account> list;
    ArrayList<TransactionRecord> record;

    // initializes the class and reads oldmast and trans files
    public FileMatch() throws IOException {
        this.list = readOldMast();
        this.record = readTrans();
    }

    // reads oldmast file and returns the contents as an arraylist of account objects
    public ArrayList<Account> readOldMast() throws IOException {
        FileInputStream fileStream = new FileInputStream("oldmast.txt");
        Scanner fileScanner = new Scanner(fileStream);
        ArrayList<Account> list = new ArrayList<>();
        while (fileScanner.hasNext()) {
            int accountNum = fileScanner.nextInt();
            String firstName = fileScanner.next();
            String lastName = fileScanner.next();
            double balance = fileScanner.nextDouble();
            Account account = new Account(accountNum, firstName, lastName, balance);
            list.add(account);
        }
        fileScanner.close();
        return list;
    }

    // reads trans file and returns the contents as an arraylist of transaction record objects
    public ArrayList<TransactionRecord> readTrans() throws IOException {
        FileInputStream fileStream = new FileInputStream("trans.txt");
        Scanner fileScanner = new Scanner(fileStream);
        ArrayList<TransactionRecord> list = new ArrayList<>();
        while (fileScanner.hasNext()) {
            int accountNum = fileScanner.nextInt();
            double transAmount = fileScanner.nextDouble();
            TransactionRecord record = new TransactionRecord(accountNum, transAmount);
            list.add(record);
        }
        fileScanner.close();
        return list;
    }

    // iterates through the two files to find matched and calls methods to write new files
    public void compareFiles() {
        try {
            for (Account account : this.list) {
                boolean found = false;
                for (TransactionRecord transaction : this.record) {
                    if (account.getAccountNumber() == transaction.getAccountNumber()) {
                        account.setBalance(account.combine(transaction));
                        writeNewMast(account);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    writeNewMast(account);
                }
            }
            for (TransactionRecord transaction : this.record) {
                boolean found = false;
                for (Account account : this.list) {
                    if (account.getAccountNumber() == transaction.getAccountNumber()) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    writeLog(transaction.getAccountNumber());
                }
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }

    // writes newmast file containing updated account information
    public void writeNewMast(Account updatedAccount) throws IOException {
        try {
            FileWriter myWriter = new FileWriter("newmast.txt", true);
            myWriter.write(updatedAccount.getAccountNumber() + " " + updatedAccount.getFirstName() + " " + updatedAccount.getLastName() + " " + updatedAccount.getBalance() + "\n");
            myWriter.close();
        } catch (IOException e) {
            e.getMessage();
        }
    }

    // writes log file containing unmatched transaction errors
    public void writeLog(int accountNumber) throws IOException {
        try {
            FileWriter myWriter = new FileWriter("log.txt", true);
            myWriter.write("Unmatched transaction record for account number " + accountNumber + ".\n");
            myWriter.close();
        } catch (IOException e) {
            e.getMessage();
        }
    }
}