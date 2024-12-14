/**
 * Name: Divi Newton
 * Student ID: 2440117
 * Chapman Email: dnewton@chapman.edu
 * Course number and section: CPSC-231-02
 * Assignment or exercise number: MP4: File Matching
 */

// TransactionRecord class for storing transaction records as objects.
public class TransactionRecord {
    private int accountNumber;
    private double transAmount;

    // initializes a transaction with default values
    public TransactionRecord() {
        this.accountNumber = 0;
        this.transAmount = 0.0;
    }

    // initializes a transaction with provided values
    public TransactionRecord(int accountNumber, double transAmount) {
        this.accountNumber = accountNumber;
        this.transAmount = transAmount;
    }

    // get account number
    public int getAccountNumber() {return accountNumber;}

    // set account number
    public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

    // get transaction amount
    public double getTransAmount() {return transAmount;}

    // set transaction amount
    public void setTransAmount(double transAmount) {
        this.transAmount = transAmount;
    }
}