//1. Make a simple calculator using four methods (addition, subtraction, multiplication
//and division). Each Method will receive the arguments and will return the
//result. [Non-Static Method]

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int a, b;
        Calculator obj = new Calculator();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        a = input.nextInt();
        b = input.nextInt();
        System.out.println("Summation = " + obj.add(a, b));
        System.out.println("Subtraction = " + obj.sub(a, b));
        System.out.println("Multiplication = " + obj.mul(a, b));
        System.out.println("Division = " + obj.div(a, b));
    }
    public int add(int a, int b) {
        int r;
        r = (a + b);
        return r;
    }
    public int sub(int a, int b) {
        int r;
        r = (a - b);
        return r;
    }
    public int mul(int a, int b) {
        int r;
        r = (a * b);
        return r;
    }
    public int div(int a, int b) {
        int r;
        r = (a / b);
        return r;
    }
}


