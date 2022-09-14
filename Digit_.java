//5.Write a static method named lastDigit that returns the last digit of an integer.

import java.util.Scanner;
public class Digit_ {
        public static int lastDigit(int num) {
            return num % 10;
        }
        public static void main(String[] args) {
            Scanner data = new Scanner(System.in);
            System.out.println("Enter integer number : ");
            int result = lastDigit(data.nextInt());
            System.out.println(result + " is the Last Digit");
        }
    }

