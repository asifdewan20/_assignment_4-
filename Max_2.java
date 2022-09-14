//6.Find out the maximum value between two integer numbers, three integer
//numbers and two double numbers.

import java.util.Scanner;
public class Max_2 {
    public static int max(int a, int b) {
        int max;
        if (a > b)
            max = a;
        else
            max = b;
        return max;
    }
    public static int max(int a, int b, int c) {
        int max;
        if (a > b && a > c)
            max = a;
        else if (b > a && b > c)
            max = b;
        else
            max = c;
        return max;
    }
    public static double max(double a, double b) {
        double max;
        if (a > b)
            max = a;
        else
            max = b;
        return max;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter two integer numbers ");
        int two = max(input.nextInt(), input.nextInt());
        System.out.println("Maximum between two integer number : " + two);
        System.out.println("Enter three integer numbers");
        int three = max(input.nextInt(), input.nextInt(), input.nextInt());
        System.out.println("Maximum between three integer number : " + three);
        System.out.println("Enter two float numbers ");
        double twice = max(input.nextDouble(), input.nextDouble());
        System.out.println("Maximum between two float number : " + twice);
    }
}


