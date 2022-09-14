//7.Create a class to print an integer and a character with two methods having the
//same name but different sequence of the integer and the character parameters

import java.util.Scanner;
public class Overloading_ {

        public static void main(String args[]) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a character : ");
            char c=input.next().charAt(0);
            System.out.print("Enter a integer number : ");
            int n=input.nextInt();

        }
        private static void form(int a, char b) {
            System.out.println("1st Sequence : \ninteger number is "+a+" and character is "+b);
        }
        private static void form(char b, int a) {
            System.out.println("2nd Sequence : \ncharacter is "+b+" and integer number is "+a);
        }
    }

