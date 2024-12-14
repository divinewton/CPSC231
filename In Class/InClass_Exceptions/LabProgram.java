/* 
Name: Divi Newton
Student ID: 2440117
Chapman Email: dnewton@chapman.edu
Course number and section: CPSC-231-02
Assignment: In Class - Exceptions
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userNum;
      int divNum;
      int result;

      try {
         userNum = scnr.nextInt();
         divNum = scnr.nextInt();
         result = userNum / divNum;
         System.out.println(result);
      }
      catch (ArithmeticException e) {
         System.out.println("Arithmetic Exception: " + e.getMessage());
      }
      catch (InputMismatchException e) {
         System.out.println("Input Mismatch Exception: " + e.toString());
      }
      scnr.close();
   }
}